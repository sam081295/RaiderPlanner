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

/**
 * @author zooko
 *
 */
public class ResultEntity {

	private String name;
	
	private String alpha2_code;
	private String alpha3_code;
	
	public ResultEntity() {
		
	}

	/**
	 * @param name
	 * @param alpha2_code
	 * @param alpha3_code
	 */
	@JsonCreator
	public ResultEntity(String name, String alpha2_code, String alpha3_code) {
		super();
		this.name = name;
		this.alpha2_code = alpha2_code;
		this.alpha3_code = alpha3_code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the alpha2_code
	 */
	public String getAlpha2_code() {
		return alpha2_code;
	}

	/**
	 * @param alpha2_code the alpha2_code to set
	 */
	public void setAlpha2_code(String alpha2_code) {
		this.alpha2_code = alpha2_code;
	}

	/**
	 * @return the alpha3_code
	 */
	public String getAlpha3_code() {
		return alpha3_code;
	}

	/**
	 * @param alpha3_code the alpha3_code to set
	 */
	public void setAlpha3_code(String alpha3_code) {
		this.alpha3_code = alpha3_code;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResultEntity [name=" + name + ", alpha2_code=" + alpha2_code + ", alpha3_code="
				+ alpha3_code + "]";
	}
	
	
	
}
