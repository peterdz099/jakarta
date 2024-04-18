package com.example.jakartapersistencedemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import employee.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {


//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String idParam = request.getParameter("id");
//        if (idParam != null) {
//            int id = Integer.parseInt(idParam);
//
//            Employee employee = employees.get(id); !!!!!
//
//            if (employee != null) {
//                PrintWriter out = response.getWriter();
//                response.setContentType("text/html");
//                out.println("<h1>Employee Details</h1>");
//                out.println("<p>ID: " + employee.getId() + "</p>");
//                out.println("<p>First Name: " + employee.getFirstName() + "</p>");
//                out.println("<p>Last Name: " + employee.getLastName() + "</p>");
//                out.println("<p>Position: " + employee.getPosition() + "</p>");
//            } else {
//                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Employee not found");
//            }
//        } else {
//            PrintWriter out = response.getWriter();
//            response.setContentType("text/html");
//            out.println("<h1>All Employees</h1>");
//            out.println("<ul>");
//
//            //here employee list
//
//            for (Employee employee : !!!!employee list here) {
//                out.println("<li>ID: " + employee.getId() + ", Name: " + employee.getFirstName() + " " + employee.getLastName() + "</li>");
//            }
//            out.println("</ul>");
//        }
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idParam = Integer.parseInt(request.getParameter("id"));
        String _method = request.getParameter("_method");
        if(_method != null && _method.equals("put")){
            doPut(request, response);
        }else{
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String position = request.getParameter("position");

            Employee employee = new Employee();
            employee.setId(idParam);
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setPosition(position);

            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            entityManager.close();

            response.sendRedirect(request.getContextPath());
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String position = request.getParameter("position");


//        Employee employee = employees.get(id);
//        if (employee != null) {
//            employee.setFirstName(firstName);
//            employee.setLastName(lastName);
//            employee.setPosition(position);
//
//            response.sendRedirect(request.getContextPath());
//        } else {
//            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Employee not found");
//        }
    }
}