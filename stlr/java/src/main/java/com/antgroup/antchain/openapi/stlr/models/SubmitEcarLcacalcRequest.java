// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class SubmitEcarLcacalcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目标产品编码
    @NameInMap("material_code")
    @Validation(required = true)
    public String materialCode;

    // 授权过程编码
    @NameInMap("process_no")
    @Validation(required = true)
    public String processNo;

    // 生命周期边界
    @NameInMap("life_cycle_boundary")
    @Validation(required = true)
    public String lifeCycleBoundary;

    // 产品功能单位
    @NameInMap("functional_unit")
    @Validation(required = true)
    public String functionalUnit;

    // 功能单位数量
    @NameInMap("functional_amount")
    @Validation(required = true)
    public String functionalAmount;

    // 各阶段活动数据
    @NameInMap("stage_active_data_list")
    @Validation(required = true)
    public java.util.List<LcaStageActiveData> stageActiveDataList;

    // 自定义业务标识
    @NameInMap("custom_context")
    public String customContext;

    public static SubmitEcarLcacalcRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEcarLcacalcRequest self = new SubmitEcarLcacalcRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEcarLcacalcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitEcarLcacalcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitEcarLcacalcRequest setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
        return this;
    }
    public String getMaterialCode() {
        return this.materialCode;
    }

    public SubmitEcarLcacalcRequest setProcessNo(String processNo) {
        this.processNo = processNo;
        return this;
    }
    public String getProcessNo() {
        return this.processNo;
    }

    public SubmitEcarLcacalcRequest setLifeCycleBoundary(String lifeCycleBoundary) {
        this.lifeCycleBoundary = lifeCycleBoundary;
        return this;
    }
    public String getLifeCycleBoundary() {
        return this.lifeCycleBoundary;
    }

    public SubmitEcarLcacalcRequest setFunctionalUnit(String functionalUnit) {
        this.functionalUnit = functionalUnit;
        return this;
    }
    public String getFunctionalUnit() {
        return this.functionalUnit;
    }

    public SubmitEcarLcacalcRequest setFunctionalAmount(String functionalAmount) {
        this.functionalAmount = functionalAmount;
        return this;
    }
    public String getFunctionalAmount() {
        return this.functionalAmount;
    }

    public SubmitEcarLcacalcRequest setStageActiveDataList(java.util.List<LcaStageActiveData> stageActiveDataList) {
        this.stageActiveDataList = stageActiveDataList;
        return this;
    }
    public java.util.List<LcaStageActiveData> getStageActiveDataList() {
        return this.stageActiveDataList;
    }

    public SubmitEcarLcacalcRequest setCustomContext(String customContext) {
        this.customContext = customContext;
        return this;
    }
    public String getCustomContext() {
        return this.customContext;
    }

}
