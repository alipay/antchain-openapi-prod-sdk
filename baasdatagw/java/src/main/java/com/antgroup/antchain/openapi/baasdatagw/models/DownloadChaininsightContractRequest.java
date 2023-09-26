// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class DownloadChaininsightContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约地址
    @NameInMap("hex_address")
    @Validation(required = true)
    public String hexAddress;

    // 合约部署交易所在区块范围的最大值，默认为0，即小于当前区块
    @NameInMap("height")
    public String height;

    public static DownloadChaininsightContractRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadChaininsightContractRequest self = new DownloadChaininsightContractRequest();
        return TeaModel.build(map, self);
    }

    public DownloadChaininsightContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadChaininsightContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadChaininsightContractRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DownloadChaininsightContractRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public DownloadChaininsightContractRequest setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

}
