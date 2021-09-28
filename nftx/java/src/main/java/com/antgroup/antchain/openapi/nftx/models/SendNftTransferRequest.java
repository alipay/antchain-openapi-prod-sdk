// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class SendNftTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // NFT租户下唯一的项目编号
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 支付宝2088开头账号
    @NameInMap("told_no")
    @Validation(required = true)
    public String toldNo;

    // 账号类型，当前只支持支付宝账号
    @NameInMap("told_type")
    @Validation(required = true)
    public String toldType;

    // 购买NFT的金额，单位分
    @NameInMap("price_cent")
    @Validation(required = true)
    public Long priceCent;

    // 交易NFT时租户的唯一订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 用户购买订单时间
    @NameInMap("order_time")
    @Validation(required = true)
    public String orderTime;

    public static SendNftTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNftTransferRequest self = new SendNftTransferRequest();
        return TeaModel.build(map, self);
    }

    public SendNftTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendNftTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendNftTransferRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SendNftTransferRequest setToldNo(String toldNo) {
        this.toldNo = toldNo;
        return this;
    }
    public String getToldNo() {
        return this.toldNo;
    }

    public SendNftTransferRequest setToldType(String toldType) {
        this.toldType = toldType;
        return this;
    }
    public String getToldType() {
        return this.toldType;
    }

    public SendNftTransferRequest setPriceCent(Long priceCent) {
        this.priceCent = priceCent;
        return this;
    }
    public Long getPriceCent() {
        return this.priceCent;
    }

    public SendNftTransferRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SendNftTransferRequest setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

}
