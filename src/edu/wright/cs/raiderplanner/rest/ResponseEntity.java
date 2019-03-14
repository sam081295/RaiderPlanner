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
 * Test entity for consuming REST service
 *  * @author zooko
 *
 */
public class ResponseEntity {	
	private String outcome;	
	private ResultEntity result;
	
	public ResponseEntity() {
		
	}

	/**
	 * @param outcome
	 * @param result
	 */
	@JsonCreator
	public ResponseEntity(String outcome, ResultEntity result) {
		super();
		this.outcome = outcome;
		this.result = result;
	}

	/**
	 * @return the outcome
	 */
	public String getOutcome() {
		return outcome;
	}

	/**
	 * @param outcome the outcome to set
	 */
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	/**
	 * @return the result
	 */
	public ResultEntity getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(ResultEntity result) {
		this.result = result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponseEntity [outcome=" + outcome + ", result=" + result + "]";
	}
	
	
	
}
