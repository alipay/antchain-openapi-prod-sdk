// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EducationTagInfo extends TeaModel {
    // 专业名称
    @NameInMap("major")
    public String major;

    // 学历等级代码
    @NameInMap("education_level")
    public String educationLevel;

    // 	
    // 毕业日期
    @NameInMap("graduation_date")
    public String graduationDate;

    // 学习形式
    @NameInMap("education_type")
    public String educationType;

    // 入学时间
    @NameInMap("admission_date")
    public String admissionDate;

    // 学校类型
    @NameInMap("school_type")
    public String schoolType;

    // 学习形式字典code
    @NameInMap("education_type_code")
    public String educationTypeCode;

    // 学校名称
    @NameInMap("school_name")
    public String schoolName;

    public static EducationTagInfo build(java.util.Map<String, ?> map) throws Exception {
        EducationTagInfo self = new EducationTagInfo();
        return TeaModel.build(map, self);
    }

    public EducationTagInfo setMajor(String major) {
        this.major = major;
        return this;
    }
    public String getMajor() {
        return this.major;
    }

    public EducationTagInfo setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }
    public String getEducationLevel() {
        return this.educationLevel;
    }

    public EducationTagInfo setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
        return this;
    }
    public String getGraduationDate() {
        return this.graduationDate;
    }

    public EducationTagInfo setEducationType(String educationType) {
        this.educationType = educationType;
        return this;
    }
    public String getEducationType() {
        return this.educationType;
    }

    public EducationTagInfo setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
        return this;
    }
    public String getAdmissionDate() {
        return this.admissionDate;
    }

    public EducationTagInfo setSchoolType(String schoolType) {
        this.schoolType = schoolType;
        return this;
    }
    public String getSchoolType() {
        return this.schoolType;
    }

    public EducationTagInfo setEducationTypeCode(String educationTypeCode) {
        this.educationTypeCode = educationTypeCode;
        return this;
    }
    public String getEducationTypeCode() {
        return this.educationTypeCode;
    }

    public EducationTagInfo setSchoolName(String schoolName) {
        this.schoolName = schoolName;
        return this;
    }
    public String getSchoolName() {
        return this.schoolName;
    }

}
