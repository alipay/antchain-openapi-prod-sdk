// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthCorporateDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对企业描述的扩展字段，用于传递更多企业信息，支持业务。
    @NameInMap("extension_info")
    public String extensionInfo;

    // 企业名称，通常为法定的公司实体名称
    @NameInMap("owner_name")
    @Validation(required = true)
    public String ownerName;

    // 调用方体系内企业的唯一ID，作为创建DID的绑定目标，调用者需要保证其唯一性。
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    public static CreateAuthCorporateDidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthCorporateDidRequest self = new CreateAuthCorporateDidRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthCorporateDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthCorporateDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAuthCorporateDidRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateAuthCorporateDidRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public CreateAuthCorporateDidRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

}
