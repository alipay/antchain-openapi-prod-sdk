// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckTwometaHashRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // hash后的身份证号，不区分大小写，使用的hash算法参考hash_type字段
    @NameInMap("cert_no_hash")
    @Validation(required = true)
    public String certNoHash;

    // hash后的姓名，不区分大小写，使用的hash类型参考hash_type
    @NameInMap("cert_name_hash")
    @Validation(required = true)
    public String certNameHash;

    // 本次核验id
    @NameInMap("outer_order_id")
    @Validation(required = true)
    public String outerOrderId;

    // 支持的hash类型
    @NameInMap("hash_type")
    @Validation(required = true)
    public String hashType;

    // json格式的扩展字段
    @NameInMap("extern_info")
    public String externInfo;

    public static CheckTwometaHashRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTwometaHashRequest self = new CheckTwometaHashRequest();
        return TeaModel.build(map, self);
    }

    public CheckTwometaHashRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckTwometaHashRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckTwometaHashRequest setCertNoHash(String certNoHash) {
        this.certNoHash = certNoHash;
        return this;
    }
    public String getCertNoHash() {
        return this.certNoHash;
    }

    public CheckTwometaHashRequest setCertNameHash(String certNameHash) {
        this.certNameHash = certNameHash;
        return this;
    }
    public String getCertNameHash() {
        return this.certNameHash;
    }

    public CheckTwometaHashRequest setOuterOrderId(String outerOrderId) {
        this.outerOrderId = outerOrderId;
        return this;
    }
    public String getOuterOrderId() {
        return this.outerOrderId;
    }

    public CheckTwometaHashRequest setHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }
    public String getHashType() {
        return this.hashType;
    }

    public CheckTwometaHashRequest setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
