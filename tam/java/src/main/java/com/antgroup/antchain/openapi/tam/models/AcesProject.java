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

}
