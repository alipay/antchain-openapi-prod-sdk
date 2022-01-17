// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class RunNftTransferRequest extends TeaModel {
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

    // 购买NFT的金额，单位分
    @NameInMap("price_cent")
    public Long priceCent;

    // 渠道租户
    @NameInMap("channel_tenant")
    @Validation(required = true)
    public String channelTenant;

    public static RunNftTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        RunNftTransferRequest self = new RunNftTransferRequest();
        return TeaModel.build(map, self);
    }

    public RunNftTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunNftTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunNftTransferRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RunNftTransferRequest setToIdNo(String toIdNo) {
        this.toIdNo = toIdNo;
        return this;
    }
    public String getToIdNo() {
        return this.toIdNo;
    }

    public RunNftTransferRequest setToIdType(String toIdType) {
        this.toIdType = toIdType;
        return this;
    }
    public String getToIdType() {
        return this.toIdType;
    }

    public RunNftTransferRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public RunNftTransferRequest setPriceCent(Long priceCent) {
        this.priceCent = priceCent;
        return this;
    }
    public Long getPriceCent() {
        return this.priceCent;
    }

    public RunNftTransferRequest setChannelTenant(String channelTenant) {
        this.channelTenant = channelTenant;
        return this;
    }
    public String getChannelTenant() {
        return this.channelTenant;
    }

}
