package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet("/jsp/contact")
public class Contact extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String company = request.getParameter("company");
        String mail = request.getParameter("mail");
        String review = request.getParameter("review");
        String[] mailmg = request.getParameterValues("mailmg");
        String present = request.getParameter("present");

        Page.header(out);
        out.println("<p>氏名:<br>" + name + "</p>");
        out.println("<p>会社:<br>" + company + "</p>");
        out.println("<p>メールアドレス:<br>" + mail + "</p>");
        out.println("<p>お問い合わせ内容:<br>" + review + "</p>");
        out.println("<p>=＝メルマガ＝=</p>");
        if (mailmg != null) {
            for (String item : mailmg) {
                out.println("<p>「" + item + "」</p>");
            }
            out.println("<p>以上の情報をお送りします。</p>");
        } else {
            out.println("<p>メールマガジンは配信しません。</p>");
        }
        out.println("<p>=＝資料請求＝=</p>");
        if(present != null) {
        	if(present.equals("Yes")) {
        		out.println("この度は資料請求ありがとうございます。以下のリンクからダウンロードが可能です。<br>http://localhost:8080/ServletTest/jsp/contact/Dummy");
        	}else {
        		out.println("資料はお送りしません。");
        	}
        }
        Page.footer(out);
        }
}
