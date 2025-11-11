// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EducationStatus extends TeaModel {
    // 是否211院校
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("project211")
    public Boolean project211;

    // 是否985院校 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("project985")
    public Boolean project985;

    // boolean	是否双一流院校
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("double_first_class")
    public Boolean doubleFirstClass;

    // 入学时间
    /**
     * <strong>example:</strong>
     * <p>202109</p>
     */
    @NameInMap("admission_date")
    public String admissionDate;

    // 学制，字典
    /**
     * <strong>example:</strong>
     * <p>C</p>
     */
    @NameInMap("educational_system")
    public String educationalSystem;

    // boolean	是否注册学籍
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("registered_student_status")
    public Boolean registeredStudentStatus;

    public static EducationStatus build(java.util.Map<String, ?> map) throws Exception {
        EducationStatus self = new EducationStatus();
        return TeaModel.build(map, self);
    }

    public EducationStatus setProject211(Boolean project211) {
        this.project211 = project211;
        return this;
    }
    public Boolean getProject211() {
        return this.project211;
    }

    public EducationStatus setProject985(Boolean project985) {
        this.project985 = project985;
        return this;
    }
    public Boolean getProject985() {
        return this.project985;
    }

    public EducationStatus setDoubleFirstClass(Boolean doubleFirstClass) {
        this.doubleFirstClass = doubleFirstClass;
        return this;
    }
    public Boolean getDoubleFirstClass() {
        return this.doubleFirstClass;
    }

    public EducationStatus setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
        return this;
    }
    public String getAdmissionDate() {
        return this.admissionDate;
    }

    public EducationStatus setEducationalSystem(String educationalSystem) {
        this.educationalSystem = educationalSystem;
        return this;
    }
    public String getEducationalSystem() {
        return this.educationalSystem;
    }

    public EducationStatus setRegisteredStudentStatus(Boolean registeredStudentStatus) {
        this.registeredStudentStatus = registeredStudentStatus;
        return this;
    }
    public Boolean getRegisteredStudentStatus() {
        return this.registeredStudentStatus;
    }

}
