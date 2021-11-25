// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecChainSubnetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 子链id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    public String consortiumId;

    // 子链操作的枚举类型
    @NameInMap("operate_type")
    public String operateType;

    public static ExecChainSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecChainSubnetRequest self = new ExecChainSubnetRequest();
        return TeaModel.build(map, self);
    }

    public ExecChainSubnetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecChainSubnetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecChainSubnetRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ExecChainSubnetRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ExecChainSubnetRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
