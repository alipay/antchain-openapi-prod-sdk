// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PagequeryCaasContractMarketRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码
    @NameInMap("num")
    @Validation(required = true)
    public Long num;

    // 页大小
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // 链id
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    public static PagequeryCaasContractMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryCaasContractMarketRequest self = new PagequeryCaasContractMarketRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryCaasContractMarketRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryCaasContractMarketRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryCaasContractMarketRequest setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public PagequeryCaasContractMarketRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public PagequeryCaasContractMarketRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

}
