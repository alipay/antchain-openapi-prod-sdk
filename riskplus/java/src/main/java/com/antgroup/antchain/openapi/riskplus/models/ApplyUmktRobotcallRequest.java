// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyUmktRobotcallRequest extends TeaModel {
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
    @NameInMap("file_template")
    @Validation(required = true)
    public String fileTemplate;

    // 每个手机号的详细参数
    @NameInMap("customer_details")
    public java.util.List<RobotCallCustomerParam> customerDetails;

    public static ApplyUmktRobotcallRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyUmktRobotcallRequest self = new ApplyUmktRobotcallRequest();
        return TeaModel.build(map, self);
    }

    public ApplyUmktRobotcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyUmktRobotcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyUmktRobotcallRequest setOutSerialNo(String outSerialNo) {
        this.outSerialNo = outSerialNo;
        return this;
    }
    public String getOutSerialNo() {
        return this.outSerialNo;
    }

    public ApplyUmktRobotcallRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public ApplyUmktRobotcallRequest setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public ApplyUmktRobotcallRequest setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
        return this;
    }
    public String getFileTemplate() {
        return this.fileTemplate;
    }

    public ApplyUmktRobotcallRequest setCustomerDetails(java.util.List<RobotCallCustomerParam> customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    public java.util.List<RobotCallCustomerParam> getCustomerDetails() {
        return this.customerDetails;
    }

}
