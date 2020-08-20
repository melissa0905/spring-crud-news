<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<style type="text/css">
	</style>
	
    	<meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
    
  				<c:import url="/nav"></c:import>
  
<br>
    	<div class="container">
    	
			<h2>Son Haberler ve Duyurular </h2>
			<div class="row">
			
		
		  <c:if test="${ not empty data }">
		  	<c:forEach items="${ data }" var="item">
			   
			       <div class="col-md-6">		
					<a onclick="tıkla()" href='<s:url value="/Detail/${item.link}"></s:url>' class="btn btn-danger">Detay</a>
           		 </div>

            <div class="col-md-4 px-3">
              <div class="card-body">
                <a style="text-decoration: none; " href="#"><h1 style="font-size: 30px;" class="card-title text-dark">${item.hbaslik}
                </h1></a>
                <p class="card-text">${item.detay}</p>

                <div class="media">
                  <a class="btn btn-primary" href='<s:url value="/Detail/${item.id}"></s:url>' role="button">Devamını Oku</a>
              
           
                
                </div>
                
              </div>
            </div>
			   
			   
		
			   
			</c:forEach>
		  </c:if>
		 
		
	</div>
	<hr>
	
	<div class="row">
	
	 <div class="col-md-12 d-sm-none d-none d-lg-block">
        <a onclick()="tıkla()" href=href='<s:url value="/duyuru/${item.link}"></s:url>'><img class="img-fluid" src='<s:url value="/resources/duyuru1.jpg"></s:url>'></a>
    
      </div>
	</div>
			
			
        </div>
       
	</body>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

	<script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
</html>
© 2020 GitHub, Inc.