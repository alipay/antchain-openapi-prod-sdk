// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyQmpRobotcallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部流水号
    @NameInMap("out_serial_no")
    @Validation(required = true)
    public String outSerialNo;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 客户透传字段
    @NameInMap("out_info")
    public String outInfo;

    // 用户参数类型
    @NameInMap("param_template")
    @Validation(required = true)
    public String paramTemplate;

    // 每个手机号的详细参数
    @NameInMap("customer_details")
    public java.util.List<RobotCallCustomerParam> customerDetails;

    public static ApplyQmpRobotcallRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyQmpRobotcallRequest self = new ApplyQmpRobotcallRequest();
        return TeaModel.build(map, self);
    }

    public ApplyQmpRobotcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyQmpRobotcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyQmpRobotcallRequest setOutSerialNo(String outSerialNo) {
        this.outSerialNo = outSerialNo;
        return this;
    }
    public String getOutSerialNo() {
        return this.outSerialNo;
    }

    public ApplyQmpRobotcallRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public ApplyQmpRobotcallRequest setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public ApplyQmpRobotcallRequest setParamTemplate(String paramTemplate) {
        this.paramTemplate = paramTemplate;
        return this;
    }
    public String getParamTemplate() {
        return this.paramTemplate;
    }

    public ApplyQmpRobotcallRequest setCustomerDetails(java.util.List<RobotCallCustomerParam> customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    public java.util.List<RobotCallCustomerParam> getCustomerDetails() {
        return this.customerDetails;
    }

}
