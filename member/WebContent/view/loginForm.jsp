<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<style>
        @IMPORT url("../../css/model2/kaup.css");
   </style>
 
    <form action="<%=request.getContextPath()%>/model2/login.do" method="post" name="frmLogin">
        <fieldset>
        <legend>�α���</legend>
        <table>
            <tr>
                <td>���̵� </td>
                <td>
                    <input type="text" id="id" name="id" placeholder="ID �Է�" />
                </td>
            </tr>
            <tr>
                <td>��й�ȣ</td>
                <td>
                    <input type="text" id="password" name="password" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <!-- <input type="submit" value="�� ��" /> -->
                    <img src="<%=request.getContextPath()%>/images/btnLogin.jpg"
                         style="cursor: pointer" alt="" onclick="return login()"/>
                </td>
            </tr>
        </table>
        </fieldset>
    </form>
    <div>
        <span>
            <a href="#" onclick="searchId('<%=request.getContextPath()%>/member/searchIdForm.do')">
                ���̵� ã��</a>
        </span>
        <span>
            <a href="#" onclick="searchPass('<%=request.getContextPath()%>/member/searchPassForm.do')">
                ��й�ȣ ã��</a>
        </span>
    </div>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/member.js"></script>