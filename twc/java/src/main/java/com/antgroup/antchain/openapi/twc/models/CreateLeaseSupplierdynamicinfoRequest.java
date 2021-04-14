// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseSupplierdynamicinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 签收记录哈希，已签收需要必填
    @NameInMap("arrive_confirm_hash")
    public String arriveConfirmHash;

    // 用户签收时间，格式为2019-8-31 12:00:00，已签收需要必填
    @NameInMap("arrive_confirm_time")
    public String arriveConfirmTime;

    // 签收记录存证哈希，已签收需要必填
    @NameInMap("arrive_confirm_tx_hash")
    public String arriveConfirmTxHash;

    // 签收记录对应的url，已签收需要必填
    @NameInMap("arrive_confirm_url")
    public String arriveConfirmUrl;

    // 物流状态额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 物流状态，1.已发货 2运输中 3已签收 0其他
    @NameInMap("logistic_status")
    @Validation(required = true)
    public String logisticStatus;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 阶段名称
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    public static CreateLeaseSupplierdynamicinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseSupplierdynamicinfoRequest self = new CreateLeaseSupplierdynamicinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseSupplierdynamicinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseSupplierdynamicinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseSupplierdynamicinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseSupplierdynamicinfoRequest setArriveConfirmHash(String arriveConfirmHash) {
        this.arriveConfirmHash = arriveConfirmHash;
        return this;
    }
    public String getArriveConfirmHash() {
        return this.arriveConfirmHash;
    }

    public CreateLeaseSupplierdynamicinfoRequest setArriveConfirmTime(String arriveConfirmTime) {
        this.arriveConfirmTime = arriveConfirmTime;
        return this;
    }
    public String getArriveConfirmTime() {
        return this.arriveConfirmTime;
    }

    public CreateLeaseSupplierdynamicinfoRequest setArriveConfirmTxHash(String arriveConfirmTxHash) {
        this.arriveConfirmTxHash = arriveConfirmTxHash;
        return this;
    }
    public String getArriveConfirmTxHash() {
        return this.arriveConfirmTxHash;
    }

    public CreateLeaseSupplierdynamicinfoRequest setArriveConfirmUrl(String arriveConfirmUrl) {
        this.arriveConfirmUrl = arriveConfirmUrl;
        return this;
    }
    public String getArriveConfirmUrl() {
        return this.arriveConfirmUrl;
    }

    public CreateLeaseSupplierdynamicinfoRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseSupplierdynamicinfoRequest setLogisticStatus(String logisticStatus) {
        this.logisticStatus = logisticStatus;
        return this;
    }
    public String getLogisticStatus() {
        return this.logisticStatus;
    }

    public CreateLeaseSupplierdynamicinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseSupplierdynamicinfoRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
