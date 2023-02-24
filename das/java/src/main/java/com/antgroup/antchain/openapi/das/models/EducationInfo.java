// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EducationInfo extends TeaModel {
    // 是否211院校
    @NameInMap("project211")
    @Validation(required = true)
    public Boolean project211;

    // 是否985院校
    @NameInMap("project985")
    @Validation(required = true)
    public Boolean project985;

    // 是否双一流院校
    @NameInMap("double_first_class")
    @Validation(required = true)
    public Boolean doubleFirstClass;

    // 专业
    @NameInMap("major")
    @Validation(required = true)
    public String major;

    // 学历等级代码
    @NameInMap("education_level")
    @Validation(required = true)
    public String educationLevel;

    // 毕业日期
    @NameInMap("graduation_date")
    @Validation(required = true)
    public String graduationDate;

    // 学习形式
    @NameInMap("education_type")
    @Validation(required = true)
    public String educationType;

    public static EducationInfo build(java.util.Map<String, ?> map) throws Exception {
        EducationInfo self = new EducationInfo();
        return TeaModel.build(map, self);
    }

    public EducationInfo setProject211(Boolean project211) {
        this.project211 = project211;
        return this;
    }
    public Boolean getProject211() {
        return this.project211;
    }

    public EducationInfo setProject985(Boolean project985) {
        this.project985 = project985;
        return this;
    }
    public Boolean getProject985() {
        return this.project985;
    }

    public EducationInfo setDoubleFirstClass(Boolean doubleFirstClass) {
        this.doubleFirstClass = doubleFirstClass;
        return this;
    }
    public Boolean getDoubleFirstClass() {
        return this.doubleFirstClass;
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

}
