// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EducationInfo extends TeaModel {
    // 专业
    @NameInMap("major")
    public String major;

    // 学历等级代码
    @NameInMap("education_level")
    public String educationLevel;

    // 毕业日期
    @NameInMap("graduation_date")
    public String graduationDate;

    // 学习形式
    @NameInMap("education_type")
    public String educationType;

    // 学校层级
    @NameInMap("school_type")
    public String schoolType;

    public static EducationInfo build(java.util.Map<String, ?> map) throws Exception {
        EducationInfo self = new EducationInfo();
        return TeaModel.build(map, self);
    }

    public EducationInfo setMajor(String major) {
        this.major = major;
        return this;
    }
    public String getMajor() {
        return this.major;
    }

    public EducationInfo setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }
    public String getEducationLevel() {
        return this.educationLevel;
    }

    public EducationInfo setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
        return this;
    }
    public String getGraduationDate() {
        return this.graduationDate;
    }

    public EducationInfo setEducationType(String educationType) {
        this.educationType = educationType;
        return this;
    }
    public String getEducationType() {
        return this.educationType;
    }

    public EducationInfo setSchoolType(String schoolType) {
        this.schoolType = schoolType;
        return this;
    }
    public String getSchoolType() {
        return this.schoolType;
    }

}
