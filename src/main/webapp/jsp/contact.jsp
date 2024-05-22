<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<link href="../css/content.css" media="all" rel="stylesheet">

<body>
<form action="contact" method="post" text>
<h1>↓お問い合わせはこちら↓</h1>

<section class="section-main">
	氏名<br><input type="text" name="name"><br>
	会社<br><input type="text" name="company"><br>
	メールアドレス<br><input type="text" name="mail"><br>
	お問い合わせ内容<br><textarea name="review" cols="22" rows="5"></textarea><br>
</section>

<section class="section-option">
	＝=メルマガ＝=<br>
		<p><input type="checkbox" name="mailmg" value="総合案内" >総合案内</p>
		<p><input type="checkbox" name="mailmg" value="セミナー案内" >セミナー案内</p>
		<p><input type="checkbox" name="mailmg" value="求人採用" >求人採用</p>
	＝=資料請求＝=<br>
		<input type="radio" name="present" value="Yes" >Yes
		<input type="radio" name="present" value="No" >No
</section>
<section class="section-bottun">
		<p><input type="submit" value="送信"></p>
</section>
</form>
</body>

<%@include file="../footer.html" %>