// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidCorporateExtensionserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要更新的did doc对应的did字段；该did必须为调用者自己的did，或者托管给调用者的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 修改后的全量扩展字段
    @NameInMap("extension")
    @Validation(required = true)
    public String extension;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static UpdateDidCorporateExtensionserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidCorporateExtensionserviceRequest self = new UpdateDidCorporateExtensionserviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDidCorporateExtensionserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDidCorporateExtensionserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDidCorporateExtensionserviceRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateDidCorporateExtensionserviceRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public UpdateDidCorporateExtensionserviceRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
