<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>

	<form:form action="rpadashboardcontroller" method="post" modelAttribute="RpaPipelineMaster">
		<table style="float:center">
			<tr>
				<td>Serial no.
				<td><form:input type="text" name="s_no" path="serialNumber" />
				<td>Business Unit
				<td><form:input type="text" name="bu" path="businessUnit"/>
				<td> <a href="home.jsp">Dashboard</a>
			</tr>
			<tr>
				<td>Account
				<td><form:input type="text" name="account" path="account" />
				<td>RPA COE BSV Involved
				<td><form:input type="text" name="rpa_coe_involved" path="rpaCoeBsvInvolved"/>
			<tr>
				<td>RPA Team Contact
				<td><form:input type="text" name="team_contact" path="rpaTeamContact"/>
				<td>BU/Account Connect
				<td><form:input type="text" name="bu_connect" path="buAccountConnect"/>
			<tr>
				<td>Regions
				<td><form:input type="text" name="regions" path="regions"/>
			<tr>
				
			<tr>
				<td>Sales Stage
				<td><form:select name="sales_stage" path="salesStages">
						<option value="opp_qual">Opportunity Qualification</option>
						<option value="win_strag">Winning Strategy</option>
						<option value="fin_sol">Finalizing Solution</option>
						<option value="prop">Proposing</option>
						<option value="form_agr">Formalizing Agreement</option>
				</form:select>
				<td>Opportunity Category
				<td><form:select name="opp_categ" path="opportunityCategory">
						<option value="in_disc">Initial Discussion</option>
						<option value="rfp">RFP</option>
						<option value="rfi">RFI</option>
						<option value="rfq">RFQ</option>
						<option value="poc">POC</option>
						<option value="pilot">Pilot</option>
						<option value="project">Project</option>
				</form:select>
			<tr>
				<td>Key Opportunity Y/N
				<td><form:radiobutton name="key_opp" path="keyOpportunity" value="yes" />
					Yes<br> <form:radiobutton name="key_opp" path="keyOpportunity" value="no"/>
					No<br>
						
			<tr>
				<td>Opportunity Short Description
				
				<td><form:textarea rows="4" cols="50" name="opp_short_desc" path="opportunityDescription"></form:textarea>
			<tr>
				<td>Current Status of the deal
				<td><form:input type="text" name="csod" path="currentStatusOfDeal"/>
				<td>Value (EUR)
				<td><form:input type="text" name="value" path="value" />
			<tr>
				<td>Deal Size
				<td><form:select name="deal_size" path="dealSize">
						<option value="grand"><100K</option>
						<option value="five_grand">101K-500K</option>
						<option value="ten_grand">501K-1000K</option>
						<option value="hundred_grand">>1000K</option>
				</form:select>
				<td>Probability
				<td><form:select name="probability" path="probability">
						<option value="first_q">0%-25%</option>
						<option value="second_q">26%-50%</option>
						<option value="third_q">51%-75%</option>
						<option value="fourth_q">76%-100%</option>
				</form:select>
			
			<tr>
				<td>Scope
				<td><form:input type="text" name="scope" path="scope"/>
				<td>Technology
				<td><form:input type="text" name="technology" path="technology" />
			<tr>
				<td>Opportunity Start Date
				<td><form:input type="date" name="opp_start_date" path="opportunityStartDate"/>
				<td>Expected Opportunity closure date
				<td><form:input type="date" name="expec_clos_date" path="expectedOpportunityClosureDate"/>
			
			
			<tr> <td>Expected Closure Quarter- Year
				<td><form:select id="expec_clos_quart" path="expectedClosureQuarterYear" name="expec_clos_quart">
						<option value="Q1">Q1</option>
						<option value="Q2">Q2</option>
						<option value="Q3">Q3</option>
						<option value="Q4">Q4</option>
					</form:select>
			<%-- <tr>
				<td>Expected Closure Quarter- Year
				<td><form:select id="expec_clos_quart" name="expec_clos_quart">
						<option value="Q1">Q1</option>
						<option value="Q2">Q2</option>
						<option value="Q3">Q3</option>
						<option value="Q4">Q4</option>
					</form:select>
				    <form:select id="expec_clos_year" name="expec_clos_year">
						<option value="2018">2018</option>
						<option value="2019">2019</option>
						<option value="2020">2020</option>
						<option value="2021">2021</option>
						<option value="2022">2022</option>
						<option value="2023">2023</option>
						<option value="2024">2024</option>
						<option value="2025">2025</option>
					</form:select>
					<td>Delivery Location
					<td><form:input type="text" name="deliv_loc" /> --%>
				<tr>
					<td>Project start date(Expected)
					<td><form:input type="date" name="proj_start_date" path="projectedStartDate"/>
					<td>Project End date (Expected)
					<td><form:input type="date" name="proj_end_date" path="projectedEndDate"/>
		
			<tr>
				<td># of Resource demand
				<td><form:input type="text" name="no_res_demand" path="resourceCountDemand"/>
				<td>Bill Rates
				<td><form:input type="text" name="bill_rates" path="billRate" />
			<tr>
				<td>THOR ID
				<td><form:input type="text" name="thor_id" path="thorId"/>
			<tr>
				
				<td>Comments
				<td><form:textarea rows="4" cols="50" name="comments" path="comments"></form:textarea>
			
			<tr>
				<%-- <td>
				<td align="center"><form:button text="Reset"  type="Reset"/>
				<td align="center"><form:button text="Submit" type="Submit"/> --%>
				
				<td></td>
				<td align="center"><form:button id="RpaPipelineMaster" name="RpaPipelineMaster">Submit</form:button>
				</td>
			
		</table>
	</form:form>
</body>
</html>