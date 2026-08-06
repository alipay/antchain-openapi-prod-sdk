// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SumbitInnerMermngcontractauditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务单元Id列表
    @NameInMap("bu_id_list")
    @Validation(required = true)
    public java.util.List<String> buIdList;

    // 合同类型
    @NameInMap("contract_type")
    @Validation(required = true)
    public String contractType;

    // 待审核合同信息
    @NameInMap("contract_file")
    @Validation(required = true)
    public FileInfo contractFile;

    // 审核立场
    @NameInMap("stance")
    @Validation(required = true)
    public String stance;

    // 业务目标
    @NameInMap("business_goals")
    public String businessGoals;

    // 是否开启 AI 基准线审核,默认 false
    @NameInMap("ai_baseline_flag")
    @Validation(required = true)
    public Boolean aiBaselineFlag;

    public static SumbitInnerMermngcontractauditRequest build(java.util.Map<String, ?> map) throws Exception {
        SumbitInnerMermngcontractauditRequest self = new SumbitInnerMermngcontractauditRequest();
        return TeaModel.build(map, self);
    }

    public SumbitInnerMermngcontractauditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SumbitInnerMermngcontractauditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SumbitInnerMermngcontractauditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SumbitInnerMermngcontractauditRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SumbitInnerMermngcontractauditRequest setBuIdList(java.util.List<String> buIdList) {
        this.buIdList = buIdList;
        return this;
    }
    public java.util.List<String> getBuIdList() {
        return this.buIdList;
    }

    public SumbitInnerMermngcontractauditRequest setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public SumbitInnerMermngcontractauditRequest setContractFile(FileInfo contractFile) {
        this.contractFile = contractFile;
        return this;
    }
    public FileInfo getContractFile() {
        return this.contractFile;
    }

    public SumbitInnerMermngcontractauditRequest setStance(String stance) {
        this.stance = stance;
        return this;
    }
    public String getStance() {
        return this.stance;
    }

    public SumbitInnerMermngcontractauditRequest setBusinessGoals(String businessGoals) {
        this.businessGoals = businessGoals;
        return this;
    }
    public String getBusinessGoals() {
        return this.businessGoals;
    }

    public SumbitInnerMermngcontractauditRequest setAiBaselineFlag(Boolean aiBaselineFlag) {
        this.aiBaselineFlag = aiBaselineFlag;
        return this;
    }
    public Boolean getAiBaselineFlag() {
        return this.aiBaselineFlag;
    }

}
