// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveBusinessDepositEncryptmetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId    
    // 
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 要加密的数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 用户的did身份地址
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 业务唯一id，只需要本链本用户所用的业务keyId唯一即可
    @NameInMap("key_id")
    public String keyId;

    // 存证内容描述，格式为json，其中type为支持的类型：
    // text：文本类型 
    // image：图片类型(待添加) 
    // video：视频类型(待添加) 
    // txHash：存证引用类型(待添加) 
    // map:地图类型(待添加)
    @NameInMap("metadata")
    @Validation(required = true)
    public String metadata;

    public static SaveBusinessDepositEncryptmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBusinessDepositEncryptmetadataRequest self = new SaveBusinessDepositEncryptmetadataRequest();
        return TeaModel.build(map, self);
    }

    public SaveBusinessDepositEncryptmetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBusinessDepositEncryptmetadataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBusinessDepositEncryptmetadataRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveBusinessDepositEncryptmetadataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveBusinessDepositEncryptmetadataRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public SaveBusinessDepositEncryptmetadataRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public SaveBusinessDepositEncryptmetadataRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

}
