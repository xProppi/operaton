<#macro dto_macro docsUrl="">
<#-- Generated From File: operaton-docs-manual/public/reference/rest/job/post-query/index.html -->
<@lib.dto desc = "A Job instance query which defines a list of Job instances">

    <#assign requestMethod="POST">
    <#include "/lib/commons/job-query-params.ftl">
    <@lib.properties params/>    
    "sorting": {
       "type": "array",
       "nullable": true,
       "description": "An array of criteria to sort the result by. Each element of the array is
                       an object that specifies one ordering. The position in the array
                       identifies the rank of an ordering, i.e., whether it is primary, secondary,
                       etc. Does not have an effect for the `count` endpoint.",
       "items":
         <#assign last = true>
         <#include "/lib/commons/sort-props.ftl">
    }

</@lib.dto>
</#macro>