// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainMiniAppAuthorization extends TeaModel {
    // ant_chain_id
    /**
     * <strong>example:</strong>
     * <p>ant_chain_id</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // q_r_code_type
    /**
     * <strong>example:</strong>
     * <p>q_r_code_type</p>
     */
    @NameInMap("q_r_code_type")
    public String qRCodeType;

    // authorization_type
    /**
     * <strong>example:</strong>
     * <p>authorization_type</p>
     */
    @NameInMap("authorization_type")
    public String authorizationType;

    public static ALiYunChainMiniAppAuthorization build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainMiniAppAuthorization self = new ALiYunChainMiniAppAuthorization();
        return TeaModel.build(map, self);
    }

    public ALiYunChainMiniAppAuthorization setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunChainMiniAppAuthorization setQRCodeType(String qRCodeType) {
        this.qRCodeType = qRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.qRCodeType;
    }

    public ALiYunChainMiniAppAuthorization setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

}
