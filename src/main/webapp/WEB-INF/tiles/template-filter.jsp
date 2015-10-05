<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Default tiles template</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<body>
    <div class="page">
        <tiles:insertAttribute name="header" />
        <div class="content">
            <tiles:insertAttribute name="menu" />
             <tiles:insertAttribute name="filter" />
            <tiles:insertAttribute name="body" />
        </div>
       <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>




