// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unitycs.models;

import com.aliyun.tea.*;

public class VerifyDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 元数据编码
    @NameInMap("metadata_code")
    @Validation(required = true)
    public String metadataCode;

    // 数据标识
    @NameInMap("attr_identify")
    public String attrIdentify;

    // 核验属性集合
    @NameInMap("attrs")
    @Validation(required = true)
    public java.util.List<MetaDataAttr> attrs;

    public static VerifyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDataRequest self = new VerifyDataRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyDataRequest setMetadataCode(String metadataCode) {
        this.metadataCode = metadataCode;
        return this;
    }
    public String getMetadataCode() {
        return this.metadataCode;
    }

    public VerifyDataRequest setAttrIdentify(String attrIdentify) {
        this.attrIdentify = attrIdentify;
        return this;
    }
    public String getAttrIdentify() {
        return this.attrIdentify;
    }

    public VerifyDataRequest setAttrs(java.util.List<MetaDataAttr> attrs) {
        this.attrs = attrs;
        return this;
    }
    public java.util.List<MetaDataAttr> getAttrs() {
        return this.attrs;
    }

}
