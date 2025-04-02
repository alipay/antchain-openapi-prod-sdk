// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class JobInfo extends TeaModel {
    // 职业
    @NameInMap("job_type")
    public String jobType;

    // 职务
    @NameInMap("work_position")
    public String workPosition;

    // 工作年限
    @NameInMap("job_life")
    public String jobLife;

    // 本单位工作年限
    @NameInMap("current_job_life")
    public Long currentJobLife;

    // 公司名称
    @NameInMap("company_name")
    public String companyName;

    // 公司行业类型
    @NameInMap("company_industry_type")
    public String companyIndustryType;

    // 公司电话
    @NameInMap("company_tel")
    public String companyTel;

    // 公司省份
    @NameInMap("company_province")
    public String companyProvince;

    // 公司城市
    @NameInMap("company_city")
    public String companyCity;

    // 公司区域
    @NameInMap("company_area")
    public String companyArea;

    // 公司街道
    @NameInMap("company_street")
    public String companyStreet;

    // 公司详细地址
    @NameInMap("company_address")
    public String companyAddress;

    // 年收入
    @NameInMap("year_salary")
    public Long yearSalary;

    public static JobInfo build(java.util.Map<String, ?> map) throws Exception {
        JobInfo self = new JobInfo();
        return TeaModel.build(map, self);
    }

    public JobInfo setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public JobInfo setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
        return this;
    }
    public String getWorkPosition() {
        return this.workPosition;
    }

    public JobInfo setJobLife(String jobLife) {
        this.jobLife = jobLife;
        return this;
    }
    public String getJobLife() {
        return this.jobLife;
    }

    public JobInfo setCurrentJobLife(Long currentJobLife) {
        this.currentJobLife = currentJobLife;
        return this;
    }
    public Long getCurrentJobLife() {
        return this.currentJobLife;
    }

    public JobInfo setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public JobInfo setCompanyIndustryType(String companyIndustryType) {
        this.companyIndustryType = companyIndustryType;
        return this;
    }
    public String getCompanyIndustryType() {
        return this.companyIndustryType;
    }

    public JobInfo setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
        return this;
    }
    public String getCompanyTel() {
        return this.companyTel;
    }

    public JobInfo setCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
        return this;
    }
    public String getCompanyProvince() {
        return this.companyProvince;
    }

    public JobInfo setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
        return this;
    }
    public String getCompanyCity() {
        return this.companyCity;
    }

    public JobInfo setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
        return this;
    }
    public String getCompanyArea() {
        return this.companyArea;
    }

    public JobInfo setCompanyStreet(String companyStreet) {
        this.companyStreet = companyStreet;
        return this;
    }
    public String getCompanyStreet() {
        return this.companyStreet;
    }

    public JobInfo setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public JobInfo setYearSalary(Long yearSalary) {
        this.yearSalary = yearSalary;
        return this;
    }
    public Long getYearSalary() {
        return this.yearSalary;
    }

}
