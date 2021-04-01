// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddMydidcommunAssetDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据实际存储路径
    @NameInMap("data_path")
    @Validation(required = true)
    public String dataPath;

    // 请求发起人的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 所注册的资产所有者DID，要注意资产所有者DID需与授权发起方DID相同
    @NameInMap("owner_did")
    @Validation(required = true)
    public String ownerDid;

    // 数据所对应的业务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 临时字段，数据文件的md5哈希值，在隐私服务无法直接读取数据时，由用户提供
    @NameInMap("data_hash")
    public String dataHash;

    public static AddMydidcommunAssetDataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMydidcommunAssetDataRequest self = new AddMydidcommunAssetDataRequest();
        return TeaModel.build(map, self);
    }

    public AddMydidcommunAssetDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddMydidcommunAssetDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddMydidcommunAssetDataRequest setDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }
    public String getDataPath() {
        return this.dataPath;
    }

    public AddMydidcommunAssetDataRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public AddMydidcommunAssetDataRequest setOwnerDid(String ownerDid) {
        this.ownerDid = ownerDid;
        return this;
    }
    public String getOwnerDid() {
        return this.ownerDid;
    }

    public AddMydidcommunAssetDataRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AddMydidcommunAssetDataRequest setDataHash(String dataHash) {
        this.dataHash = dataHash;
        return this;
    }
    public String getDataHash() {
        return this.dataHash;
    }

}
