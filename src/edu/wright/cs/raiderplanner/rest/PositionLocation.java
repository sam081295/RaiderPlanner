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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zooko
 *
 */
public class PositionLocation {
	private String locationName;
	private String countryCode;
	private String countrySubDivisionCode;
	private String cityName;
	private float longitude;
	private float latitude;

	/**Default constructor.
	 */
	public PositionLocation() {

	}

	/**Field constructor.
	 * @param locationName location name
	 * @param countryCode country code
	 * @param countrySubDivisionCode country subdivision code
	 * @param cityName city name
	 * @param longitude long
	 * @param latitude lat
	 */
	@JsonCreator
	public PositionLocation(
			@JsonProperty ("LocationName") String locationName,
			@JsonProperty("CountryCode") String countryCode,
			@JsonProperty("CountrySubDivisionCode") String countrySubDivisionCode,
			@JsonProperty("CityName") String cityName,
			@JsonProperty("Longitude") float longitude,
			@JsonProperty("Latitude") float latitude) {
		this.locationName = locationName;
		this.countryCode = countryCode;
		this.countrySubDivisionCode = countrySubDivisionCode;
		this.cityName = cityName;
		this.longitude = longitude;
		this.latitude = latitude;
	}


}
