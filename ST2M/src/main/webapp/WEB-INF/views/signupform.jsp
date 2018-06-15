<!-- 회원가입 폼 -->
<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>회원가입</title>
        <!-- 합쳐지고 최소화된 최신 CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- 부가적인 테마 -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

        <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <article class="container">
            <div class="page-header">
                <h1>회원가입 <small>ST2M</small></h1>
            </div>
            
            
            
            
            <form:form modelAttribute="infoVO" action="getinfo" method="POST">
    <p>
        값1<br/>
        <form:input path="name"/>
    </p>
    <p>
        값2<br/>
        <form:input path="password"/>
    </p>
    <p>
        <input type="submit" value="Submit">
    </p>
</form:form>





            <div class="col-md-6 col-md-offset-3">
                <form role="form" modelAttribute="infoVO" action="getinfo" method="POST">
                    <div class="form-group">
                        <label for="InputName">성함</label>
                        <input path="name" name="name" type="textbox" class="form-control" id="InputName" placeholder="성함">
                    </div>
                    <div class="form-group">
                        <label for="InputEmail">이메일 주소(ID)</label>
                        <input name="email" type="email" class="form-control" id="InputEmail" placeholder="이메일 주소(ID)">
                    </div>
                    <div class="form-group">
                        <label for="InputPassword1">비밀번호</label>
                        <input path=password name="password" type="password" class="form-control" id="InputPassword1" placeholder="비밀번호">
                    </div>
                    <div class="form-group">
                        <label for="InputPassword2">비밀번호 확인</label>
                        <input type="password" class="form-control" id="InputPassword2" placeholder="비밀번호 확인">
                        <p class="help-block">비밀번호 확인을 위해 다시한번 입력 해 주세요</p>
                    </div>
                    <div class="form-group">
                        <label for="InputBirthday">생일</label>
                        <input name="birth" type="date" class="form-control" id="InputBirthday" placeholder="생년월일">
                    </div>
                    <div class="form-group">
                        <label for="InputAddress">주소</label>
                        <input name="address" type="textbox" class="form-control" id="InputAddress" placeholder="자택 주소">
                    </div>
                    <div class="form-group">
                        <label for="InputPhoneNum">주소</label>
                        <input name="pNum" type="tel" class="form-control" id="InputPhoneNum" placeholder="휴대폰 번호 : - 없이 입력해 주세요!">
                    </div>
                    <label for="InputAuthority">구분</label>
                    <div class="radio">
                        <label class="primary">
                            <input name="auth" type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                            교육자(선생님)
                        </label>
                    
                        <label>
                            <input  type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                            학습자(학생)
                        </label>
                    
                        <label>
                            <input type="radio" name="optionsRadios" id="optionsRadios3" value="option3">
                            일반
                        </label>
                    </div>
                    <div class="form-group text-center">
                        <button type="submit" class="btn btn-info" value="Submit">회원가입</button>
                        <button type="submit" class="btn btn-warning">가입취소</button>
                    </div>
                <form>
            </div>
        </article>
    </body>
</html>