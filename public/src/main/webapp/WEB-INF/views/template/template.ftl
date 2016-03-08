<#macro mainTemplate title="Watches an E-Commerce online Shopping Category | Home" styles=[] scripts=[] headerBannerClass="banner" >
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <title>${title}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates,
    Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG,
    SonyErricsson, Motorola web design" />
    <script type="application/x-javascript">
        addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
        function hideURLbar(){ window.scrollTo(0,1); }
    </script>
    <link rel="shortcut icon" href="/resources/images/ico/favicon.ico" />
    <link href="/resources/css/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Custom Theme files -->
    <link href="/resources/css/style.css" rel='stylesheet' type='text/css' />
    <!-- Custom Theme files -->
    <!--webfont-->
    <link href='//fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Dorsa' rel='stylesheet' type='text/css'>
    <#list styles as css>
        <link rel="stylesheet" href="/resources/${css}" type="text/css" />
    </#list>

    <script type="text/javascript" src="/resources/js/jquery-1.11.1.min.js"></script>
    <!-- start menu -->
    <link href="/resources/css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="/resources/js/megamenu.js"></script>
    <script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
    <script src="/resources/js/jquery.easydropdown.js"></script>
    <script src="/resources/js/simpleCart.min.js"> </script>
    <#list scripts as js>
        <script src="/resources/${js}" type="text/javascript" defer></script>
    </#list>
</head>
<body>
    <#include "components/header.ftl" />
    <@m_body />
    <#include "components/footer.ftl" />
</body>
</html>
</#macro>