<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePersonneProxyid" scope="session" class="com.m2i.formation.PersonneProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePersonneProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePersonneProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePersonneProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.m2i.formation.Personne getPersonne10mtemp = samplePersonneProxyid.getPersonne();
if(getPersonne10mtemp == null){
%>
<%=getPersonne10mtemp %>
<%
}else{
        if(getPersonne10mtemp!= null){
        String tempreturnp11 = getPersonne10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String who_1id=  request.getParameter("who16");
            java.lang.String who_1idTemp = null;
        if(!who_1id.equals("")){
         who_1idTemp  = who_1id;
        }
        String taille_2id=  request.getParameter("taille18");
        double taille_2idTemp  = Double.parseDouble(taille_2id);
        double poidsIdealH13mtemp = samplePersonneProxyid.poidsIdealH(who_1idTemp,taille_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(poidsIdealH13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String who_3id=  request.getParameter("who23");
            java.lang.String who_3idTemp = null;
        if(!who_3id.equals("")){
         who_3idTemp  = who_3id;
        }
        String taille_4id=  request.getParameter("taille25");
        double taille_4idTemp  = Double.parseDouble(taille_4id);
        double poidsIdealF20mtemp = samplePersonneProxyid.poidsIdealF(who_3idTemp,taille_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(poidsIdealF20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>