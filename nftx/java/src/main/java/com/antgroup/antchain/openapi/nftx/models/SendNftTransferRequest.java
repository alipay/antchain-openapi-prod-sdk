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
    @NameInMap("to_id_no")
    @Validation(required = true)
    public String toIdNo;

    // 账号类型，当前只支持支付宝账号
    @NameInMap("to_id_type")
    @Validation(required = true)
    public String toIdType;

    // 交易NFT时租户的唯一订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 用户购买订单时间
    @NameInMap("order_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderTime;

    // 购买NFT的金额，单位分
    @NameInMap("price_cent")
    public Long priceCent;

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

    public SendNftTransferRequest setToIdNo(String toIdNo) {
        this.toIdNo = toIdNo;
        return this;
    }
    public String getToIdNo() {
        return this.toIdNo;
    }

    public SendNftTransferRequest setToIdType(String toIdType) {
        this.toIdType = toIdType;
        return this;
    }
    public String getToIdType() {
        return this.toIdType;
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

    public SendNftTransferRequest setPriceCent(Long priceCent) {
        this.priceCent = priceCent;
        return this;
    }
    public Long getPriceCent() {
        return this.priceCent;
    }

}
