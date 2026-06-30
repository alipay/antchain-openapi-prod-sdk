// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyTdiquickmsgRobotcallRequest extends TeaModel {
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
    @Validation(required = true)
    public RobotCallCustomerParam customerDetails;

    public static ApplyTdiquickmsgRobotcallRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTdiquickmsgRobotcallRequest self = new ApplyTdiquickmsgRobotcallRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTdiquickmsgRobotcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyTdiquickmsgRobotcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyTdiquickmsgRobotcallRequest setOutSerialNo(String outSerialNo) {
        this.outSerialNo = outSerialNo;
        return this;
    }
    public String getOutSerialNo() {
        return this.outSerialNo;
    }

    public ApplyTdiquickmsgRobotcallRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public ApplyTdiquickmsgRobotcallRequest setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public ApplyTdiquickmsgRobotcallRequest setParamTemplate(String paramTemplate) {
        this.paramTemplate = paramTemplate;
        return this;
    }
    public String getParamTemplate() {
        return this.paramTemplate;
    }

    public ApplyTdiquickmsgRobotcallRequest setCustomerDetails(RobotCallCustomerParam customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    public RobotCallCustomerParam getCustomerDetails() {
        return this.customerDetails;
    }

}
