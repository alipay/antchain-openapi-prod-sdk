// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class InitIpAuthtradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 采购者的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // IP授权交易时传入IP ID；增值服务交易时传入服务ID
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 0 IP交易，1 增值服务交易
    @NameInMap("goods_type")
    public Long goodsType;

    // 申请授权合作的备注信息
    @NameInMap("apply_info")
    @Validation(required = true)
    public IPOrderApplyInfo applyInfo;

    public static InitIpAuthtradeRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIpAuthtradeRequest self = new InitIpAuthtradeRequest();
        return TeaModel.build(map, self);
    }

    public InitIpAuthtradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIpAuthtradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIpAuthtradeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public InitIpAuthtradeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public InitIpAuthtradeRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public InitIpAuthtradeRequest setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public Long getGoodsType() {
        return this.goodsType;
    }

    public InitIpAuthtradeRequest setApplyInfo(IPOrderApplyInfo applyInfo) {
        this.applyInfo = applyInfo;
        return this;
    }
    public IPOrderApplyInfo getApplyInfo() {
        return this.applyInfo;
    }

}
