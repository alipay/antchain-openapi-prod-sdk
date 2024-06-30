// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightContracttimelineconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链上地址：合约 / 存证账户
    @NameInMap("hex_address")
    @Validation(required = true)
    public String hexAddress;

    // 需要更新的区块高度（会更新生效区间包含该高度的时间轴配置）
    @NameInMap("ver")
    @Validation(required = true)
    public String ver;

    public static QueryChaininsightContracttimelineconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightContracttimelineconfigRequest self = new QueryChaininsightContracttimelineconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightContracttimelineconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightContracttimelineconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightContracttimelineconfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChaininsightContracttimelineconfigRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public QueryChaininsightContracttimelineconfigRequest setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

}
