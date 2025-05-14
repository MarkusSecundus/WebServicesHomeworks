<?xml version="1.0"?>

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
>

<xsl:template match="/">
@prefix foaf: &lt;http://xmlns.com/foaf/0.1/&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix pext: &lt;http://www.ontotext.com/proton/protonext#&gt; .
@prefix geo: &lt;http://www.w3.org/2003/01/geo/wgs84_pos#&gt; .
@prefix gn: &lt;https://www.geonames.org/ontology#&gt; .

@prefix scam: &lt;http://tut01/&gt; .

scam:PhoneNumber_<xsl:value-of select="//phoneNumber" />      a               scam:PhoneNumberRecord ;
                 scam:phoneNumber               &lt;tel+<xsl:value-of select="//phoneNumber" />&gt;  ;    
                 scam:ownerName                 "<xsl:value-of select="//userName" />"@en            ;    
                 scam:countryCode               "<xsl:value-of select="//countryCode" />"            ;    
                 scam:approximateLongitude      <xsl:value-of select="//approximateLongitude" />     ;    
                 scam:approximateLatitude       <xsl:value-of select="//approximateLattitude" />     ;    
                 scam:approximateYearlyIncome   _:money1                                             ;    
                 scam:approximateAge            <xsl:value-of select="//approximateAge" />          .

<!-- 
    V dokumentaci http://www.ontotext.com/proton/protonext.html#anchor-1032393414 
    jsem nikde nebyl schopný dohledat žádný vztah, co by popisoval množství peněz v pext:Money
    (ale každý příčetný člověk by snad předpokládal, že bude existovat nějaký vztah pojmenovaný nějak jako `hasAmount`, co asociuje pext:Money s číselným literálem)
-->
_:money1 a pext:Money ;
        pext:hasUnit  pext:Currency:USD ;
        pext:hasAmount   <xsl:value-of select="//approximateYearlyIncomeInUSD"/> .

</xsl:template>

</xsl:stylesheet> 