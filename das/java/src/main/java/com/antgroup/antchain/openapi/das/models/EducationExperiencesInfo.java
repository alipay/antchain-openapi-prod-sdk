// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EducationExperiencesInfo extends TeaModel {
    // 学历
    @NameInMap("degree")
    @Validation(maxLength = 32)
    public String degree;

    // 受教育地点
    @NameInMap("location")
    @Validation(maxLength = 128)
    public String location;

    // 学校名称
    @NameInMap("school_name")
    @Validation(maxLength = 128)
    public String schoolName;

    // 教育状态
    @NameInMap("education_status")
    @Validation(maxLength = 128)
    public String educationStatus;

    // 年
    @NameInMap("year")
    @Validation(maximum = 6)
    public Long year;

    // 月
    @NameInMap("month")
    @Validation(maximum = 5)
    public Long month;

    public static EducationExperiencesInfo build(java.util.Map<String, ?> map) throws Exception {
        EducationExperiencesInfo self = new EducationExperiencesInfo();
        return TeaModel.build(map, self);
    }

    public EducationExperiencesInfo setDegree(String degree) {
        this.degree = degree;
        return this;
    }
    public String getDegree() {
        return this.degree;
    }

    public EducationExperiencesInfo setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public EducationExperiencesInfo setSchoolName(String schoolName) {
        this.schoolName = schoolName;
        return this;
    }
    public String getSchoolName() {
        return this.schoolName;
    }

    public EducationExperiencesInfo setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus;
        return this;
    }
    public String getEducationStatus() {
        return this.educationStatus;
    }

    public EducationExperiencesInfo setYear(Long year) {
        this.year = year;
        return this;
    }
    public Long getYear() {
        return this.year;
    }

    public EducationExperiencesInfo setMonth(Long month) {
        this.month = month;
        return this;
    }
    public Long getMonth() {
        return this.month;
    }

}
