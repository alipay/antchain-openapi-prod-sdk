// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class GetTasAttestationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 摘要算法默认，（sha256或者sm3 默认sm3）
    @NameInMap("algorithm")
    public String algorithm;

    // tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
    @NameInMap("cert_req")
    public Boolean certReq;

    // 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
    @NameInMap("compress")
    public Boolean compress;

    // 事物hash(支持sha256或sm3摘要算法),长度64个字符。
    @NameInMap("rid")
    @Validation(required = true)
    public String rid;

    public static GetTasAttestationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTasAttestationRequest self = new GetTasAttestationRequest();
        return TeaModel.build(map, self);
    }

    public GetTasAttestationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTasAttestationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTasAttestationRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public GetTasAttestationRequest setCertReq(Boolean certReq) {
        this.certReq = certReq;
        return this;
    }
    public Boolean getCertReq() {
        return this.certReq;
    }

    public GetTasAttestationRequest setCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }
    public Boolean getCompress() {
        return this.compress;
    }

    public GetTasAttestationRequest setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

}
