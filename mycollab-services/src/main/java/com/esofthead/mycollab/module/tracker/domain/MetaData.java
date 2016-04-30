/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_tracker_metadata*/
package com.esofthead.mycollab.module.tracker.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_tracker_metadata")
public class MetaData extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_metadata.id
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_metadata.projectid
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    @Column("projectid")
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_metadata.xmlstring
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    @Length(max=2147483647, message="Field value is too long")
    @Column("xmlstring")
    private String xmlstring;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        MetaData item = (MetaData)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(459, 1491).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_metadata.id
     *
     * @return the value of m_tracker_metadata.id
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_metadata.id
     *
     * @param id the value for m_tracker_metadata.id
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_metadata.projectid
     *
     * @return the value of m_tracker_metadata.projectid
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_metadata.projectid
     *
     * @param projectid the value for m_tracker_metadata.projectid
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_metadata.xmlstring
     *
     * @return the value of m_tracker_metadata.xmlstring
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    public String getXmlstring() {
        return xmlstring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_metadata.xmlstring
     *
     * @param xmlstring the value for m_tracker_metadata.xmlstring
     *
     * @mbggenerated Fri Apr 29 10:32:17 ICT 2016
     */
    public void setXmlstring(String xmlstring) {
        this.xmlstring = xmlstring;
    }

    public enum Field {
        id,
        projectid,
        xmlstring;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}