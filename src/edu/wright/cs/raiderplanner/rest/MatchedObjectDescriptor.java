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

/**Entity to describe the individual job match.
 * @author zooko
 *
 */
public class MatchedObjectDescriptor {
	private String positionId;
	private String positionTitle;
	private String positionUri;
	private String[] applyUri;
	private PositionLocation[] positionLoaction;
	private String organizationName;
	private String departmentName;
	private JobCategory[] jobCategory;
	private JobGrade[] jobGrade;
	private PositionSchedule[] positionSchedule;
	private PositionOfferingType[] positionOfferingType;
	private String qualificationSummary;
	private PositionRemuneration positionRemuneration;
	private String positionStartDate;
	private String positionEndDate;
	private String publicationStartDate;
	private String applicationCloseDate;
	private PositionFormattedDescription positionFormateedDescription;

	/**Default constructor.
	 *
	 **/
	public MatchedObjectDescriptor() {

	}

	/**Field constructor.
	 * @param positionId id
	 * @param positionTitle title
	 * @param positionUri uri
	 * @param applyUri applyuri
	 * @param positionLoaction location
	 * @param organizationName company
	 * @param departmentName department
	 * @param jobCategory category
	 * @param jobGrade grade
	 * @param positionSchedule schedule
	 * @param positionOfferingType type
	 * @param qualificationSummary job summary
	 * @param positionRemuneration job pay
	 * @param positionStartDate start date
	 * @param positionEndDate end date
	 * @param publicationStartDate publish date
	 * @param applicationCloseDate close date
	 * @param positionFormateedDescription formatted description
	 */
	@JsonCreator
	public MatchedObjectDescriptor(
			@JsonProperty("PositionID") String positionId,
			@JsonProperty("PositionTitle") String positionTitle,
			@JsonProperty("PositionURI")String positionUri,
			@JsonProperty("ApplyURI")String[] applyUri,
			@JsonProperty("PositionLocation")PositionLocation[] positionLoaction,
			@JsonProperty("OrganizationName")String organizationName,
			@JsonProperty("DepartmentName")String departmentName,
			@JsonProperty("JobCategory")JobCategory[] jobCategory,
			@JsonProperty("JobGrade")JobGrade[] jobGrade,
			@JsonProperty("PosotionSchedule")PositionSchedule[] positionSchedule,
			@JsonProperty("PositionOfferingType")PositionOfferingType[] positionOfferingType,
			@JsonProperty("QualificationSummary")String qualificationSummary,
			@JsonProperty("PositionRemuneration")PositionRemuneration positionRemuneration,
			@JsonProperty("PositionStartDate")String positionStartDate,
			@JsonProperty("PositionEndDate")String positionEndDate,
			@JsonProperty("PublicationStartDate")String publicationStartDate,
			@JsonProperty("ApplicationCloseDate")String applicationCloseDate,
			@JsonProperty("PositionFormattedDescription")
			PositionFormattedDescription positionFormateedDescription) {
		super();
		this.positionId = positionId;
		this.positionTitle = positionTitle;
		this.positionUri = positionUri;
		this.applyUri = applyUri;
		this.positionLoaction = positionLoaction;
		this.organizationName = organizationName;
		this.departmentName = departmentName;
		this.jobCategory = jobCategory;
		this.jobGrade = jobGrade;
		this.positionSchedule = positionSchedule;
		this.positionOfferingType = positionOfferingType;
		this.qualificationSummary = qualificationSummary;
		this.positionRemuneration = positionRemuneration;
		this.positionStartDate = positionStartDate;
		this.positionEndDate = positionEndDate;
		this.publicationStartDate = publicationStartDate;
		this.applicationCloseDate = applicationCloseDate;
		this.positionFormateedDescription = positionFormateedDescription;
	}


}
