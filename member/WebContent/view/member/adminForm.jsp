<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>��������</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/member/searchAllMembers.do"  
            name="frmAdmin">
        <fieldset>
        <legend>ȸ������</legend>
        <table>
            <tr>
                <td>��üȸ�� ��Ϻ��� </td>
                <td>
                    <!-- <input type="text" id="id" name="id" placeholder="ID �Է�" /> -->
                </td>
            </tr>
            <tr>
                <td>ID �� ȸ���˻�</td>
                <td>
                    <!-- <input type="text" id="password" name="password" /> -->
                </td>
            </tr>
        
            <tr>
                <td>�̸����� ȸ���˻�(�������� ���)</td>
                <td>
                    <!-- <input type="text" id="password" name="password" /> -->
                </td>
            </tr>
                <tr>
                <td>ȸ�� ����</td>
                <td>
                    <!-- <input type="text" id="password" name="password" /> -->
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="�� ��" /> 
                    
                </td>
            </tr>
        </table>
        </fieldset>
    </form>
</body>
</html>