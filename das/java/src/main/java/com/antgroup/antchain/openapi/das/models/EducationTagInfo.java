// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EducationTagInfo extends TeaModel {
    // 	
    // 是否211院校
    @NameInMap("project211")
    public Boolean project211;

    // 是否985院校
    @NameInMap("project985")
    public Boolean project985;

    // 是否双一流院校
    @NameInMap("double_first_class")
    public Boolean doubleFirstClass;

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

    public static EducationTagInfo build(java.util.Map<String, ?> map) throws Exception {
        EducationTagInfo self = new EducationTagInfo();
        return TeaModel.build(map, self);
    }

    public EducationTagInfo setProject211(Boolean project211) {
        this.project211 = project211;
        return this;
    }
    public Boolean getProject211() {
        return this.project211;
    }

    public EducationTagInfo setProject985(Boolean project985) {
        this.project985 = project985;
        return this;
    }
    public Boolean getProject985() {
        return this.project985;
    }

    public EducationTagInfo setDoubleFirstClass(Boolean doubleFirstClass) {
        this.doubleFirstClass = doubleFirstClass;
        return this;
    }
    public Boolean getDoubleFirstClass() {
        return this.doubleFirstClass;
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

}
