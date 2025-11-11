// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EducationInfo extends TeaModel {
    // 专业
    /**
     * <strong>example:</strong>
     * <p>计算机</p>
     */
    @NameInMap("major")
    public String major;

    // 学历等级代码
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("education_level")
    public String educationLevel;

    // 毕业日期
    /**
     * <strong>example:</strong>
     * <p>202006</p>
     */
    @NameInMap("graduation_date")
    public String graduationDate;

    // 学习形式
    /**
     * <strong>example:</strong>
     * <p>全日制</p>
     */
    @NameInMap("education_type")
    public String educationType;

    // 是否211
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("project211")
    public Boolean project211;

    // 是否985
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("project985")
    public Boolean project985;

    // 是否双一流
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("double_first_class")
    public Boolean doubleFirstClass;

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

}
