<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:local="urn:local-functions"
	xmlns="urn:ns:cdm:reisinformatie:data:vi:1"
	xpath-default-namespace="urn:ns:cdm:reisinformatie:data:vi:1"
	exclude-result-prefixes="#all"
	version="2.0"
	>

	<xsl:output omit-xml-declaration="yes" indent="no"/>
	<xsl:strip-space elements="*"/>
	
	<xsl:variable name="english2DutchMap">
		<entry key="monday">maandag</entry>
		<entry key="tuesday">dinsdag</entry>
		<entry key="wednesday">woensdag</entry>
		<entry key="thursday">donderdag</entry>
		<entry key="friday">vrijdag</entry>
		<entry key="saturday">zaterdag</entry>
		<entry key="sunday">zondag</entry>
		<entry key="mo">ma</entry>
		<entry key="tu">di</entry>
		<entry key="we">wo</entry>
		<entry key="th">do</entry>
		<entry key="fr">vr</entry>
		<entry key="sa">za</entry>
		<entry key="su">zo</entry>
		<entry key="january">januari</entry>
		<entry key="february">februari</entry>
		<entry key="march">maart</entry>
		<entry key="april">april</entry>
		<entry key="may">mei</entry>
		<entry key="june">juni</entry>
		<entry key="july">juli</entry>
		<entry key="august">augustus</entry>
		<entry key="september">september</entry>
		<entry key="october">oktober</entry>
		<entry key="november">november</entry>
		<entry key="december">december</entry>
	</xsl:variable>
	
	<xsl:template match="Uiting/text()">
		<xsl:call-template name="ReplaceEnglishDate">
			<xsl:with-param name="text" select="."/>
		</xsl:call-template>
	</xsl:template>

	<xsl:template name="ReplaceEnglishDate">
		<xsl:param name="text"/>
		<xsl:choose>
			<xsl:when test="contains($text,'[language: en]') or contains($text,'[Language: en]')">
				<xsl:if test="substring-before($text,'[language: en]')!='' or substring-before($text,'[Language: en]')!=''">
					<xsl:value-of select="if(contains($text,'[language: en]')) then substring-before($text,'[language: en]') else substring-before($text,'[Language: en]')"/>
				</xsl:if>
				<xsl:call-template name="ReplaceEnglishDate">
					<xsl:with-param name="text" select="if(contains($text,'[language: en]')) then substring-after($text,'[language: en]') else substring-after($text,'[Language: en]')"/>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<!-- <xsl:value-of select="$text"/> -->
				<xsl:choose>
					<xsl:when test="matches(.,'.*uur\.?$')">
						<xsl:call-template name="ParseDate">
							<xsl:with-param name="InputString" select="$text"/>
						</xsl:call-template>
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="$text"/>
					</xsl:otherwise>
				</xsl:choose>				
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>	
	
	<xsl:template match="@* | node()">
		<xsl:copy>
			<xsl:apply-templates select="@* | node()"/>
		</xsl:copy>
	</xsl:template>
	
	<xsl:template name="ParseDate">
		<xsl:param name="InputString"/>
		<xsl:variable name="Head" select="substring-before($InputString,' ')"/>
		<xsl:choose>
			<xsl:when test="matches($Head,'^(monday|tuesday|wednesday|thursday|friday|saturday|sunday|mo|tu|we|th|fr|sa|su|january|february|march|april|may|june|july|august|september|october|november|december)$')">
				<xsl:value-of select="$english2DutchMap/entry[@key=$Head]"/>
			</xsl:when>    
			<xsl:otherwise>
				<xsl:value-of select="$Head"/>
			</xsl:otherwise>
		</xsl:choose>    
		<xsl:text> </xsl:text>

		<xsl:variable name="Tail" select="substring-after($InputString,' ')"/>
  
		<xsl:choose>
			<xsl:when test="contains($Tail,' ')">
				<xsl:call-template name="ParseDate">
					<xsl:with-param name="InputString" select="$Tail"/>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$Tail"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
		
</xsl:stylesheet>