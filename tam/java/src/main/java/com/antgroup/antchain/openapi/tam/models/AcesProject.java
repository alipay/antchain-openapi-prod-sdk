// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class AcesProject extends TeaModel {
    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 客户id
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 客户名称
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 产品线
    @NameInMap("project_line")
    public String projectLine;

    // 业务线
    @NameInMap("work_line")
    public String workLine;

    // 业务分类
    @NameInMap("biz_type")
    public String bizType;

    // 项目大阶段
    @NameInMap("project_big_stage")
    public String projectBigStage;

    // 转维状态
    @NameInMap("op_status")
    public String opStatus;

    // 交付阶段
    @NameInMap("deliver")
    public String deliver;

    // 是否售后
    @NameInMap("after_sale")
    public Boolean afterSale;

    //  
    @NameInMap("aliyun_bpid")
    public String aliyunBpid;

    // 解决方案架构师
    @NameInMap("sa")
    @Validation(required = true)
    public String sa;

    // 项目经理
    @NameInMap("pm")
    @Validation(required = true)
    public String pm;

    // 商务经理
    @NameInMap("bd")
    @Validation(required = true)
    public String bd;

    // 交付经理
    @NameInMap("tm")
    @Validation(required = true)
    public String tm;

    // 项目状态
    @NameInMap("project_stage")
    public String projectStage;

    // 项目交付状态（未启动、已启动等）
    @NameInMap("project_status")
    public String projectStatus;

    // 是否需要交付 1需要 0不需要
    @NameInMap("need_deliver")
    @Validation(required = true)
    public String needDeliver;

    // 是否需要提前进场 1需要 0不需要
    @NameInMap("need_ad_entry")
    @Validation(required = true)
    public String needAdEntry;

    // 是否需要竞标 1需要 0不需要
    @NameInMap("need_tender")
    @Validation(required = true)
    public String needTender;

    public static AcesProject build(java.util.Map<String, ?> map) throws Exception {
        AcesProject self = new AcesProject();
        return TeaModel.build(map, self);
    }

    public AcesProject setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AcesProject setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public AcesProject setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public AcesProject setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public AcesProject setProjectLine(String projectLine) {
        this.projectLine = projectLine;
        return this;
    }
    public String getProjectLine() {
        return this.projectLine;
    }

    public AcesProject setWorkLine(String workLine) {
        this.workLine = workLine;
        return this;
    }
    public String getWorkLine() {
        return this.workLine;
    }

    public AcesProject setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public AcesProject setProjectBigStage(String projectBigStage) {
        this.projectBigStage = projectBigStage;
        return this;
    }
    public String getProjectBigStage() {
        return this.projectBigStage;
    }

    public AcesProject setOpStatus(String opStatus) {
        this.opStatus = opStatus;
        return this;
    }
    public String getOpStatus() {
        return this.opStatus;
    }

    public AcesProject setDeliver(String deliver) {
        this.deliver = deliver;
        return this;
    }
    public String getDeliver() {
        return this.deliver;
    }

    public AcesProject setAfterSale(Boolean afterSale) {
        this.afterSale = afterSale;
        return this;
    }
    public Boolean getAfterSale() {
        return this.afterSale;
    }

    public AcesProject setAliyunBpid(String aliyunBpid) {
        this.aliyunBpid = aliyunBpid;
        return this;
    }
    public String getAliyunBpid() {
        return this.aliyunBpid;
    }

    public AcesProject setSa(String sa) {
        this.sa = sa;
        return this;
    }
    public String getSa() {
        return this.sa;
    }

    public AcesProject setPm(String pm) {
        this.pm = pm;
        return this;
    }
    public String getPm() {
        return this.pm;
    }

    public AcesProject setBd(String bd) {
        this.bd = bd;
        return this;
    }
    public String getBd() {
        return this.bd;
    }

    public AcesProject setTm(String tm) {
        this.tm = tm;
        return this;
    }
    public String getTm() {
        return this.tm;
    }

    public AcesProject setProjectStage(String projectStage) {
        this.projectStage = projectStage;
        return this;
    }
    public String getProjectStage() {
        return this.projectStage;
    }

    public AcesProject setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }
    public String getProjectStatus() {
        return this.projectStatus;
    }

    public AcesProject setNeedDeliver(String needDeliver) {
        this.needDeliver = needDeliver;
        return this;
    }
    public String getNeedDeliver() {
        return this.needDeliver;
    }

    public AcesProject setNeedAdEntry(String needAdEntry) {
        this.needAdEntry = needAdEntry;
        return this;
    }
    public String getNeedAdEntry() {
        return this.needAdEntry;
    }

    public AcesProject setNeedTender(String needTender) {
        this.needTender = needTender;
        return this;
    }
    public String getNeedTender() {
        return this.needTender;
    }

}
