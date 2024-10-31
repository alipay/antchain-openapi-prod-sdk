// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class WorkExperiencesInfo extends TeaModel {
    // 工作开始日期
    @NameInMap("work_start_time")
    @Validation(maximum = 32)
    public Long workStartTime;

    // 工作结束日期
    @NameInMap("work_end_time")
    @Validation(maximum = 32)
    public Long workEndTime;

    // 公司名称
    @NameInMap("company_name")
    @Validation(maxLength = 128)
    public String companyName;

    // 工作描述
    @NameInMap("work_desc")
    @Validation(maxLength = 1024)
    public String workDesc;

    // 职业
    @NameInMap("job_name")
    @Validation(maxLength = 128)
    public String jobName;

    // 行业名称
    @NameInMap("profession_name")
    @Validation(maxLength = 128)
    public String professionName;

    public static WorkExperiencesInfo build(java.util.Map<String, ?> map) throws Exception {
        WorkExperiencesInfo self = new WorkExperiencesInfo();
        return TeaModel.build(map, self);
    }

    public WorkExperiencesInfo setWorkStartTime(Long workStartTime) {
        this.workStartTime = workStartTime;
        return this;
    }
    public Long getWorkStartTime() {
        return this.workStartTime;
    }

    public WorkExperiencesInfo setWorkEndTime(Long workEndTime) {
        this.workEndTime = workEndTime;
        return this;
    }
    public Long getWorkEndTime() {
        return this.workEndTime;
    }

    public WorkExperiencesInfo setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public WorkExperiencesInfo setWorkDesc(String workDesc) {
        this.workDesc = workDesc;
        return this;
    }
    public String getWorkDesc() {
        return this.workDesc;
    }

    public WorkExperiencesInfo setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public WorkExperiencesInfo setProfessionName(String professionName) {
        this.professionName = professionName;
        return this;
    }
    public String getProfessionName() {
        return this.professionName;
    }

}
