
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<script>
		function tıkla(){
			confirm("Silmek istediğinizden eminmisiniz.");
	
			}
	</script>
    	<meta charset="UTF-8">
        <title>Haber</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
    	<div class="container">
		<div class="row">
			<div class="col-sm-6">
		<h1>Haber Ekle</h1>
		<form action="${ hb !=null ? 'newsEdit' : 'newsInsert' }" method="post">
			<input value="${hb.hbaslik }" name="baslik" type="text" class="form-control" placeholder="Haber Baslik" />
			<br/><input value="${hb.konu }"  name="konu" type="text" required="required" class="form-control" placeholder="Haber Konu" />
			<br/><input value="${hb.hicerik }"  name="icerik" type="text" class="form-control" placeholder="Haber icerik" />
			<br/><input value="${hb.hlink }"  name="link" type="text" class="form-control" placeholder="Haber Url" />
			
			<br/><input type="submit" value="Kaydet" class="btn btn-success" />
		</form>
	</div></div>
		  
		  
	<div class="row">
	
		
			<table class="table table-hover">
		  <thead>
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">Haber Baslik</th>
		      <th scope="col">Haber Konu </th>
		      <th scope="col">Haber İcerik</th>
		      <th scope="col">Haber Linki</th>
		   
		    </tr>
		  </thead>
		  <tbody>
		  
		  <c:if test="${ not empty data }">
		  	<c:forEach items="${ data }" var="item">
			    <tr>
			      <th scope="row">${item.id }</th>
			      <td>${item.baslik }</td>
			 
			      <td>
			 			${item.detay }
			      </td>
			      <td>
						<a onclick="tıkla()" href='<s:url value="/delete/${item.id}"></s:url>' class="btn btn-danger">Sil</a>
					</td>
					  <td>
						<a href='<s:url value="/edit/${item.id}"></s:url>' class="btn btn-info">Güncelle</a>
					</td>
			    </tr>
			</c:forEach>
		  </c:if>
		  </tbody>
		</table>
		
		
	</div>
        </div>
	</body>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
</html>