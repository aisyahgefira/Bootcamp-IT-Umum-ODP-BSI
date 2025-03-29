<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>uploadFile</name>
   <tag></tag>
   <elementGuidId>50332d8f-11a5-4025-848b-1b633d14cf9f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;additionalMetadata&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;string&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;file&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;file&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>7ba5c7e5-1174-418a-809d-fc537c2ad5f1</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>multipart/form-data</value>
      <webElementGuid>c40b93f6-17b2-4077-911e-14115bc57c48</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.1.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path>/pet/{petId}/uploadImage</path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://petstore.swagger.io/v2/pet/${petId}${/uploadImage}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>35383a0b-0bea-4a3d-b58a-88638ef291fe</id>
      <masked>false</masked>
      <name>petId</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
