// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CloseChainServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // 内部产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 自定义信息，json格式
    @NameInMap("extend")
    public String extend;

    public static CloseChainServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseChainServiceRequest self = new CloseChainServiceRequest();
        return TeaModel.build(map, self);
    }

    public CloseChainServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloseChainServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloseChainServiceRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public CloseChainServiceRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CloseChainServiceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CloseChainServiceRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

}
