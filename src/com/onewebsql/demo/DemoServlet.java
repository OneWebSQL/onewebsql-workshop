package com.onewebsql.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.onewebsql.dao.monitors.PrintStreamDaoMonitor;
import com.onewebsql.demo.or.Author;
import com.onewebsql.demo.or.AuthorDAO;
import com.onewebsql.demo.or.AuthorDAOImpl;
import com.onewebsql.demo.or.Book;
import com.onewebsql.demo.or.BookDAO;
import com.onewebsql.demo.or.BookDAOImpl;
import com.onewebsql.query.DBAdapter;
import com.onewebsql.query.adapter.PostgresDBAdapter;

public class DemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		writePageHeader(writer);

		DataSource demoDS = getDataSource();
		DBAdapter dbAdapter = new PostgresDBAdapter();

		/* 
		 * Write your code here.

		exercise1(writer, demoDS, dbAdapter);
		
		*/

		writePageFooter(writer);
		writer.close();
	}

	private void exercise1(PrintWriter writer, DataSource demoDS,
			DBAdapter dbAdapter) {
		BookDAO bookDAO = new BookDAOImpl(demoDS, dbAdapter, new PrintStreamDaoMonitor(System.out));

		writeTableHeader(writer, "Books", "Id", "Title", "Publication year", "Number of pages");
		for (Book book : bookDAO.getBookList()) {
			writeTableRow(writer, book.getBookId(), book.getTitle(), book.getPublicationYear(), book.getNumberOfPages());
		}
		writeTableFooter(writer);
	}
	
	/*
	 * Write your exercises here. Write every exercise in a different method.
	 */

	private void addAuthor(PrintWriter writer, HttpServletRequest req,
			DataSource demoDS, DBAdapter dbAdapter) {
		/*
		 * Write your code here.
		 */
	}

	private void saveAuthor(PrintWriter writer, HttpServletRequest req,
			DataSource demoDS, DBAdapter dbAdapter) {
		/*
		 * Write your code here.
		 */
	}

	private void deleteAuthor(PrintWriter writer, HttpServletRequest req,
			DataSource demoDS, DBAdapter dbAdapter) {
		/*
		 * Write your code here.
		 */
	}

	/* *****************************************************************************
	 * 
	 * Support methods
	 * 
	 * **************************************************************************
	 * **
	 */

	@SuppressWarnings("unused")
	private void dispatchRequest(PrintWriter writer, HttpServletRequest req,
			DataSource demoDS, DBAdapter dbAdapter) {
		if ("show_edit_form".equals(req.getParameter("op"))) {
			int id = Integer.parseInt(req.getParameter("id"));
			writeEditForm(writer, demoDS, dbAdapter, id);

			return;
		}
		writeAddForm(writer);
		if ("do_author_add".equals(req.getParameter("op"))) {
			addAuthor(writer, req, demoDS, dbAdapter);
		} else {
			if ("do_author_edit".equals(req.getParameter("op"))) {
				saveAuthor(writer, req, demoDS, dbAdapter);
			} else {
				if ("do_author_delete".equals(req.getParameter("op"))) {
					deleteAuthor(writer, req, demoDS, dbAdapter);
				}
			}
		}
		writeAuthorList(writer, demoDS, dbAdapter);
	}

	private void writeTableHeader(PrintWriter writer, String title,
			String... columns) {
		writer.println("<h4>" + title + "</h4>");
		writer.println("<table>");
		writer.print("<tr>");
		for (String c : columns) {
			writer.print("<th>" + c + "</th>");
		}
		writer.println("</tr>");
	}

	private void writeTableFooter(PrintWriter writer) {
		writer.println("</table>");
	}

	private void writeTableRow(PrintWriter writer, Object... values) {
		writer.print("<tr>");
		for (Object c : values) {
			writer.print("<td>" + c + "</td>");
		}
		writer.println("</tr>");
	}

	private DataSource getDataSource() throws ServletException {
		DataSource dataSource = null;
		try {
			InitialContext ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/DemoDS");
		} catch (NamingException e) {
			throw new ServletException(e);
		}
		return dataSource;
	}


	private void writePageHeader(PrintWriter writer) {
		writer.println("<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
		writer.println("<html>");
		writer.println("<link rel='icon' type='image/png' href='/onewebsql/favicon.png' />");
		writer.println("<link rel='stylesheet' type='text/css' href='/onewebsql/reset.css' />");
		writer.println("<link rel='stylesheet' type='text/css' href='/onewebsql/demo.css' />");
		writer.println("<head><title>OneWeb SQL Demo</title></html>");
		writer.println("<body>");
		writer.println("<div class='header'>");
		writer.println("<h1><a href='/onewebsql/onewebsql/'><img alt='OneWeb SQL' src='/onewebsql/onewebsql_logo.png' width='40%'></a></h1>");
		writer.println("<h2 class='gray'>Demo application</h2>");
		writer.println("</div>");
	}

	private void writePageFooter(PrintWriter writer) {
		writer.println("</body>");
		writer.println("</html>");
	}

	private void writeAddForm(PrintWriter writer) {
		writer.println("<h4>Add author</h4>");
		writer.println("<form id='add_author' name='add_author' action='/onewebsql/onewebsql?' method='get'>");
		writer.println("<input type='hidden' name='op' value='do_author_add'>");

		// author name
		writer.println("<div class='form_row'>");
		writer.println("<span class='label'>Author name:</span>");
		writer.println("<input type='text' name='name'>");
		writer.println("</div>");

		writer.println("<input type='submit' value='Add' class='btn input_submit'>");
		writer.println("</form>");
	}

	private void writeEditForm(PrintWriter writer, DataSource demoDS,
			DBAdapter dbAdapter, int id) {
		AuthorDAO authorDAO = new AuthorDAOImpl(demoDS, dbAdapter);
		Author author = authorDAO.getByPK(id);

		writer.println("<form id='edit_author' name=\"edit_author\" action=\"/onewebsql/onewebsql?\" method=\"get\">");
		writer.println("<input type='hidden' name='op' value='do_author_edit'>");
		writer.println("<input type='hidden' name='id' value='"
				+ author.getAuthorId() + "'>");

		// id
		writer.println("<div class='form_row'>");
		writer.println("<span class='label'>Id:</span>");
		writer.println(author.getAuthorId());
		writer.println("</div>");

		// author name
		writer.println("<div class='form_row'>");
		writer.println("<span class='label'>Author name:</span>");
		writer.println("<input type='text' name='name' value='"
				+ author.getName() + "'>");
		writer.println("</div>");

		writer.println("<input type='submit' value='Save' class='btn input_submit'>");
		writer.println(button("/onewebsql/onewebsql/", "Cancel"));
		writer.println("</form>");
	}

	private void writeAuthorList(PrintWriter writer, DataSource demoDS,
			DBAdapter dbAdapter) {
		AuthorDAO authorDAO = new AuthorDAOImpl(demoDS, dbAdapter);

		writeTableHeader(writer, "Authors", "Id", "Name", "Actions");
		for (Author author : authorDAO.getAuthorList()) {
			writeTableRow(
					writer,
					author.getAuthorId(),
					author.getName(),
					button("/onewebsql/onewebsql?op=show_edit_form&id="
							+ author.getAuthorId(), "Edit")
							+ " "
							+ button("/onewebsql/onewebsql?op=do_author_delete&id="
									+ author.getAuthorId(), "Delete"));
		}
		writeTableFooter(writer);
	}

	private String button(String href, String label) {
		return "<a class='btn' href='" + href + "'>" + label + "</a>";
	}

}
