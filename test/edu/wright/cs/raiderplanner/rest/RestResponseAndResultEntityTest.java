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

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author zooko
 *
 */
public class RestResponseAndResultEntityTest {
	
	
	@Test
	public void responseEntityIsReceived() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
		System.out.println("here");
		
		try {
			IpAddress ipAddress = objectMapper.readValue(new  URL("https://ipvigilante.com/68.1.1.1"), IpAddress.class);
			assertEquals(ipAddress.getOutcome(), "success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
