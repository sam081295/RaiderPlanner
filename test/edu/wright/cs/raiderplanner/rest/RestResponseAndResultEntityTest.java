/*
 * Copyright (C) 2019
 *
 *
 *
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package edu.wright.cs.raiderplanner.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**This is test class for restful services.
 * @author zooko
 *
 */
public class RestResponseAndResultEntityTest {

	@Test
	public void responseEntityIsReceived() throws IOException {
		//URL url = new URL("https://ipvigilante.com/68.1.1.1");
		URL url = new URL("https://data.usajobs.gov/api/search?Keyword=Software");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestProperty("Authorization-Key", "J30THoB+Rjb2iHSuhXkuoGY4ZPSlzO1RVzRUrY/AlYQ=");
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		StringBuilder build = new StringBuilder();
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			build.append(inputLine);
		}
		in.close();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
		try {
			//IpAddress ipAddress = objectMapper.readValue(build.toString(), IpAddress.class); //new  URL("https://ipvigilante.com/68.1.1.1")
			JsonNode responseNode = new ObjectMapper().readTree(build.toString());
			JsonNode responseResultNode = responseNode.path("SearchResult");
			ResponseUsaJobs responseJobs = new ResponseUsaJobs();
			responseJobs.setLanguageCode(responseNode.get("LanguageCode").textValue());
			//System.out.println(responseResultNode.get("SearchResultItems"));
			
			//System.out.println(responseResultNode);
			ArrayNode itemArray = (ArrayNode) responseResultNode.path("SearchResultItems");
			JsonNode positionNode = responseResultNode.path("MatchedObjectID");
			System.out.println(positionNode);
			
			Iterator<JsonNode> itemIterator = itemArray.elements();
			int counter = 0;
			
			JsonNode position = itemArray.findValue("PositionTitle");
			JsonNode positionLocation = itemArray.findValue("PositionLocation");
			//JsonNode organization = itemArray.findValue("OrganizationName");
			String organization = itemArray.findValue("OrganizationName").toString();
			//JsonNode positionURI = itemArray.findValue("PositionURI");
//			System.out.println(position);
//			System.out.println(positionLocation.findValue("CityName"));
//			System.out.println(organization);
//			System.out.println(positionURI);
//			System.out.println(itemArray.findValue("PositionTitle"));
//			System.out.println(itemArray.findValue("PositionLocation"));
//			System.out.println(itemArray.findValue("PositionURI"));
			//System.out.println(itemArray.get(1));
			ArrayList positionList = new ArrayList<>();
			ArrayList locationList = new ArrayList<>();
			ArrayList organizationList = new ArrayList<>();
			ArrayList positionURI = new ArrayList<>();
			while (itemIterator.hasNext() & counter < 3) {
				JsonNode item = itemIterator.next();
				positionList.add(item.findValue("PositionTitle").toString());
				locationList.add(item.findValue("CityName").toString());
				organizationList.add(item.findValue("OrganizationName").toString());
				positionURI.add(item.findValue("PositionURI").toString());
				counter++;
			}

			System.out.println(positionList.get(0));
			System.out.println(positionList.get(1));
			System.out.println(positionList.get(2));
			//System.out.println(itemList.get(0));
			//System.out.println(itemList.get(1));


			//ResponseUsaJobs response = objectMapper
			//		.readValue(build.toString(),ResponseUsaJobs.class);
			//assertEquals(response.getLanguageCode(), "success");
			//assertEquals(response.getSearchResult(), "success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
