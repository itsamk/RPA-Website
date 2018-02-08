<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form action="RPADashboardController" method="post" modelAttribute="registerDeal">
		<table align="center">
			<tr>
				<td>Serial no.
				<td><input type="number" name="s_no" />
			</tr>
			<tr>
				<td>Business Unit
				<td><input type="text" name="bu" />
			<tr>
				<td>Account
				<td><input type="text" name="account" />
			<tr>
				<td>Regions
				<td><input type="text" name="regions" />
			<tr>
				<td>RPA COE BSV Involved
				<td><input type="text" name="rpa_coe_involved" />
			<tr>
				<td>RPA Team Contact
				<td><input type="text" name="team_contact" />
			<tr>
				<td>BU/Account Connect
				<td><input type="text" name="bu_connect" />
			<tr>
				<td>Sales Stage
				<td><select name="sales_stage">
						<option value="opp_qual">Opportunity Qualification</option>
						<option value="win_strag">Winning Strategy</option>
						<option value="fin_sol">Finalizing Solution</option>
						<option value="prop">Proposing</option>
						<option value="form_agr">Formalizing Agreement</option>
				</select>
			<tr>
				<td>Opportunity Category
				<td><select name="opp_categ">
						<option value="in_disc">Initial Discussion</option>
						<option value="rfp">RFP</option>
						<option value="rfi">RFI</option>
						<option value="rfq">RFQ</option>
						<option value="poc">POC</option>
						<option value="pilot">Pilot</option>
						<option value="project">Project</option>
				</select>
			<tr>
				<td>Key Opportunity Y/N
				<td><input type="radio" name="key_opp" value="yes" checked>
					Yes<br> <input type="radio" name="key_opp" value="no">
					No<br>
			<tr>
				<td>Opportunity Short Description
				<td><input type="text" name="opp_short_desc" />
			<tr>
				<td>Current Status of the deal
				<td><input type="text" name="csod" />
			<tr>
				<td>Value (EUR)
				<td><input type="text" name="value" />
			<tr>
				<td>Deal Size
				<td><select name="deal_size">
						<option value="volvo"><100K</option>
						<option value="saab">101K-500K</option>
						<option value="volvo">501K-1000K</option>
						<option value="saab">>1000K</option>
				</select>
			<tr>
				<td>Probability
				<td><select name="probability">
						<option value="volvo">0%-25%</option>
						<option value="saab">26%-50%</option>
						<option value="mercedes">51%-75%</option>
						<option value="audi">76%-100%</option>
				</select>
			<tr>
				<td>Scope
				<td><input type="text" name="scope" />
			<tr>
				<td>Technology
				<td><input type="text" name="technology" />
			<tr>
				<td>Opportunity Start Date
				<td><input type="date" name="opp_start_date" />
			<tr>
				<td>Expected Opportunity closure date
				<td><input type="date" name="expec_clos_date" />
			<tr>
				<td>Expected Closure Quarter- Year
				<td><select id="expec_clos_quart" name="expec_clos_quart">
						<option value="Q1">Q1</option>
						<option value="Q2">Q2</option>
						<option value="Q3">Q3</option>
						<option value="Q4">Q4</option>
					</select>
				    <select id="expec_clos_year" name="expec_clos_year">
						<option value="2018">2018</option>
						<option value="2019">2019</option>
						<option value="2020">2020</option>
						<option value="2021">2021</option>
						<option value="2022">2022</option>
						<option value="2023">2023</option>
						<option value="2024">2024</option>
						<option value="2025">2025</option>
					</select>
			<tr>
				<td>Project start date(Expected)
				<td><input type="date" name="proj_start_date" />
			<tr>
				<td>Delivery Location
				<td><input type="text" name="deliv_loc" />
			<tr>
				<td># of Resource demand
				<td><input type="text" name="no_res_demand" />
			<tr>
				<td>Bill rates
				<td><input type="text" name="bill_rates" />
			<tr>
				<td>Project End date (Expected)
				<td><input type="date" name="proj_end_date" />
			<tr>
				<td>Comments
				<td><input type="text" name="comments" />
			<tr>
				<td>THOR ID
				<td><input type="text" name="thor_id" />
			<tr>
				<td align="center"><input type="Reset">
				<td align="center"><input type="submit">
		</table>
	</form>
</body>
</html>