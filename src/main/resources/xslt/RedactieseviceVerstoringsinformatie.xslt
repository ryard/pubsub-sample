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

	<!-- 
		|| Project							: NS - ARA PPV IRS RedactieserviceVerstoringsinformatie
		|| Auteur								: Siebe Jongebloed (siebe.jongebloed@elk-it.com) 
		|| Datum								: 2017-01-25 
		|| Algemene opmerkingen	: Deze xslt verrijkt: ReisInformatieProductPatroonInformatieLandelijk (PIS)-,
		||                                            ReisInformatieProductPatroonInformatieTrein (PIT) en   
		||                                            ReisInformatieProductPatroonInformatieStation (PIL)-berichten. 
		||												Het verrijken dient om aanwezige informatie meer tot leesbare informatie samen te stellen.
		||												Dit gebeurt zo goed als altijd twee maal voor elke taal. Een maal in een "Middel"-versie en in een "Lang"-versie.
		||												Omdat daarvoor veelal ook de bronteksten voor aanwezig zijn, wordt door deze hele xslt gebruik gemaakt van modes om op die manier
		||												met weinig extra code aantal aanwezige talen x 2 x bijna het zelfde te doen.
		|| Conventies code			: De namen van gedefinieerde variabele en parameters beginnen met een typering van de variabele, waarbij de volgende afkortingen gelden:
		||												b	: boolean
		||												d	: date
		||												dt: dateTime
		||												i	: integer
		||												ns: nodeSet
		||												s	: string
		||												sq: sequence
		||												tz: timezone
	-->
	
	<xsl:output method="xml" indent="yes"/>

	<xsl:param name="sWriteCompareIds" 			    select="'0'"/>
	<xsl:param name="sIsTest" 							    select="'0'"/>
	<xsl:param name="sTestTargetDir"							/>
  <xsl:variable name="tzCurrentTimeZone" 	    as="xs:dayTimeDuration" 				select="timezone-from-dateTime(xs:dateTime(current-dateTime()))"/>
	<xsl:variable name="sSourceDir"					    as="xs:string"									select="string-join(tokenize(base-uri(.), '/')[not(position()=last())],'/')"/>
	<xsl:variable name="sTargetDir"					    as="xs:string"									select="if(string-length($sTestTargetDir)&gt;0) then $sTestTargetDir else concat($sSourceDir,'/out/')"/>
	<xsl:variable name="sXsltVersion"				    as="xs:string"									select="'1.1.6'"/>
  <xsl:variable name="sPresentatieTypeMiddel" as="xs:string"									select="'Middel'"/>
  <xsl:variable name="sPresentatieTypeLang"	  as="xs:string"									select="'Lang'"/>
  <xsl:variable name="sqPresentatieType"	    as="xs:string+"									select="$sPresentatieTypeMiddel,$sPresentatieTypeLang"/>
	<xsl:variable name="sqTaalCodesMetEn"		    as="xs:string+"									select="'nl','en'"/>
	<xsl:variable name="sqTaalCodes"				    as="xs:string+"									select="'nl'"/>
  <xsl:variable name="bLocalUserSiebe"		    as="xs:boolean"									select="contains(lower-case(system-property('user.name')),'siebe')"/>
	<xsl:variable name="nsRitAdministratie"     as="element(RIPAdministratie)"	select="/*/RIPAdministratie[1]"/>
  <xsl:variable name="bPISg" 							    as="xs:boolean" 								select="local-name(/*/*[2])='ReisInformatieProductPatroonInformatieStation'"/>
  <xsl:variable name="bPILg" 							    as="xs:boolean" 								select="local-name(/*/*[2])='ReisInformatieProductPatroonInformatieLandelijk'"/>
  <xsl:variable name="bPITg" 							    as="xs:boolean" 								select="local-name(/*/*[2])='ReisInformatieProductPatroonInformatieTrein'"/>
	<xsl:variable name="bIsTest"						    as="xs:boolean"									select="contains($sIsTest,'1') 		or contains($sIsTest,'true')"/>
	<xsl:variable name="bWriteCompareIds"		    as="xs:boolean"									select="contains($sWriteCompareIds,'1') 	or contains($sWriteCompareIds,'true')"/>
	<xsl:variable name="sqI18n" 						    as="element(i18n)*">
		<i18n sleutel="en" 									taal="nl" waarde="en"/>
		<i18n sleutel="en" 									taal="en" waarde="and"/>
		
		<i18n sleutel="min." 								taal="nl" waarde="min."/>
		<i18n sleutel="min." 								taal="en" waarde="min."/>
		
		<i18n sleutel="minuten" 						taal="nl" waarde="minuten"/>
		<i18n sleutel="minuten" 						taal="en" waarde="minutes"/>
		
		<i18n sleutel="Tussen" 							taal="nl" waarde="Tussen"/>
		<i18n sleutel="Tussen" 							taal="en" waarde="Between"/>
		
		<i18n sleutel="tussen" 							taal="nl" waarde="tussen"/>
		<i18n sleutel="tussen" 							taal="en" waarde="between"/>
		
		<i18n sleutel="via" 								taal="nl" waarde="via"/>
		<i18n sleutel="via" 								taal="en" waarde="via"/>
		
		<i18n sleutel="Reizigers" 					taal="nl" waarde="Reizigers"/>
		<i18n sleutel="Reizigers" 					taal="en" waarde="Passengers"/>
		
		<i18n sleutel="naar" 								taal="nl" waarde="naar"/>
		<i18n sleutel="naar" 								taal="en" waarde="to"/>
		
		<i18n sleutel="Van" 								taal="nl" waarde="Van"/>
		<i18n sleutel="Van" 								taal="en" waarde="From"/>

	  <i18n sleutel="van" 								taal="nl" waarde="van"/>
		<i18n sleutel="van" 								taal="en" waarde="from"/>
		
		<i18n sleutel="tot" 								taal="nl" waarde="tot"/>
		<i18n sleutel="tot" 								taal="en" waarde="till"/>

		<i18n sleutel="t/m" 								taal="nl" waarde="t/m"/>
		<i18n sleutel="t/m" 								taal="en" waarde="till"/>

		<i18n sleutel="tot en met" 					taal="nl" waarde="tot en met"/>
		<i18n sleutel="tot en met" 					taal="en" waarde="till"/>

	  <i18n sleutel="Van en naar"					taal="nl" waarde="Van en naar"/>
	  <i18n sleutel="Van en naar" 			  taal="en" waarde="Around"/>
	  
	  <i18n sleutel="Vanaf" 							taal="nl" waarde="Vanaf"/>
		<i18n sleutel="Vanaf" 							taal="en" waarde="From"/>
		
		<i18n sleutel="uur" 								taal="nl" waarde="uur"/>
		<i18n sleutel="uur" 								taal="en" waarde=""/>

		<i18n sleutel="MaMiddel" 						taal="nl" waarde="ma"/>
		<i18n sleutel="MaMiddel" 						taal="en" waarde="Mon"/>
		
		<i18n sleutel="DiMiddel" 						taal="nl" waarde="di"/>
		<i18n sleutel="DiMiddel" 						taal="en" waarde="Tue"/>
		
		<i18n sleutel="WoMiddel" 						taal="nl" waarde="wo"/>
		<i18n sleutel="WoMiddel" 						taal="en" waarde="Wen"/>
		
		<i18n sleutel="DoMiddel" 						taal="nl" waarde="do"/>
		<i18n sleutel="DoMiddel" 						taal="en" waarde="Thu"/>
		
		<i18n sleutel="VrMiddel" 						taal="nl" waarde="vr"/>
		<i18n sleutel="VrMiddel" 						taal="en" waarde="Fri"/>
		
		<i18n sleutel="ZaMiddel" 						taal="nl" waarde="za"/>
		<i18n sleutel="ZaMiddel" 						taal="en" waarde="Sat"/>
		
		<i18n sleutel="ZoMiddel" 						taal="nl" waarde="zo"/>
		<i18n sleutel="ZoMiddel" 						taal="en" waarde="Sun"/>
		
		<i18n sleutel="MaLang" 							taal="nl" waarde="maandag"/>
		<i18n sleutel="MaLang" 							taal="en" waarde="Monday"/>
		
		<i18n sleutel="DiLang" 							taal="nl" waarde="dinsdag"/>
		<i18n sleutel="DiLang" 							taal="en" waarde="Tuesday"/>
		
		<i18n sleutel="WoLang" 							taal="nl" waarde="woensdag"/>
		<i18n sleutel="WoLang" 							taal="en" waarde="Wednesday"/>
		
		<i18n sleutel="DoLang" 							taal="nl" waarde="donderdag"/>
		<i18n sleutel="DoLang" 							taal="en" waarde="Thursday"/>
		
		<i18n sleutel="VrLang" 							taal="nl" waarde="vrijdag"/>
		<i18n sleutel="VrLang" 							taal="en" waarde="Friday"/>
		
		<i18n sleutel="ZaLang" 							taal="nl" waarde="zaterdag"/>
		<i18n sleutel="ZaLang" 							taal="en" waarde="Saterday"/>
		
		<i18n sleutel="ZoLang" 							taal="nl" waarde="zondag"/>
		<i18n sleutel="ZoLang" 							taal="en" waarde="Sunday"/>
		
		<i18n sleutel="wekelijks" 					taal="nl" waarde="wekelijks"/>
		<i18n sleutel="wekelijks" 					taal="en" waarde="weekly"/>

		<i18n sleutel="op weekdagen" 				taal="nl" waarde="op weekdagen"/>
		<i18n sleutel="op weekdagen" 				taal="en" waarde="on weekdays"/>
		
		<i18n sleutel="in de weekeinden" 		taal="nl" waarde="in de weekeinden"/>
		<i18n sleutel="in de weekeinden" 		taal="en" waarde="on weekends"/>
		
		<i18n sleutel="U kunt omreizen" 		taal="nl" waarde="U kunt omreizen"/>
		<i18n sleutel="U kunt omreizen" 		taal="en" waarde="You can take a detour"/>

		<i18n sleutel="Extra reistijd" 			taal="nl" waarde="Extra reistijd"/>
		<i18n sleutel="Extra reistijd" 			taal="en" waarde="Extra travel time"/>
		
		<i18n sleutel="Extra reistijd lang" taal="nl" waarde="Houdt u rekening met een langere reistijd"/>
		<i18n sleutel="Extra reistijd lang" taal="en" waarde="Please allow for extra travel time"/>

		<i18n sleutel="is" 									taal="nl" waarde="is"/>
		<i18n sleutel="is" 									taal="en" waarde="is"/>
		
	  <i18n sleutel="Trein" 						  taal="nl" waarde="Trein"/>
	  <i18n sleutel="Trein" 						  taal="en" waarde="Train"/>
	  
	  <i18n sleutel="Treinserie" 					taal="nl" waarde="Treinserie"/>
	  <i18n sleutel="Treinserie" 					taal="en" waarde="Train series"/>
	  
		<i18n sleutel="Geen extra reistijd" taal="nl" waarde="Geen extra reistijd"/>
		<i18n sleutel="Geen extra reistijd" taal="en" waarde="No extra travel time"/>
	  
		<i18n sleutel="Maand01Middel" 			taal="nl" waarde="jan"/>
		<i18n sleutel="Maand01Middel" 			taal="en" waarde="Jan."/>
		
		<i18n sleutel="Maand02Middel" 			taal="nl" waarde="febr"/>
		<i18n sleutel="Maand02Middel" 			taal="en" waarde="Feb."/>

		<i18n sleutel="Maand03Middel" 			taal="nl" waarde="mrt"/>
		<i18n sleutel="Maand03Middel" 			taal="en" waarde="Mar."/>

		<i18n sleutel="Maand04Middel" 			taal="nl" waarde="apr"/>
		<i18n sleutel="Maand04Middel" 			taal="en" waarde="Apr."/>

		<i18n sleutel="Maand05Middel" 			taal="nl" waarde="mei"/>
		<i18n sleutel="Maand05Middel" 			taal="en" waarde="May"/>

		<i18n sleutel="Maand06Middel" 			taal="nl" waarde="juni"/>
		<i18n sleutel="Maand06Middel" 			taal="en" waarde="June"/>

		<i18n sleutel="Maand07Middel" 			taal="nl" waarde="juli"/>
		<i18n sleutel="Maand07Middel" 			taal="en" waarde="July"/>

		<i18n sleutel="Maand08Middel" 			taal="nl" waarde="aug"/>
		<i18n sleutel="Maand08Middel" 			taal="en" waarde="Aug."/>

		<i18n sleutel="Maand09Middel" 			taal="nl" waarde="sept"/>
		<i18n sleutel="Maand09Middel" 			taal="en" waarde="Sept."/>

		<i18n sleutel="Maand10Middel" 			taal="nl" waarde="okt"/>
		<i18n sleutel="Maand10Middel" 			taal="en" waarde="Oct."/>

		<i18n sleutel="Maand11Middel" 			taal="nl" waarde="nov"/>
		<i18n sleutel="Maand11Middel" 			taal="en" waarde="Nov."/>

		<i18n sleutel="Maand12Middel" 			taal="nl" waarde="dec"/>
		<i18n sleutel="Maand12Middel" 			taal="en" waarde="Dec."/>

	</xsl:variable>

	<xsl:template match="/">
		<xsl:choose>
			<xsl:when test="$bLocalUserSiebe or $bIsTest">
				<xsl:for-each select="for $f in collection(concat($sSourceDir,'?select=*.xml')) return $f">
					<xsl:variable name="sFileName"					as="xs:string"		select="tokenize(document-uri(.), '/')[last()]"/>
					<xsl:variable name="sDocPathTarget"			as="xs:string"		select="concat($sTargetDir,$sFileName)"/>
					<xsl:result-document method="xml" href="{$sDocPathTarget}">
						<xsl:apply-templates>
							<xsl:with-param name="sFileName" as="xs:string?" select="$sFileName" 		tunnel="yes"/>
						</xsl:apply-templates>
					</xsl:result-document>
				</xsl:for-each>
			</xsl:when>
			<xsl:otherwise>
				<xsl:apply-templates/>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:message>success</xsl:message>
	</xsl:template>
	
	<!-- 
		|| Root				: waar we een XsltVersie-comment aan toevoegen
		|| bPIS & bPIL: vanwege het gebruik van deze xslt om ook een hele set bestanden te testen, dienen we per bestand dat we verwerken, via bovenstaande opdracht verwerken, 
		||      			 	mee te geven, welk type we bij de hand hebben. Dit doen we m.b.v. tunnel-parameters, zodat we ze alleen daar weer aanroepen waar nodig.
	-->	
  <xsl:template match="ReisInformatieProductPatroonInformatieLandelijk|ReisInformatieProductPatroonInformatieStation|ReisInformatieProductPatroonInformatieTrein">
		<xsl:copy>
			<xsl:apply-templates select="@*" />
			<xsl:comment>xslt-versie: <xsl:value-of select="$sXsltVersion"/></xsl:comment>
			<xsl:apply-templates select="node()" >
			  <xsl:with-param name="bPIS"            as="xs:boolean" select="local-name()='ReisInformatieProductPatroonInformatieStation'" 		tunnel="yes"/>
			  <xsl:with-param name="bPIL"            as="xs:boolean" select="local-name()='ReisInformatieProductPatroonInformatieLandelijk'" 	tunnel="yes"/>
			  <xsl:with-param name="bPIT"            as="xs:boolean" select="local-name()='ReisInformatieProductPatroonInformatieTrein'" 	    tunnel="yes"/>
			  <xsl:with-param name="dtTimeStampDate" as="xs:date"    select="xs:date(local:getLocalDateTimeFromZuluString(@TimeStamp))" 	    tunnel="yes"/>
			</xsl:apply-templates>
		</xsl:copy>
	</xsl:template>

	<!-- 
		|| Zo goed als alle Presentatie-elementen kennen een default mode en een uitingen-mode, die m.b.v. sPresentatieType "Middel" en "Lang"  worden aangeroepen.
		|| Daarbij zijn grofweg vier structuren aanwezig:
		|| 1. Het nieuwe element bevindt zich onderaan maar binnen het element waarop het gebasserd is.
		|| 2. Het nieuwe element bevindt zich direct na het element waarop het gebaseerd is.
		|| 3. Er wordt meer dan één element toegevoegd aan het element waarop die nieuwe elementen zijn gebaseerd.
		|| 4. Andere ;-)
		|| Hier nu eerste optie 1-a. Het nieuwe element bevindt zich onderaan maar binnen het element waarop het gebasserd is
	-->
  <xsl:template match="SamenvattingAVVBijBaanvak|SamenvattingAVVDossier|OmreisAdvies|AVVStop[StopPlaatsOmschrijving]|AVVMaatregel|TreinMaatregel">
		<xsl:copy>
			<xsl:apply-templates select="@*,node()" />
			<!-- 
			|| Onderstaande constructie komt in meerdere templates van de mode="default" vaker voor.
			|| Er zijn elementen die alleen tot een goede zin leiden, wanneer er een omschrijving aanwezig is.
			|| Tegelijkertijd kunnen er in dit soort omschrijvings-elementen meerder voorkomens zijn. (Elke taal kent zijn eigen Omschrijving)
			|| Door m.b.v. een for-each door deze omschrijvingen te loopen, regelen we dit.
			|| Het nsHuidigElement zorgt ervoor dat we in de context van de for-each dit element kunnen doorsturen aan de template in de mode uitingen.
			-->
			<xsl:variable name="nsHuidigElement" select="."/>
			<xsl:element name="{local:geefPresentaieElementNaam(.)}">
			  <xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			  <xsl:for-each select="*[contains(local-name(),'Omschrijving')][Kort|Middel|Lang] | Advies/Omschrijving[Kort|Middel|Lang]">
					<xsl:variable name="sTaalCode" as="xs:string" select="local:selectTaalCode(TaalCode)"/>
					<xsl:for-each select="$sqPresentatieType">
						<xsl:apply-templates mode="uitingen" select="$nsHuidigElement">
							<xsl:with-param name="sPresentatieType" select="."/>
							<xsl:with-param name="sTaalCode"				select="$sTaalCode"/>
						</xsl:apply-templates>
					</xsl:for-each>
				</xsl:for-each>
			</xsl:element>
		</xsl:copy>
	</xsl:template>
	
  <!-- 
		|| Optie 1-b. Het nieuwe element bevindt zich onderaan maar binnen het element waarop het gebasserd is
	-->
  <xsl:template match="AVVStop[not(StopPlaatsOmschrijving)]">
    <xsl:copy>
      <xsl:apply-templates select="@*,node()" />
      <!-- 
			|| Onderstaande constructie komt in meerdere templates van de mode="default" vaker voor.
			|| Er zijn elementen die alleen tot een goede zin leiden, wanneer er een omschrijving aanwezig is.
			|| Tegelijkertijd kunnen er in dit soort omschrijvings-elementen meerder voorkomens zijn. (Elke taal kent zijn eigen Omschrijving)
			|| Door m.b.v. een for-each door deze omschrijvingen te loopen, regelen we dit.
			|| Het nsHuidigElement zorgt ervoor dat we in de context van de for-each dit element kunnen doorsturen aan de template in de mode uitingen.
			-->
      <xsl:element name="{local:geefPresentaieElementNaam(.)}">
        <xsl:sequence select="local:writeCompareId(local-name(),.)"/>
        <xsl:variable name="nsHuidigElement" select="."/>
        <xsl:for-each select="$sqTaalCodes">
          <xsl:variable name="sTaalCode" as="xs:string" select="."/>
          <xsl:for-each select="$sqPresentatieType">
            <xsl:apply-templates mode="uitingen" select="$nsHuidigElement">
              <xsl:with-param name="sPresentatieType" select="."/>
              <xsl:with-param name="sTaalCode"				select="$sTaalCode"/>
            </xsl:apply-templates>
          </xsl:for-each>
        </xsl:for-each>
      </xsl:element>
    </xsl:copy>
  </xsl:template>
  
  <!-- 
		|| Optie 2. Het nieuwe element bevindt zich direct na het element waarop het gebaseerd is en kent geen omschrijving-achtig element.
		|| Tevens valideren we hier elementen die aan combinatie van een oede en aanwezige tijds-elementen moeten voldoen
	-->
  <xsl:template match="
     Prognose[not(contains('3456',TreindienstNormaalCode) and not(PrognoseTotTijd|PrognoseVanTijd ))]
     |SamenvattingMateVertraging[local:codeMetTijdsElementenisValide(VertragingsKeuzeCode,VertragingVanIncl,VertragingTotIncl )]
    ">
		<xsl:call-template name="copy"/>
		<xsl:element name="{local:geefPresentaieElementNaam(.)}">
		  <xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			<xsl:variable name="nsHuidigElement" select="."/>
		  <xsl:for-each select="*[contains(local-name(),'Omschrijving')][Kort|Middel|Lang]">
				<xsl:variable name="sTaalCode" as="xs:string" select="local:selectTaalCode(TaalCode)"/>
				<xsl:for-each select="$sqPresentatieType">
					<xsl:apply-templates mode="uitingen" select="$nsHuidigElement">
						<xsl:with-param name="sPresentatieType" select="."/>
						<xsl:with-param name="sTaalCode"				select="$sTaalCode"/>
					</xsl:apply-templates>
				</xsl:for-each>
			</xsl:for-each>
		</xsl:element>
	</xsl:template>

  <!-- Onderstaande template is tijdelijk en repareert tijdelijke onvolkomenheden in PIL berichten-->
  <xsl:template match="SamenvattingMateVertraging[preceding-sibling::Situatie[BaanvakBeperking[not(MateVertraging)]]]" priority="2"/>

  <!-- Onderstaande template is tijdelijk en repareert tijdelijke onvolkomenheden in PIL berichten-->
  <xsl:template match="SamenvattingMateVertraging[preceding-sibling::Situatie[BaanvakBeperking[MateVertraging[VertragingsKeuzeCode='F4']]]]" priority="2">
    <xsl:variable name="sqMateVertagingen"    as="element(MateVertraging)*" select="preceding-sibling::Situatie/BaanvakBeperking/MateVertraging" />
    <xsl:variable name="nsFirstMateVertaging" as="element(MateVertraging)"  select="$sqMateVertagingen[1]" />
		<xsl:copy>
	    <xsl:copy-of select="$nsFirstMateVertaging/*"/>
		</xsl:copy>
		<xsl:element name="{local:geefPresentaieElementNaam(.)}">
		  <xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			<xsl:variable name="nsHuidigElement" select="."/>
		  <xsl:for-each select="*[contains(local-name(),'Omschrijving')][Kort|Middel|Lang]">
				<xsl:variable name="sTaalCode" as="xs:string" select="local:selectTaalCode(TaalCode)"/>
				<xsl:for-each select="$sqPresentatieType">
					<xsl:apply-templates mode="uitingenTmp" select="$nsFirstMateVertaging">
						<xsl:with-param name="sPresentatieType"     select="."/>
						<xsl:with-param name="sTaalCode"				    select="$sTaalCode"/>
					</xsl:apply-templates>
				</xsl:for-each>
			</xsl:for-each>
		</xsl:element>
  </xsl:template>

  <!-- 
		|| Optie 2. Het nieuwe element bevindt zich direct na het element waarop het gebaseerd is maar kent geen omschrijving-achtig element.
	-->
  <xsl:template match="OmreizenMogelijk[.='J']|DringendAdvies">
		<xsl:call-template name="copy"/>
		<xsl:element name="{local:geefPresentaieElementNaam(.)}">
		  <xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			<xsl:variable name="nsHuidigElement" select="."/>
			<xsl:for-each select="$sqTaalCodes">
				<xsl:variable name="sTaalCode" as="xs:string" select="."/>
				<xsl:for-each select="$sqPresentatieType">
					<xsl:apply-templates mode="uitingen" select="$nsHuidigElement">
						<xsl:with-param name="sPresentatieType" select="."/>
						<xsl:with-param name="sTaalCode"				select="$sTaalCode"/>
					</xsl:apply-templates>
				</xsl:for-each>
			</xsl:for-each>
		</xsl:element>
	</xsl:template>

	<!-- 
	|| AanvullendAdvies komt zowel voor in het onderstaande PeriodeKalenderMetAanvullendAdvies-element als direct in/na het Situatie-element.
	|| Om te zorgen dat tijdens het door copieren van elementen het AanvullendAdvies niet dubbel het PresentatieAanvullendAdvies veroorzaakt,
	|| maken we gebruik van de mode PresentatieAanvullendAdvies om dit te regelen.
	|| Omdat PeriodeKalenderMetAanvullendAdvies meerdere keren kan voorkomen en ze alle verzameld moeten worden in één PresentatiePeriode na het huidige element,
	|| doen we alleen een match op de laatste en regelen de rest in uitingen m.b.v. preceding-sibling::PeriodeKalenderMetAanvullendAdvies
	-->
	<xsl:template match="PeriodeKalenderMetAanvullendAdvies[position()=last()]">
		<xsl:call-template name="copy"/>
		<PresentatiePeriode>
			<xsl:sequence select="local:writeCompareId('Periode',.)"/>
			<!-- 
			|| Onderstaande constructie komt in meerdere templates van de mode="default" vaker voor.
			|| Er zijn n.l. ook elementen die zonder een omschrijving tot een goede zin leiden.
			|| Door m.b.v. een for-each door deze omschrijvingen te loopen, regelen we dit.
			|| Het nsHuidigElement zorgt ervoor dat we in de context van de for-each dit element kunnen doorsturen aan de template in de mode uitingen.
			-->
			<xsl:variable name="nsHuidigElement" select="."/>
			<xsl:for-each select="$sqTaalCodes">
				<xsl:variable name="sTaalCode" as="xs:string" select="."/>
				<xsl:for-each select="$sqPresentatieType">
					<xsl:apply-templates mode="uitingen" select="$nsHuidigElement">
						<xsl:with-param name="sPresentatieType" select="."/>
						<xsl:with-param name="sTaalCode"				select="$sTaalCode"/>
					</xsl:apply-templates>
				</xsl:for-each>
			</xsl:for-each>
		</PresentatiePeriode>
		<xsl:apply-templates select="AanvullendAdvies" mode="PresentatieAanvullendAdvies"/>
	</xsl:template>
	
  <xsl:template match="StationPatroonInformatie/AanvullendAdvies
                      |LandelijkePatroonInformatie/Situatie/AanvullendAdvies
                      |TreinseriePatroonInformatie/AanvullendAdvies">
		<xsl:call-template name="copy"/>
		<xsl:apply-templates select="." mode="PresentatieAanvullendAdvies"/>
	</xsl:template>

	<xsl:template mode="PresentatieAanvullendAdvies" match="AanvullendAdvies">
		<xsl:element name="{local:geefPresentaieElementNaam(.)}">
		  <xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			<xsl:apply-templates mode="uitingen" select=".">
				<xsl:with-param name="sPresentatieType" select="$sPresentatieTypeMiddel"/>
			</xsl:apply-templates>
			<xsl:apply-templates mode="uitingen" select=".">
			  <xsl:with-param name="sPresentatieType" select="$sPresentatieTypeLang"/>
			</xsl:apply-templates>
		</xsl:element>
	</xsl:template>
	
	<!-- 
		|| Optie 3. Er wordt meer dan één element toegevoegd aan het element waarop die nieuwe elementen zijn gebaseerd.
	-->
	<xsl:template match="Situatie">
		<xsl:call-template name="copy"/>
		<xsl:variable name="nsHuidigElement" select="."/>
		<PresentatieLocatie>
			<xsl:sequence select="local:writeCompareId('Locatie',.)"/>
			<xsl:for-each select="$sqTaalCodes">
				<xsl:variable name="sTaalCode" as="xs:string" select="."/>
				<xsl:for-each select="$sqPresentatieType">
					<xsl:apply-templates mode="locatieUitingen" select="$nsHuidigElement">
						<xsl:with-param name="sPresentatieType" select="."/>
						<xsl:with-param name="sTaalCode"				select="$sTaalCode"/>
					</xsl:apply-templates>
				</xsl:for-each>
			</xsl:for-each>
		</PresentatieLocatie>
		<!-- 
			|| PresentatieSituatie kent alleen een nederlandse versie.
			|| Dus doen we hier geen <xsl:for-each select="$sqTaalCodes"> o.i.d.
			|| Tevens geven we hier door of de oorzaak dient te worden getoond 
		-->
		<xsl:variable name="bToonOorzaak" as="xs:boolean" select="not(preceding-sibling::VerstoringFase castable as xs:integer and xs:integer(preceding-sibling::VerstoringFase) &gt;=4)"/>
		<xsl:element name="{local:geefPresentaieElementNaam(.)}">
		  <xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			<xsl:for-each select="$sqPresentatieType">
				<xsl:apply-templates mode="situatieUitingen" select="$nsHuidigElement">
					<xsl:with-param name="sPresentatieType" select="."/>
					<xsl:with-param name="bToonOorzaak" 		select="$bToonOorzaak"/>
				</xsl:apply-templates>
			</xsl:for-each>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="BaanvakBeperking">
		<xsl:copy>
			<xsl:apply-templates select="@*,node()" />
			<xsl:variable name="nsHuidigElement" select="."/>
			<xsl:element name="{local:geefPresentaieElementNaam(.)}">
			  <xsl:sequence select="local:writeCompareId(local-name(),.)"/>
				<xsl:for-each select="GevolgenTreindienst/Omschrijving[Kort|Middel|Lang]">
					<xsl:variable name="sTaalCode" as="xs:string" select="local:selectTaalCode(TaalCode)"/>
					<xsl:for-each select="$sqPresentatieType">
						<xsl:apply-templates mode="uitingen" select="$nsHuidigElement">
							<xsl:with-param name="sPresentatieType" select="."/>
							<xsl:with-param name="sTaalCode"				select="$sTaalCode"/>
						</xsl:apply-templates>
					</xsl:for-each>
				</xsl:for-each>
			</xsl:element>
		  <xsl:if test="MateVertraging[local:codeMetTijdsElementenisValide(VertragingsKeuzeCode,VertragingVanIncl,VertragingTotIncl )]"> 
				<PresentatieMateVertraging>
					<xsl:sequence select="local:writeCompareId('MateVertraging',.)"/>
					<xsl:variable name="nsMateVertraging" select="MateVertraging"/>
					<xsl:for-each select="$nsMateVertraging/*[contains(local-name(),'Omschrijving')][Kort|Middel|Lang]">
						<xsl:variable name="sTaalCode" as="xs:string" select="local:selectTaalCode(TaalCode)"/>
						<xsl:for-each select="$sqPresentatieType">
							<xsl:apply-templates mode="uitingen" select="$nsMateVertraging">
								<xsl:with-param name="sPresentatieType" select="."/>
								<xsl:with-param name="sTaalCode"				select="$sTaalCode"/>
							</xsl:apply-templates>
						</xsl:for-each>
					</xsl:for-each>
				</PresentatieMateVertraging>
			</xsl:if>
		</xsl:copy>
	</xsl:template>

	<!-- 
		|| Optie 4. Andere: Een taalonafhankelijke uiting die qua naam niet vergelijkbaar overeenkomt als de andere construcyies
	-->
	<xsl:template match="VrijgaveTijd">
		<xsl:call-template name="copy"/>
		<PresentatieMeldTijd>
			<xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			<xsl:apply-templates mode="uitingen" select="."/>
		</PresentatieMeldTijd>
	</xsl:template>

	<!-- 
		|| Optie 4. Andere: Een taalonafhankelijke uiting 
	-->
	<xsl:template match="EVBeginTijd">
		<xsl:call-template name="copy"/>
		<xsl:element name="{local:geefPresentaieElementNaam(.)}">
			<xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			<xsl:apply-templates mode="uitingen" select="."/>
		</xsl:element>
	</xsl:template>
	
	<!-- 
		|| Optie 4. Andere: Een uiting die qua naam niet vergelijkbaar overeenkomt als de andere construcyies
	-->
	<xsl:template match="OorzaakLang">
		<xsl:param name="sTaalCode"	as="xs:string" select="'nl'"/>
		<xsl:call-template name="copy"/>
		<PresentatieOorzaak>
			<xsl:sequence select="local:writeCompareId(local-name(),.)"/>
			<Uitingen Taal="{$sTaalCode}" PresentatieType="Middel">
				<Uiting>
					<xsl:value-of select="local:capitalize(preceding-sibling::OorzaakKort[1])"/>
				</Uiting>
			</Uitingen>
			<Uitingen Taal="{$sTaalCode}" PresentatieType="Lang">
				<Uiting>
					<xsl:value-of select="local:capitalize(.)"/>
				  <xsl:text>.</xsl:text>
				</Uiting>
			</Uitingen>
		</PresentatieOorzaak>
	</xsl:template>
	
	
	<!-- 
		|| De meeste Presentatie-elementen gebruiken de mode="uitingen" voor het verzorgen van het element Uitingen.
		|| Alle Templates gebruiken in ieder geval de volgende twee xsl:param:
		|| 
		|| 1. sPresentatieType: Deze waarde bestaat uit de keuze "Middel" en "Lang". 
		||    Deze wordt gebruikt om op eenvoudige wijze de betreffende elementen te kiezen.
		||
		|| 2. sTaalCode: 						Deze waarde bestaat uit de keuze "nl" en "en"
		||    M.b.v. global sequence: sqI18n en de functie: geefI18NWaarde() vragen we daar waar van toepassing de taal-specfieke waarde uit.
		|| 
		|| Hoeronder de verschillende matches.
	-->
	<xsl:template mode="uitingen" match="SamenvattingAVVBijBaanvak|SamenvattingAVVDossier">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" select="'nl'"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<xsl:value-of select=" local:capitalize(local:geefOmschrijving(AVVOmschrijving,$sPresentatieType,$sTaalCode))"/>
    	  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>
	
	<!-- 
		|| PeriodeKalenderMetAanvullendAdvies
		|| Uiting voorbeelden
		|| Middel: 31-05-2010 t/m 14-06-2010, za en zo, 06:00 - 10:00
		|| Lang:	maandag 31 mei 2010 tot en met maandag 14 juni 2010 wekelijks in de weekeinden tussen 06:00 en 10:00 uur
	-->
	<xsl:template mode="uitingen" match="PeriodeKalenderMetAanvullendAdvies">
		<xsl:param name="sPresentatieType"		as="xs:string"/>
		<xsl:param name="sTaalCode"						as="xs:string" 	select="'nl'"/>
		<xsl:variable name="bIsLang" 					as="xs:boolean" select="$sPresentatieType=$sPresentatieTypeLang"/>
		<xsl:variable name="sEn"							as="xs:string"	select="if($bIsLang) 		then local:geefI18NWaarde('en',$sTaalCode,true(),true()) else ', '"/>
		<xsl:variable name="sTot"							as="xs:string"	select="if($bIsLang) 		then local:geefI18NWaarde('tot',$sTaalCode,true(),true()) else ' - '"/>
		
		<xsl:variable name="sDateFormatShort"	as="xs:string"	select="if($sTaalCode='nl') then '[D02]-[M02]-[Y]'else '[D02]/[M02]/[Y]'"/>
		<xsl:variable name="sDateFormatLong"	as="xs:string"	select="'[F] [D] [MNn] [Y]'"/>
		<xsl:variable name="sDateFormat"			as="xs:string"	select="if($bIsLang) 		then $sDateFormatLong else $sDateFormatShort"/>
		
		<xsl:variable name="sDateTimeFormat"	as="xs:string"	select="if($bIsLang) 		then '[F] [D] [MNn] [Y] [H02]:[m02]'else concat('[H02]:[m02] ',$sDateFormatShort)"/>
	  <xsl:variable name="sPunctuatie"      as="xs:string"  select="if($sPresentatieType=$sPresentatieTypeLang) then '. ' else '; '"/>
		
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<!-- 
					|| Omdat PeriodeKalenderMetAanvullendAdvies meerdere keren kan voorkomen en ze alle verzameld moeten worden in één PresentatiePeriode element,
					|| regelen we hier dat de voorgaande PeriodeKalenderMetAanvullendAdvies m.b.v. preceding-sibling::PeriodeKalenderMetAanvullendAdvies ook worden meegenomen
				-->
				<xsl:for-each select="self::node()|preceding-sibling::PeriodeKalenderMetAanvullendAdvies">
					<xsl:if test="position()&gt;1">
						<xsl:value-of select="$sPunctuatie"/>
					</xsl:if>
				  
					<!-- 
						|| Afspraak is dat als er een PeriodeKalender aanwezig is we de SituatieTijdvak-elementen negeren
					-->
					<xsl:choose>
						<xsl:when test="PeriodeKalender">
							<!-- 
								|| Om te kunnen rekenen met de datums, eerst een check of het wel juiste datums zijn
							-->
							<xsl:if test="PeriodeKalender/EersteTijdvakBegin castable as xs:dateTime and PeriodeKalender/EersteTijdvakEind  castable as xs:dateTime and PeriodeKalender/Regel/PeriodeDatumTot  castable as xs:date">
								<xsl:variable name="dtEersteTijdvakBegin" 			as="xs:dateTime" 	select="local:getLocalDateTimeFromZuluString(PeriodeKalender/EersteTijdvakBegin)"/>
								<xsl:variable name="dtEersteTijdvakEind" 				as="xs:dateTime" 	select="local:getLocalDateTimeFromZuluString(PeriodeKalender/EersteTijdvakEind)"/>
								<xsl:variable name="dEersteTijdvakBegin" 				as="xs:date"			select="xs:date($dtEersteTijdvakBegin)"/>
								<xsl:variable name="dEersteTijdvakEind" 				as="xs:date"			select="xs:date($dtEersteTijdvakEind)"/>
								<xsl:variable name="dPeriodeDatumTot" 					as="xs:date"			select="xs:date(PeriodeKalender/Regel/PeriodeDatumTot)"/>
								<xsl:variable name="iVerschilInDagenTijdvak" 		as="xs:integer"		select="xs:integer(($dEersteTijdvakEind  	- $dEersteTijdvakBegin) div xs:dayTimeDuration('P1D'))"/>
								<xsl:variable name="iVerschilInDagenTot" 				as="xs:integer"		select="xs:integer(($dPeriodeDatumTot 		- $dEersteTijdvakBegin) div xs:dayTimeDuration('P1D'))"/>
								<xsl:choose>
									<xsl:when test="$sTaalCode='nl'">
										<xsl:value-of select="lower-case(format-dateTime($dtEersteTijdvakBegin,$sDateFormat, $sTaalCode, (), ()))"/>
									</xsl:when>
									<xsl:otherwise>
										<xsl:value-of select="format-dateTime($dtEersteTijdvakBegin,$sDateFormat, $sTaalCode, (), ())"/>
									</xsl:otherwise>
								</xsl:choose>
								<xsl:if test="$iVerschilInDagenTot &gt; 0">
									<xsl:choose>
										<xsl:when test="$iVerschilInDagenTot=1">
											<xsl:value-of select="$sEn"/>
										</xsl:when>
										<xsl:otherwise>
											<xsl:value-of  select="if($bIsLang)	then local:geefI18NWaarde('tot en met',$sTaalCode,true(),true()) else local:geefI18NWaarde('t/m',$sTaalCode,true(),true())"/>
										</xsl:otherwise>
									</xsl:choose>
									<xsl:choose>
										<xsl:when test="$sTaalCode='nl'">
											<xsl:value-of select="lower-case(format-date($dPeriodeDatumTot,$sDateFormat, $sTaalCode, (), ()))"/>
										</xsl:when>
										<xsl:otherwise>
											<xsl:value-of select="format-date($dPeriodeDatumTot,$sDateFormat, $sTaalCode, (), ())"/>
										</xsl:otherwise>
									</xsl:choose>
								</xsl:if>
								<xsl:choose>
									<xsl:when test="$bIsLang">
										<xsl:variable name="sqWeekDagen" 		as="xs:string+" select="'Ma','Di','Wo','Do','Vr'"/>
										<xsl:variable name="sqWeekendDagen" as="xs:string+" select="'Za','Zo'"/>
										
										<xsl:if test="PeriodeKalender/Regel/Frequentie='W'">
											<xsl:value-of select="local:geefI18NWaarde('wekelijks',$sTaalCode,true(),true())"/>
										</xsl:if>
										<xsl:choose>
											<xsl:when test="count(PeriodeKalender/Regel/Dag)=5 and PeriodeKalender/Regel/Dag=$sqWeekDagen and not(PeriodeKalender/Regel/Dag=$sqWeekendDagen)">
												<!-- 
													|| Ervan uitgaande dat er geen dubbel dagen aanwezig zijn, betekent deze when: 
													|| Als Ma, Di, Wo, Do en Vr aanwezig zijn En
													|| Als Za en Zo niet aanwezig zijn En
													|| Het totaal van de Dag-elemneten 5 is 
												-->
												<xsl:value-of select="local:geefI18NWaarde('op weekdagen',$sTaalCode,true(),true())"/>
											</xsl:when>
											<xsl:when test="count(PeriodeKalender/Regel/Dag)=2 and not(PeriodeKalender/Regel/Dag=$sqWeekDagen) and PeriodeKalender/Regel/Dag=$sqWeekendDagen">
												<!-- 
													|| Ervan uitgaande dat er geen dubbel dagen aanwezig zijn, betekent deze when: 
													|| Als Ma, Di, Wo, Do en Vr niet aanwezig zijn En
													|| Als Za en Zo aanwezig zijn En
													|| Het totaal van de Dag-elemneten 2 is 
												-->
												<xsl:value-of select="local:geefI18NWaarde('in de weekeinden',$sTaalCode,true(),true())"/>
											</xsl:when>
											<xsl:otherwise>
												<xsl:for-each select="PeriodeKalender/Regel/Dag">
													<xsl:choose>
														<xsl:when test="position() = last()">
															<xsl:value-of select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
														</xsl:when>
														<xsl:when test="position()&gt;1">
															<xsl:text>, </xsl:text>
														</xsl:when>
													</xsl:choose>
													<xsl:value-of select="local:geefI18NWaarde(concat(.,$sPresentatieType),$sTaalCode,false(),false())"/>
												</xsl:for-each>
											</xsl:otherwise>
										</xsl:choose>
										<xsl:value-of select="local:geefI18NWaarde('tussen',$sTaalCode,true(),true())"/>
										<xsl:value-of select="format-dateTime($dtEersteTijdvakBegin,'[H02]:[m02]')"/>
										<xsl:value-of select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
										<xsl:value-of select="format-dateTime($dtEersteTijdvakEind,'[H02]:[m02]')"/>
										<xsl:value-of select="local:geefI18NWaarde('uur',$sTaalCode,true(),false())"/>
										
									</xsl:when>
									<xsl:when test="not(count(PeriodeKalender/Regel/Dag)=7)">
										<xsl:text>, </xsl:text>
										<xsl:for-each select="PeriodeKalender/Regel/Dag">
											<xsl:choose>
												<xsl:when test="position() = last()">
													<xsl:value-of select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
												</xsl:when>
												<xsl:when test="position()&gt;1">
													<xsl:text>, </xsl:text>
												</xsl:when>
											</xsl:choose>
											<xsl:value-of select="local:geefI18NWaarde(concat(.,$sPresentatieType),$sTaalCode,false(),false())"/>
										</xsl:for-each>
										
										<xsl:text>, </xsl:text>
										<xsl:value-of select="format-dateTime($dtEersteTijdvakBegin,'[H02]:[m02]')"/>
										<xsl:text> - </xsl:text>
										<xsl:value-of select="format-dateTime($dtEersteTijdvakEind,'[H02]:[m02]')"/>
									</xsl:when>
								</xsl:choose>
							</xsl:if>
							
						</xsl:when>
						<xsl:otherwise>
							<xsl:for-each select="SituatieTijdvak">
								<xsl:if test="position()&gt;1">
									<xsl:sequence select="$sEn"/>
								</xsl:if>
								<xsl:value-of select="format-dateTime(BeginTijd,$sDateTimeFormat, $sTaalCode, (), ())"/>
								<xsl:value-of select="$sTot"/>
								<xsl:value-of select="format-dateTime(EindTijd,$sDateTimeFormat, $sTaalCode, (), ())"/>
							</xsl:for-each>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:for-each>
			</Uiting>
		</Uitingen>
	</xsl:template>

	<xsl:template mode="uitingen" match="SamenvattingMateVertraging">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" 	select="'nl'"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<xsl:sequence select="local:geefVertraging(Omschrijving,$sPresentatieType,VertragingsKeuzeCode,VertragingVanIncl,VertragingTotIncl,$sTaalCode)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>
  
	<xsl:template mode="uitingen" match="MateVertraging">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" 	select="'nl'"/>
	  <xsl:param name="nsFirstMateVertaging"        as="element()"  select="."/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<xsl:sequence select="local:geefVertraging($nsFirstMateVertaging/Omschrijving,$sPresentatieType,$nsFirstMateVertaging/VertragingsKeuzeCode,$nsFirstMateVertaging/VertragingVanIncl,$nsFirstMateVertaging/VertragingTotIncl,$sTaalCode)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>

	<xsl:template mode="uitingen" match="AanvullendAdvies">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" 	select="'nl'"/>
	  <xsl:variable name="sPunctuatie"              as="xs:string"  select="if($sPresentatieType=$sPresentatieTypeLang) then '. ' else '; '"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<!-- 
					|| Omdat PeriodeKalenderMetAanvullendAdvies/AanvullendAdvies meerdere keren kan voorkomen en ze alle verzameld moeten worden in één PresentatieAanvullendAdvies element,
					|| regelen we hier dat de daarop volgende PeriodeKalenderMetAanvullendAdvies/AanvullendAdvies m.b.v. following-sibling::PeriodeKalenderMetAanvullendAdvies ook worden meegenomen
				-->
				<xsl:for-each select="self::node()|parent::PeriodeKalenderMetAanvullendAdvies/following-sibling::PeriodeKalenderMetAanvullendAdvies/AanvullendAdvies">
					<xsl:if test="position()&gt;1">
						<xsl:value-of select="$sPunctuatie"/>
					</xsl:if>
					<xsl:value-of select="local:capitalize(*[local-name()=concat('AanvullendAdvies',$sPresentatieType)])"/>
				</xsl:for-each>
    	  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>
	
	<xsl:template mode="uitingen" match="OmreisAdvies">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" 	select="'nl'"/>
		<xsl:param name="bPIS"												as="xs:boolean" select="$bPISg" tunnel="yes"/>
		<xsl:param name="bPIL"												as="xs:boolean" select="$bPILg" tunnel="yes"/>
		<xsl:param name="bPIT"												as="xs:boolean" select="$bPITg" tunnel="yes"/>
		<xsl:variable name="bBeide" 									as="xs:boolean" select="lower-case(Richting)='beide'"/>
		<xsl:variable name="sElementNaamStationsNaam" as="xs:string" 	select="local:geefElementNaamStationsNaam($sPresentatieType)"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
			  <xsl:variable name="sBeginZin">
			    <xsl:if test="$sPresentatieType=$sPresentatieTypeLang">
			      <xsl:sequence select="local:geefI18NWaarde('Reizigers',$sTaalCode,false(),true())"/>
			    </xsl:if>
			    <xsl:if test="$bPIL">
			      <xsl:choose>
			        <xsl:when test="$bBeide">
			          <xsl:sequence select="local:geefI18NWaarde('tussen',$sTaalCode,false(),true())"/>
			        </xsl:when>
			        <xsl:otherwise>
			          <xsl:sequence select="local:geefI18NWaarde('van',$sTaalCode,false(),true())"/>
			        </xsl:otherwise>
			      </xsl:choose>
			      <xsl:value-of select="StationVanaf/*[local-name()=$sElementNaamStationsNaam]"/>
			      <xsl:text> </xsl:text>
			    </xsl:if>
			    <xsl:choose>
			      <xsl:when test="$bBeide">
			        <xsl:sequence select="local:geefI18NWaarde('en',$sTaalCode,false(),true())"/>
			      </xsl:when>
			      <xsl:otherwise>
			        <xsl:sequence select="local:geefI18NWaarde('naar',$sTaalCode,false(),true())"/>
			      </xsl:otherwise>
			    </xsl:choose>
			  </xsl:variable>
			  <xsl:sequence select="concat(upper-case(substring($sBeginZin,1,1)),substring($sBeginZin,2))"/> 
				<xsl:for-each select="BestemmingStation">
					<xsl:if test="position()&gt;1">
						<xsl:text>/</xsl:text>
					</xsl:if>
					<xsl:value-of select="*[local-name()=$sElementNaamStationsNaam]"/>
				</xsl:for-each>
				<xsl:text> </xsl:text>
				<xsl:value-of select="Advies/Omschrijving/*[local-name()=$sPresentatieType]"/>
				<xsl:text> </xsl:text>
				<xsl:for-each select="Advies/OmreisAdviesStation">
					<xsl:if test="position()&gt;1">
						<xsl:sequence select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
					</xsl:if>
					<xsl:value-of select="*[local-name()=$sElementNaamStationsNaam]"/>
				</xsl:for-each>
				<xsl:text>.</xsl:text>
				<xsl:choose>
				  
				  <xsl:when test="OmreisExtraReistijd[local:codeMetTijdsElementenisValide( KeuzeCode/text()
				                                                                          ,ExtraTijdVanIncl
				                                                                          ,ExtraTijdTotIncl )]"> 
						<xsl:text> </xsl:text>
				    <xsl:sequence select="local:geefVertraging(OmreisExtraReistijd/Omschrijving,$sPresentatieType,OmreisExtraReistijd/KeuzeCode,  OmreisExtraReistijd/ExtraTijdVanIncl,OmreisExtraReistijd/ExtraTijdTotIncl,$sTaalCode)"/>
				  </xsl:when>
					<xsl:when test="ExtraReistijdVan|ExtraReistijdTot">
						<xsl:sequence select="local:geefExtraRijstijd($sPresentatieType,ExtraReistijdVan,ExtraReistijdTot,$sTaalCode)"/>
					</xsl:when>
				</xsl:choose>
			</Uiting>
		</Uitingen>
	</xsl:template>
	
	<xsl:template mode="uitingen" match="DringendAdvies">
		<xsl:param name="sPresentatieType"	as="xs:string"/>
		<xsl:param name="sTaalCode"					as="xs:string" select="'nl'"/>
	  <xsl:variable name="sElementNaamOmschrijving" as="xs:string" 	select="if($sPresentatieType=$sPresentatieTypeMiddel) then 'DringendAdviesKort' else concat('DringendAdvies',$sPresentatieType)"/>
	  <Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
			  <xsl:value-of select="local:capitalize(*[local-name()=$sElementNaamOmschrijving])"/>
			  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>

	<xsl:template mode="uitingen" match="AVVMaatregel">
		<xsl:param name="sPresentatieType"	          as="xs:string"/>
		<xsl:param name="sTaalCode"					          as="xs:string" select="'nl'"/>
	  <xsl:variable name="bIsLang" 				          as="xs:boolean" select="$sPresentatieType=$sPresentatieTypeLang"/>
		<xsl:variable name="sElementNaamStationsNaam" as="xs:string" select="local:geefElementNaamStationsNaam($sPresentatieType)"/>
	  <Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<xsl:value-of select="local:capitalize(local:geefOmschrijving(AVVOmschrijving,$sPresentatieType,$sTaalCode))"/>
			  <xsl:value-of select="if($bIsLang) then local:geefI18NWaarde('tussen',$sTaalCode,true(),true()) else ': '"/>
			  <xsl:for-each select="AVVStop">
			    <xsl:if test="position()&gt;1">
            <xsl:choose>
              <xsl:when test="position()=last() and $sPresentatieType=$sPresentatieTypeLang">
                <xsl:value-of select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
              </xsl:when>
              <xsl:otherwise>
                <xsl:text>, </xsl:text>
              </xsl:otherwise>
            </xsl:choose>
			    </xsl:if>
  				<xsl:value-of select="Stop/*[local-name()=$sElementNaamStationsNaam]"/>
			  </xsl:for-each>
			  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>
		
	<xsl:template mode="uitingen" match="AVVStop">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" select="'nl'"/>
		<xsl:variable name="sElementNaamStationsNaam" as="xs:string" select="local:geefElementNaamStationsNaam($sPresentatieType)"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<xsl:value-of select="Stop/*[local-name()=$sElementNaamStationsNaam]"/>
			  <xsl:if test="StopPlaatsOmschrijving">
			    <xsl:text>: </xsl:text>
			    <xsl:value-of select="local:geefOmschrijving(StopPlaatsOmschrijving,$sPresentatieType,$sTaalCode)"/>
			  </xsl:if>
			</Uiting>
		</Uitingen>
	</xsl:template>
		
	<xsl:template mode="uitingen" match="OmreizenMogelijk">
		<xsl:param name="sTaalCode"					as="xs:string" 		select="'nl'"/>
		<xsl:param name="sPresentatieType"	as="xs:string"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
			  <xsl:value-of select="local:geefI18NWaarde('U kunt omreizen',$sTaalCode,false(),false())"/>
			  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>

	<xsl:template mode="uitingen" match="EVBeginTijd|VrijgaveTijd">
		<xsl:param name="sTaalCode"						as="xs:string" 		select="'nl'"/>
		<xsl:variable name="dtLocalDateTime" 	as="xs:dateTime" 	select="local:getLocalDateTimeFromZuluString(.)"/>
		<xsl:variable name="sTijd" 						as="xs:string" 		select="format-dateTime($dtLocalDateTime,'[H01]:[m01]')"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="Kort">
			<Uiting><xsl:value-of select="$sTijd"/></Uiting>
		</Uitingen>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="Middel">
			<Uiting><xsl:value-of select="concat($sTijd,local:geefI18NWaarde('uur',$sTaalCode,true(),false()))"/></Uiting>
		</Uitingen>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="Lang">
			<Uiting>
				<xsl:variable name="sTijdLang" as="xs:string" select="format-dateTime($dtLocalDateTime,'[F] [D] [MNn] [Y], [H01]:[m01]', $sTaalCode, (), ())"/>
				<xsl:choose>
					<xsl:when test="$sTaalCode='nl'">
						<xsl:value-of select="concat(lower-case($sTijdLang),local:geefI18NWaarde('uur',$sTaalCode,true(),false()))"/>
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="concat($sTijdLang,local:geefI18NWaarde('uur',$sTaalCode,true(),false()))"/>
					</xsl:otherwise>
				</xsl:choose>
			</Uiting>
		</Uitingen>
	</xsl:template>
	
	<xsl:template mode="uitingen" match="Prognose">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" 		select="'nl'"/>
	  <xsl:param name="dtTimeStampDate"             as="xs:date"      tunnel="yes"/>
		<xsl:variable name="sCode" 										as="xs:string" 		select="TreindienstNormaalCode"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
		  <Uiting>
				<xsl:value-of select="local:capitalize(local:geefOmschrijving(Omschrijving,$sPresentatieType,$sTaalCode))"/>
		    <xsl:if test="contains('3456',$sCode)">
		      <xsl:text> </xsl:text>
		      <xsl:variable name="dtPrognoseLocalDateTime" 					as="xs:dateTime" 	select="if(string-length(PrognoseVanTijd)) then local:getLocalDateTimeFromZuluString(PrognoseVanTijd) else local:getLocalDateTimeFromZuluString(PrognoseTotTijd)"/>
		      <xsl:variable name="dtPrognoseLocalDate" 					    as="xs:date" 	    select="xs:date($dtPrognoseLocalDateTime)"/>
		      <xsl:if test="$dtPrognoseLocalDate!=$dtTimeStampDate">
		        <xsl:sequence select="local:geefDagpresentatie($dtPrognoseLocalDateTime,$sPresentatieType,$sTaalCode)"/>
		        <xsl:text> </xsl:text>
		      </xsl:if>
		      <xsl:value-of select="format-dateTime($dtPrognoseLocalDateTime,'[H01]:[m01]')"/>
					<xsl:text> uur</xsl:text>
				</xsl:if>
		    <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>
	
  <!-- Onderstaande template is tijdelijk en repareert tijdelijke onvolkomenheden in PIL berichten-->
	<xsl:template mode="uitingenTmp" match="MateVertraging">
		<xsl:param name="sPresentatieType"	as="xs:string"/>
		<xsl:param name="sTaalCode"					as="xs:string" 	select="'nl'"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<xsl:sequence select="local:geefVertraging(Omschrijving,$sPresentatieType,VertragingsKeuzeCode,VertragingVanIncl,VertragingTotIncl,$sTaalCode)"/>
			</Uiting>
		</Uitingen>
	</xsl:template>

	<xsl:template mode="uitingen" match="BaanvakBeperking">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" select="'nl'"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<xsl:apply-templates mode="uitingenInhoud" select=".">
					<xsl:with-param name="sPresentatieType" select="$sPresentatieType"/>
					<xsl:with-param name="sTaalCode" 				select="$sTaalCode"/>
				</xsl:apply-templates>
			</Uiting>
		</Uitingen>
	</xsl:template>
	
	<!--  
		|| Omdat de BaanvakBeperking-uiting-inhoud ook wordt gebruikt in Situatie hier een mode="uitingenInhoud" om zowel vanuit Situatie als BaanvakBeperking te gebruiken 
	-->
	<xsl:template mode="uitingenInhoud" match="BaanvakBeperking">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" select="'nl'"/>
		<xsl:param name="iPosition"										as="xs:integer" select="1"/>
		<xsl:param name="bZetOptionelePunt" 					as="xs:boolean" select="true()"/>
		<xsl:variable name="bBeide" 									as="xs:boolean" select="lower-case(Richting)='beide'"/>
		<xsl:variable name="bHeen" 										as="xs:boolean" select="lower-case(Richting)='heen'"/>
		<xsl:variable name="bVia" 										as="xs:boolean" select="count(StationVia)&gt;0"/>
		<xsl:variable name="bTot" 										as="xs:boolean" select="count(StationTot)&gt;0"/>
		<xsl:variable name="sElementNaamStationsNaam" as="xs:string" 	select="local:geefElementNaamStationsNaam($sPresentatieType)"/>
		<xsl:variable name="sTussen"									as="xs:string"	select="if($iPosition=1) then 'Tussen' 	else 'tussen'"/>
		<xsl:variable name="sVan"											as="xs:string"	select="if($iPosition=1) then 'Van' 		else 'van'"/>
		<xsl:variable name="sVanaf"										as="xs:string"	select="if($iPosition=1) then 'Vanaf' 	else 'vanaf'"/>
		<xsl:choose>
		  <xsl:when test="$bBeide and not($bTot) and not($bVia)">
		    <xsl:sequence select="local:geefI18NWaarde('Van en naar',$sTaalCode,false(),true())"/>
		  </xsl:when>
		  <xsl:when test="$bBeide">
				<xsl:sequence select="local:geefI18NWaarde($sTussen,$sTaalCode,false(),true())"/>
			</xsl:when>
			<xsl:when test="$bHeen">
				<xsl:sequence select="local:geefI18NWaarde($sVan,$sTaalCode,false(),true())"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:sequence select="local:geefI18NWaarde($sVanaf,$sTaalCode,false(),true())"/>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:value-of select="StationVan/*[local-name()=$sElementNaamStationsNaam]"/>
		<xsl:if test="$bTot">
			<xsl:choose>
				<xsl:when test="$bBeide">
					<xsl:sequence select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:sequence select="local:geefI18NWaarde('naar',$sTaalCode,true(),true())"/>
				</xsl:otherwise>
			</xsl:choose>
		  <xsl:value-of select="StationTot/*[local-name()=$sElementNaamStationsNaam]"/>
		</xsl:if>
		<xsl:if test="$bVia">
			<xsl:sequence select="local:geefI18NWaarde('via',$sTaalCode,true(),true())"/>
		  <xsl:value-of select="StationVia/*[local-name()=$sElementNaamStationsNaam]"/>
		</xsl:if>
		<xsl:text> </xsl:text>
		<xsl:value-of select="local:geefOmschrijving(GevolgenTreindienst/Omschrijving,$sPresentatieType,$sTaalCode)"/>
	  <xsl:if test="$bZetOptionelePunt">
  	  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
	  </xsl:if>
	</xsl:template>

	<!-- 
		|| Hieronder volgenn de "speciale" Presentatie-elementen die meer dan de mode="uitingen" nodig hebben
		|| Alle Templates gebruiken in ieder geval de volgende twee xsl:param:
		|| 
		|| 1. sPresentatieType: Deze waarde bestaat uit de keuze "Middel" en "Lang". 
		||    Deze wordt gebruikt om op eenvoudige wijze de betreffende elementen te kiezen.
		||
		|| 2. sTaalCode: 						Deze waarde bestaat uit de keuze "nl" en "en"
		||    M.b.v. global sequence: sqI18n en de functie: geefI18NWaarde() vragen we daar waar van toepassing de taal-specfieke waarde uit.
		|| 
		|| Hoeronder de verschillende matches.
	-->
	<xsl:template mode="situatieUitingen" match="Situatie">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" 	select="'nl'"/>
		<xsl:param name="bToonOorzaak"								as="xs:boolean" select="true()"/>
		<xsl:variable name="sElementNaamStationsNaam" as="xs:string" 	select="local:geefElementNaamStationsNaam($sPresentatieType)"/>
	  <xsl:variable name="bToonEnHeeftOorzaak"      as="xs:boolean" select="$bToonOorzaak and OorzaakKort|OorzaakLang"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
				<xsl:for-each select="BaanvakBeperking">
					<xsl:if test="position()!=1">
						<xsl:text> en </xsl:text>
					</xsl:if>
					<xsl:apply-templates mode="uitingenInhoud" 	select=".">
						<xsl:with-param name="sPresentatieType" 	select="$sPresentatieType"/>
						<xsl:with-param name="iPosition" 					select="position()"/>
					  <xsl:with-param name="bZetOptionelePunt"  select="not($bToonEnHeeftOorzaak) and position()=last()"/>
					</xsl:apply-templates>
				</xsl:for-each>
				<xsl:if test="$bToonEnHeeftOorzaak">
					<xsl:text> </xsl:text>
					<xsl:choose>
						<xsl:when test="$sPresentatieType=$sPresentatieTypeLang and OorzaakLang">
							<xsl:value-of select="OorzaakLang"/>
						</xsl:when>
						<xsl:when test="$sPresentatieType=$sPresentatieTypeMiddel and OorzaakKort">
							<xsl:value-of select="OorzaakKort"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="(OorzaakKort|OorzaakLang)[1]"/>
						</xsl:otherwise>
					</xsl:choose>
				  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
				</xsl:if>
			</Uiting>
		</Uitingen>
	</xsl:template>

  <!-- Als er geen BaanvakBeperking/StationTot toon dan alleen het van station. Zogenaamde “Rondom”-verstoring-->
  <xsl:template mode="locatieUitingen" match="Situatie[not(BaanvakBeperking/StationTot)]">
    <xsl:param name="sPresentatieType"						as="xs:string"/>
    <xsl:param name="sTaalCode"										as="xs:string" select="'nl'"/>
    <xsl:variable name="sElementNaamStationsNaam" as="xs:string" select="local:geefElementNaamStationsNaam($sPresentatieType)"/>
    <Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
      <Uiting>
        <xsl:value-of select="BaanvakBeperking/StationVan/*[local-name()=$sElementNaamStationsNaam]"/>
      </Uiting>
    </Uitingen>
  </xsl:template>

  <xsl:template mode="locatieUitingen" match="Situatie[BaanvakBeperking/StationTot]">
		<xsl:param name="sPresentatieType"						as="xs:string"/>
		<xsl:param name="sTaalCode"										as="xs:string" select="'nl'"/>
		<Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
			<Uiting>
			  <xsl:for-each select="BaanvakBeperking/Traject/TrajectNaam">
			    <xsl:sort select="../AantalReizen" data-type="number" order="descending"/>
					<xsl:if test="position()!=1">
						<xsl:text>; </xsl:text>
					</xsl:if>
					<xsl:for-each select="Van|Via|Naar">
						<xsl:if test="position()!=1">
							<xsl:text>-</xsl:text>
						</xsl:if>
						<xsl:value-of select="."/>
					</xsl:for-each>
				</xsl:for-each>
			</Uiting>
		</Uitingen>
	</xsl:template>
  
  <xsl:variable name="sqTreinMaatregelCodesZonderBij"       as="xs:string+" select="'01','02','03','06','07','10','11','12','15','17','21','22'"/>
  <xsl:variable name="sqTreinMaatregelCodesMetBij"          as="xs:string+" select="'04','05','08','09','13','14','16','18','19','20'"/>
  <xsl:variable name="sqTreinMaatregelCodesTrein"           as="xs:string+" select="'20'"/>
  <xsl:variable name="sqTreinMaatregelCodesIndien1Keer"     as="xs:string+" select="'03'"/>
  <xsl:variable name="sqTreinMaatregelCodesIndien2Keer"     as="xs:string+" select="'01','02','06','07','15','21','23'"/>
  <xsl:variable name="sqTreinMaatregelCodesIndienMeerdere"  as="xs:string+" select="'04','05','08','09','13','14'"/>
  <xsl:variable name="sqTreinMaatregelCodesIndienVia"       as="xs:string+" select="'03'"/>
  <xsl:template mode="uitingen" match="TreinMaatregel">
    <xsl:param name="sPresentatieType"						as="xs:string"/>
    <xsl:param name="sTaalCode"										as="xs:string" select="'nl'"/>
    <xsl:variable name="bIsPresentatieMiddel"     as="xs:boolean" select="$sPresentatieType=$sPresentatieTypeMiddel"/>
    <xsl:variable name="sElementNaamPlaats"       as="xs:string" 	select="if($bIsPresentatieMiddel) then 'MiddelNaam' else 'LangeNaam'"/>
    <Uitingen Taal="{$sTaalCode}" PresentatieType="{$sPresentatieType}">
      <Uiting>
        <xsl:variable name="nsTreinSoort" select="TreinSoort[1]"/>
        <xsl:choose>
          <xsl:when test="not($nsTreinSoort)">
            <!-- Kan tzt weg. Is fallback voor oude berichten -->
            <xsl:choose>
              <xsl:when test="MaatregelCode=$sqTreinMaatregelCodesTrein">
                <xsl:value-of select="local:geefI18NWaarde('Trein',$sTaalCode,false(),true())"/>
              </xsl:when>
              <xsl:otherwise>
                <xsl:value-of select="local:geefI18NWaarde('Treinserie',$sTaalCode,false(),true())"/>
              </xsl:otherwise>
            </xsl:choose>
          </xsl:when>
          <xsl:when test="$bIsPresentatieMiddel">
            <xsl:value-of select="$nsTreinSoort/Code"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:value-of select="$nsTreinSoort/Omschrijving"/>
          </xsl:otherwise>
        </xsl:choose>
        <xsl:text> </xsl:text>
        <xsl:if test="TreinSerie">
          <xsl:value-of select="concat(TreinSerie/LaagsteTreinnr,'-',TreinSerie/HoogsteTreinnr)"/>
          <xsl:text>: </xsl:text>
        </xsl:if>
        <xsl:variable name="nsStationGeografie" select="StationGeografie[1]"/>
        <!-- 
          || Hieronder doorlopen we de stations.
          || Drie mogelijke elementen: StationVan, StationVia en StationTot
          || Omdat ze allemaal optioneel zijn, biedt deze werkwijze de meest heldere en korte code, ook met het oog op het verbindingstreepje.
        -->
        <xsl:if test="$nsStationGeografie">
          <xsl:for-each select="$nsStationGeografie/*">
            <xsl:if test="position() &gt; 1">
              <xsl:text>-</xsl:text>
            </xsl:if>
            <xsl:value-of select="*[local-name()=$sElementNaamPlaats]"/>
          </xsl:for-each>
          <xsl:text> </xsl:text>
        </xsl:if>
        <xsl:value-of select="local:geefOmschrijving(MaatregelOmschrijving,$sPresentatieType,$sTaalCode)"/>
        <xsl:choose>
          <xsl:when test="count(StationBijMaatregel) =0"/>
          <xsl:when test="MaatregelCode=$sqTreinMaatregelCodesIndienMeerdere">
            <xsl:text> </xsl:text>
            <xsl:for-each select="StationBijMaatregel">
              <xsl:if test="position() &gt;1">
                <xsl:choose>
                  <xsl:when test="position()=last() and $sPresentatieType=$sPresentatieTypeLang">
                    <xsl:value-of select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
                  </xsl:when>
                  <xsl:otherwise>
                    <xsl:text>, </xsl:text>
                  </xsl:otherwise>
                </xsl:choose>
              </xsl:if>
              <xsl:value-of select="*[local-name()=$sElementNaamPlaats]"/>
            </xsl:for-each>
          </xsl:when>
          <xsl:when test="MaatregelCode=$sqTreinMaatregelCodesIndien2Keer and count(StationBijMaatregel)=2">
            <xsl:text> </xsl:text>
            <xsl:choose>
              <xsl:when test="MaatregelCode='23'">
                <xsl:value-of select="local:geefI18NWaarde('van',$sTaalCode,false(),true())"/>
              </xsl:when>
              <xsl:when test="not(MaatregelCode='21')">
                <xsl:value-of select="local:geefI18NWaarde('tussen',$sTaalCode,false(),true())"/>
              </xsl:when>
            </xsl:choose>
            <xsl:value-of select="StationBijMaatregel[1]/*[local-name()=$sElementNaamPlaats]"/>
            <xsl:choose>
              <xsl:when test="MaatregelCode='23'">
                <xsl:value-of select="local:geefI18NWaarde('naar',$sTaalCode,true(),true())"/>
              </xsl:when>
              <xsl:otherwise>
                <xsl:value-of select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
              </xsl:otherwise>
            </xsl:choose>
            <xsl:value-of select="StationBijMaatregel[2]/*[local-name()=$sElementNaamPlaats]"/>
          </xsl:when>
          <xsl:when test="MaatregelCode=$sqTreinMaatregelCodesIndienVia">
            <xsl:value-of select="local:geefI18NWaarde('via',$sTaalCode,true(),true())"/>
            <xsl:for-each select="StationBijMaatregel">
              <xsl:if test="position() &gt;1">
                <xsl:choose>
                  <xsl:when test="position()=last() and $sPresentatieType=$sPresentatieTypeLang">
                    <xsl:value-of select="local:geefI18NWaarde('en',$sTaalCode,true(),true())"/>
                  </xsl:when>
                  <xsl:otherwise>
                    <xsl:text>, </xsl:text>
                  </xsl:otherwise>
                </xsl:choose>
              </xsl:if>
              <xsl:value-of select="*[local-name()=$sElementNaamPlaats]"/>
            </xsl:for-each>
          </xsl:when>
          <xsl:when test="MaatregelCode=$sqTreinMaatregelCodesMetBij">
            <xsl:text> </xsl:text>
            <xsl:value-of select="StationBijMaatregel[1]/*[local-name()=$sElementNaamPlaats]"/>
          </xsl:when>
        </xsl:choose>
        <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
      </Uiting>
    </Uitingen>
  </xsl:template>
	
	<!-- 
		|| Om te controleren dat we alle elementen in de mode="uitingen" op de juiste manier vangen, hieronder de template die terugkoppelt als dat niet het geval is.
	-->
	<xsl:template mode="uitingenInhoud" match="*">
		<xsl:call-template name="verkeerderElementenInUitingen">
			<xsl:with-param name="sMode" select="'uitingenInhoud'"/>
		</xsl:call-template>
	</xsl:template>

	<xsl:template mode="situatieUitingen" match="*">
		<xsl:call-template name="verkeerderElementenInUitingen">
			<xsl:with-param name="sMode" select="'situatieUitingen'"/>
		</xsl:call-template>
	</xsl:template>

	<xsl:template mode="locatieUitingen" match="*">
		<xsl:call-template name="verkeerderElementenInUitingen">
			<xsl:with-param name="sMode" select="'locatieUitingen'"/>
		</xsl:call-template>
	</xsl:template>
	
	<xsl:template mode="uitingen" match="*">
		<xsl:call-template name="verkeerderElementenInUitingen">
			<xsl:with-param name="sMode" select="'uitingen'"/>
		</xsl:call-template>
	</xsl:template>
	
	<xsl:template name="verkeerderElementenInUitingen">
		<xsl:param name="sMode"										as="xs:string"  />
		<xsl:param name="sFileName"								as="xs:string?"  tunnel="yes"/>
		<xsl:comment>mode: <xsl:value-of select="$sMode"/> element: <xsl:value-of select="name()"/> , value: <xsl:value-of select="."/></xsl:comment>
		<xsl:choose>
			<xsl:when test="string-length($sFileName)&gt;0">
				<xsl:message>sFileName: <xsl:value-of select="$sFileName"/> , element: <xsl:value-of select="name()"/> , value: <xsl:value-of select="."/></xsl:message>
			</xsl:when>
			<xsl:otherwise>
				<xsl:message>
					ReisInformatieProductId: <xsl:value-of select="$nsRitAdministratie/ReisInformatieProductId"/>
					, AbonnementId: <xsl:value-of select="$nsRitAdministratie/AbonnementId"/>
					, ReisInformatieTijdstip: <xsl:value-of select="$nsRitAdministratie/ReisInformatieTijdstip"/>
					, element: <xsl:value-of select="name()"/> , value: <xsl:value-of select="."/></xsl:message>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<!--  
		|| local:geefI18NWaarde() geeft op basis van de parameters sSleutel en sTaalCode de i18n-wwaarde van de global sequence: sqI18n
		|| De andere twee parameters zijn ietwat discutabel voor de functie-scope, maar voorlopig wel "handig".
	-->
	<xsl:function name="local:geefI18NWaarde">
		<xsl:param name="sSleutel"			as="xs:string"/>
		<xsl:param name="sTaalCode"			as="xs:string"/>
		<xsl:param name="bSpatiePre" 		as="xs:boolean"/>
		<xsl:param name="bSpatiePost" 	as="xs:boolean"/>
		<xsl:value-of select="concat(if($bSpatiePre) then ' ' else '',$sqI18n[@sleutel=$sSleutel and @taal=$sTaalCode]/@waarde,if($bSpatiePost) then ' ' else '')"/>
	</xsl:function>
	
	<!-- 
	|| local:getLocalDateTimeFromZuluString() wijzigt op basis van de actuele timezone de zulu-tijd in de actuele tijd
	-->
	<xsl:function name="local:getLocalDateTimeFromZuluString" as="xs:dateTime">
		<xsl:param name="sZuluString"/>
		<xsl:sequence 	select="adjust-dateTime-to-timezone(xs:dateTime($sZuluString),$tzCurrentTimeZone)"/>
	</xsl:function>
	
	<!--  
		|| local:geefVertraging() geeft op basis van de parameters op basis van de specificaties de juiste opmaak voor de vertraging
	-->
	<xsl:function name="local:geefVertraging">
		<xsl:param name="nsOmschrijving" 		  as="element()"/>
		<xsl:param name="sPresentatieType" 		as="xs:string"/>
		<xsl:param name="sCode"								as="xs:string"/>
		<xsl:param name="sVan"								as="xs:string?"/>
		<xsl:param name="sTot"								as="xs:string?"/>
		<xsl:param name="sTaalCode"						as="xs:string"/>
	  
	  <xsl:choose>
  		<xsl:when test="contains('2345',$sCode) and (not(string-length($sVan)) or $sVan='0') and (not(string-length($sTot)) or $sTot='0')">
    		<xsl:value-of	select="local:geefI18NWaarde('Geen extra reistijd',$sTaalCode,true(),false())"/>
  		  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
  		</xsl:when>
	    <xsl:otherwise>
				<xsl:value-of select="local:capitalize(local:geefOmschrijving($nsOmschrijving,$sPresentatieType,$sTaalCode))"/>
    		<xsl:if test="(string-length($sVan) &gt;0 or string-length($sTot) &gt;0) and contains('2345',$sCode)">
      	  <xsl:variable name="sTotTeGebruiken"  as="xs:string?" select="if(string-length($sTot)) then $sTot else $sVan"/>
      	  <xsl:variable name="sVanTeGebruiken"  as="xs:string?" select="if(string-length($sVan)) then $sVan else $sTot"/>
      	  <xsl:variable name="bIsLang" 					as="xs:boolean" select="$sPresentatieType=$sPresentatieTypeLang"/>
      		<xsl:variable name="sMinuten"					as="xs:string"	select="if($bIsLang) then local:geefI18NWaarde('minuten',$sTaalCode,true(),false()) else local:geefI18NWaarde('min.',$sTaalCode,true(),false())"/>
      		<xsl:variable name="sEn"							as="xs:string"	select="if($bIsLang) then local:geefI18NWaarde('en',$sTaalCode,true(),true()) else '-'"/>
    			<xsl:text> </xsl:text>
    			<xsl:choose>
    			  <xsl:when test="$sCode='3'">
    				  <xsl:value-of select="$sTotTeGebruiken"/>
    				</xsl:when>
    				<xsl:otherwise>
    				  <xsl:value-of select="$sVanTeGebruiken"/>
    				</xsl:otherwise>
    			</xsl:choose>
    			<xsl:if test="$sCode='5'">
    				<xsl:value-of select="$sEn"/>
    			  <xsl:value-of select="$sTotTeGebruiken"/>
    			</xsl:if>
    			<xsl:value-of select="$sMinuten"/>
    		</xsl:if>
  		  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
	    </xsl:otherwise>
	  </xsl:choose>
	</xsl:function>

	<xsl:function name="local:geefExtraRijstijd">
		<xsl:param name="sPresentatieType" 		as="xs:string"/>
		<xsl:param name="sVan"								as="xs:string?"/>
		<xsl:param name="sTot"								as="xs:string?"/>
		<xsl:param name="sTaalCode"						as="xs:string"/>
		<xsl:choose>
			<xsl:when test="not($sVan castable as xs:duration) or not($sTot castable as xs:duration)">
				<xsl:text>van: </xsl:text>
				<xsl:value-of select="$sVan"/>
				<xsl:text> tot: </xsl:text>
				<xsl:value-of select="$sTot"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:variable name="dtdVan"						as="xs:duration" 	select="xs:duration($sVan)" />
				<xsl:variable name="dtdTot"						as="xs:duration"	select="xs:duration($sTot)"/>
			  <xsl:variable name="iVan"							as="xs:integer" 	select="local:total-minutes-from-duration($dtdVan)"/>
			  <xsl:variable name="iTot"							as="xs:integer"		select="local:total-minutes-from-duration($dtdTot)"/>				
				<xsl:if test="$iVan &gt; 0 or $iTot &gt;0">
					<xsl:variable name="bIsLang" 					as="xs:boolean" 	select="$sPresentatieType=$sPresentatieTypeLang"/>
					<xsl:variable name="sMinuten"					as="xs:string"		select="if($bIsLang) then local:geefI18NWaarde('minuten',$sTaalCode,true(),false()) else local:geefI18NWaarde('min.',$sTaalCode,true(),false())"/>
					<xsl:variable name="sPre"							as="xs:string"		select="if($bIsLang) then local:geefI18NWaarde('Extra reistijd lang',$sTaalCode,false(),false()) else local:geefI18NWaarde('Extra reistijd',$sTaalCode,false(),false())"/>
					<xsl:text> </xsl:text>
					<xsl:value-of select="$sPre"/>
					<xsl:choose>
						<xsl:when test="$iVan &gt; 0 and $iVan &lt; $iTot">
							<xsl:value-of select="if($bIsLang) then local:geefI18NWaarde('tussen',$sTaalCode,true(),true()) else ': '"/>
							<xsl:value-of select="$iVan"/>
							<xsl:value-of select="if($bIsLang) then local:geefI18NWaarde('en',$sTaalCode,true(),true()) else '-'"/>
							<xsl:value-of select="$iTot"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:variable name="sTot"	as="xs:string"		select="local:geefI18NWaarde('tot',$sTaalCode,true(),true()) "/>
							<xsl:value-of select="$sTot"/>
							<xsl:value-of select="$iTot"/>
						</xsl:otherwise>
					</xsl:choose>
					<xsl:value-of select="$sMinuten"/>
				</xsl:if>
			</xsl:otherwise>
		</xsl:choose>
	  <xsl:sequence select="local:zetOptionelePunt($sPresentatieType)"/>
	</xsl:function>
  
  <xsl:function name="local:total-minutes-from-duration" as="xs:integer">
    <xsl:param name="duration" as="xs:duration"/>
    <xsl:variable name="iMinutesFromDays"		 as="xs:integer" 	select="days-from-duration($duration) * 24 * 60"/>
    <xsl:variable name="iMinutesFromHours"	 as="xs:integer" 	select="hours-from-duration($duration) * 60"/>
    <xsl:variable name="iMinutesFromMinutes" as="xs:integer" 	select="minutes-from-duration($duration)"/>
    <xsl:sequence select="$iMinutesFromDays + $iMinutesFromHours + $iMinutesFromMinutes"/>
  </xsl:function>
	
	<!--  
		|| local:geefElementNaamStationsNaam() geeft op basis van het sPresentatieType de elementnaam die nodig is om het juiste station te kiezen
	-->
	<xsl:function name="local:geefElementNaamStationsNaam" as="xs:string">
		<xsl:param name="sPresentatieType"	as="xs:string"/>
		<xsl:variable name="bIsLang" 				as="xs:boolean" select="$sPresentatieType=$sPresentatieTypeLang"/>
		<xsl:value-of select="if($bIsLang) then concat($sPresentatieType,'eNaam') else concat($sPresentatieType,'Naam')"/>
	</xsl:function>
	
	<!--  
		|| local:geefPresentaieElementNaam() geeft op basis van het nsElement de elementnaam voor het Presentatie-element
	-->
	<xsl:function name="local:geefPresentaieElementNaam" as="xs:string">
		<xsl:param name="nsElement" as="element()"/>
		<xsl:sequence select="concat('Presentatie',local-name($nsElement))"/>
	</xsl:function>

	<!--  
		|| local:selectTaalCode() geeft op basis van optionele aanwezigheid van sTaalCode de correcte Taalcode terug
	-->
	<xsl:function name="local:selectTaalCode" as="xs:string">
		<xsl:param name="sTaalCode" as="xs:string?"/>
		<xsl:sequence select="if($sTaalCode) then $sTaalCode else 'nl'"/>
	</xsl:function>
		
	<!-- 
		|| local:geefOmschrijving() selecteert op basis van sPresentatieType en de sTaalCode het juiste element.
		|| Als een presentatietype niet aanwezig is dan wordt een andere gekozen
	-->
	<xsl:function name="local:geefOmschrijving" as="xs:string?">
		<xsl:param name="nsElement" 				as="element()*"/>
		<xsl:param name="sPresentatieType"	as="xs:string"/>
		<xsl:param name="sTaalCode" 				as="xs:string"/>
		<xsl:variable name="nsOmschrijvingInJuisteTaal" as="element()" select="$nsElement[TaalCode=$sTaalCode or (not(TaalCode) and $sTaalCode='nl')]"/>
		<xsl:choose>
		  <xsl:when test="$nsOmschrijvingInJuisteTaal/*[local-name()=$sPresentatieType]">
		    <xsl:sequence select="$nsOmschrijvingInJuisteTaal/*[local-name()=$sPresentatieType]"/>
			</xsl:when>
			<xsl:when test="$nsOmschrijvingInJuisteTaal/Middel">
				<xsl:sequence select="$nsOmschrijvingInJuisteTaal/Middel"/>
			</xsl:when>
			<xsl:when test="$nsOmschrijvingInJuisteTaal/Lang">
				<xsl:sequence select="$nsOmschrijvingInJuisteTaal/Lang"/>
			</xsl:when>
			<xsl:when test="$nsOmschrijvingInJuisteTaal/Kort">
				<xsl:sequence select="$nsOmschrijvingInJuisteTaal/Kort"/>
			</xsl:when>
		</xsl:choose>
	</xsl:function>

  <!-- Uitleg: 
		      1. Het element MateVertraging dient bij VertragingsKeuzeCode 2,3,4 tenminste een element VertragingVanIncl of  VertragingTotIncl te hebben
		      2. Het element MateVertraging dient bij VertragingsKeuzeCode 5         zowel een element VertragingVanIncl als VertragingTotIncl te hebben
		  -->
  <xsl:function name="local:codeMetTijdsElementenisValide" as="xs:boolean">
    <xsl:param name="sCode"	as="xs:string"/>
    <xsl:param name="nsVan"	as="element()?"/>
    <xsl:param name="nsTot"	as="element()?"/>
    <xsl:variable name="sCodeChar" as="xs:string" select="translate($sCode,'0','')"/>
    <xsl:variable name="bVan" as="xs:boolean" select="boolean($nsVan) and string-length($nsVan/text()) &gt;0"/>
    <xsl:variable name="bTot" as="xs:boolean" select="boolean($nsTot) and string-length($nsTot/text()) &gt;0"/>
    <xsl:choose>
      <xsl:when test="string-length($sCodeChar)=0">
        <xsl:value-of select="false()"/>
      </xsl:when>
      <xsl:when test="$sCodeChar='5' and (not($bVan) or not($bTot))">
        <xsl:value-of select="false()"/>
      </xsl:when>
      <xsl:when test="contains('234',$sCodeChar) and not($bVan) and not($bTot)">
        <xsl:value-of select="false()"/>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="true()"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:function>

	<!-- 
		|| local:capitalize() functienaam doet naam eer aan.
	-->
  <xsl:function name="local:zetOptionelePunt" as="xs:string?">
		<xsl:param name="sPresentatieType"	as="xs:string"/>
    <xsl:if test="$sPresentatieType=$sPresentatieTypeLang">
      <xsl:text>.</xsl:text>
    </xsl:if>
  </xsl:function>

	<!-- 
		|| local:capitalize() functienaam doet naam eer aan.
	-->
  <xsl:function name="local:capitalize" as="xs:string">
    <xsl:param name="sSource"	as="xs:string?"/>
    <xsl:sequence select="concat(upper-case(substring($sSource,1,1)),substring($sSource,2))"/>
  </xsl:function>

  <!-- 
		|| local:writeCompareId() schrijft optioneel(Alleen als het om een test gaat) een id-attribuut, waardoor tijdens het testen het vergelijken van de presentatie elementen versnelt.
	-->
	<xsl:function name="local:writeCompareId" as="processing-instruction()?">
		<xsl:param name="sPrefix" 				as="xs:string"/>
		<xsl:param name="nsSourceElement" as="element()"/>
		<xsl:if test="$bWriteCompareIds">
			<xsl:processing-instruction name="id" select="concat($sPrefix,'-',$nsSourceElement/@id)"/>
		</xsl:if>
	</xsl:function>
  
  <!-- 
		|| local:geefDagpresentatie() toont de datum, rekening houdiend met de door de ns gespecificeerde waardes voor afkortingen in maanden.
	-->
  <xsl:function name="local:geefDagpresentatie">
    <xsl:param name="dtBron" 				    as="xs:dateTime"/>
    <xsl:param name="sPresentatieType"	as="xs:string"/>
    <xsl:param name="sTaalCode"         as="xs:string"/>
    <xsl:choose>
      <xsl:when test="$sPresentatieType=$sPresentatieTypeLang">
        <xsl:sequence select="lower-case(format-dateTime($dtBron,'[Fn] [D] [MNn]', $sTaalCode, (), ()))"/>
      </xsl:when>
      <xsl:otherwise>
        <!-- 
          || sMaandNummerI18String: Vang de nummerieke waarde van een maand om vervolgens op te zoeken in sqI18n-variabele.
          || Bijvoorbeeld 2016-09-04T15:00:00Z wordt "Maand05Middel"
          || sMaandAfkorting: Maand05Middel geeft voor Nederlands "juni".
          || return: replace "@@" door "juni".
        -->
        <xsl:variable name="sMaandNummerI18String" as="xs:string" select="concat('Maand',format-dateTime($dtBron,'[M01]'),'Middel')"/>
        <xsl:variable name="sMaandAfkorting" as="xs:string" select="local:geefI18NWaarde($sMaandNummerI18String,$sTaalCode,false(),false())"/>
        <xsl:sequence select="replace(format-dateTime($dtBron,'[Fn,2-2] [D] @@', $sTaalCode, (), ()),'@@',$sMaandAfkorting)"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:function>

	<!-- 
		|| Template die zowel zelfstandig zorgt voor het doorkopieren van niet gematchte elementen als zorgt voor doorkopieren van een aangeroepen template
	-->
	<xsl:template name="copy" match="*">
		<xsl:copy>
			<xsl:apply-templates select="@*,node()" />
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="@ApplicatieVersie"/>

	<xsl:template match="processing-instruction(xml-stylesheet)"/>

	<xsl:template match="@* | processing-instruction() |text() | comment()">
		<xsl:sequence select="."/>
	</xsl:template>
		
</xsl:stylesheet>