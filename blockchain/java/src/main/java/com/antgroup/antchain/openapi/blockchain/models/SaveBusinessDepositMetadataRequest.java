// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveBusinessDepositMetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId    
    // 
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 具体存证的内容
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<DepositMetaDataItem> data;

    // 用户的did地址
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 用户自定义唯一keyId，可用该keyId到业务服务中查询存证内容
    @NameInMap("key_id")
    public String keyId;

    public static SaveBusinessDepositMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBusinessDepositMetadataRequest self = new SaveBusinessDepositMetadataRequest();
        return TeaModel.build(map, self);
    }

    public SaveBusinessDepositMetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBusinessDepositMetadataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBusinessDepositMetadataRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveBusinessDepositMetadataRequest setData(java.util.List<DepositMetaDataItem> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DepositMetaDataItem> getData() {
        return this.data;
    }

    public SaveBusinessDepositMetadataRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public SaveBusinessDepositMetadataRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
