package com.servlet.bootstrap;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
		@WebServlet("/register")
		public class BootstrapServlet extends HttpServlet {     // create the query
    private static final String INSERT_QUERY = "INSERT INTO INNOJC_DATA(Firstname,Lastname,Email,Gender,Adhar,Contact_No,Room_No,Actions) VALUES(?,?,?,?,?,?,?,?)";     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // get PrintWriter
        PrintWriter pw = res.getWriter();
        // set Content type
        res.setContentType("text/hmtl");
        // read the form values
        String Firstname = req.getParameter("Firstname");
        String Lastname = req.getParameter("Lastname");
        String Email = req.getParameter("Email");
        String Gender = req.getParameter("Gender");
        String Adhar = req.getParameter("Adhar");
        String Contact_No = req.getParameter("Contact_No");
        String Room_No = req.getParameter("Room No");
        String Actions = req.getParameter("Actions");         // load the jdbc driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // create the connection
        try (Connection con = DriverManager.getConnection("jdbc:mysql:///venkat_pabbu", "root", "Venkat");
                PreparedStatement ps = con.prepareStatement(INSERT_QUERY);) {
            // set the values
            ps.setString(1, Firstname);
            ps.setString(2, Lastname);
            ps.setString(3, Email);
            ps.setString(4, Gender);
            ps.setString(5, Adhar);
            ps.setString(6, Contact_No);
            ps.setString(7, Room_No);
            ps.setString(8, Actions);             // execute the query
            int count = ps.executeUpdate();             if (count == 0) {
                pw.println("Record not stored into database");
            } else {
                pw.println("Record Stored into Database");
            }
        } catch (SQLException se) {
            pw.println(se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            pw.println(e.getMessage());
            e.printStackTrace();
        }         // close the stream
        pw.close();
    }     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(req, resp);
    } }