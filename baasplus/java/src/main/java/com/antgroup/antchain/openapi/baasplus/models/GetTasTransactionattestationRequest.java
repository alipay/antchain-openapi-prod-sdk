// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class GetTasTransactionattestationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 事物hash(支持sha256或sm3摘要算法)
    // 长度64个字符。
    @NameInMap("rid")
    @Validation(required = true)
    public String rid;

    // 摘要算法默认，（sha256或者sm3 默认sm3）
    @NameInMap("algorithm")
    public String algorithm;

    // 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
    @NameInMap("compress")
    public Boolean compress;

    // tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
    @NameInMap("cert_req")
    public Boolean certReq;

    // 事务id，允许大小写数字且小于十位的字符串
    @NameInMap("trans_id")
    @Validation(required = true)
    public String transId;

    // 对事务的描述，长度小于20位
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    public static GetTasTransactionattestationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTasTransactionattestationRequest self = new GetTasTransactionattestationRequest();
        return TeaModel.build(map, self);
    }

    public GetTasTransactionattestationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTasTransactionattestationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTasTransactionattestationRequest setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public GetTasTransactionattestationRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public GetTasTransactionattestationRequest setCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }
    public Boolean getCompress() {
        return this.compress;
    }

    public GetTasTransactionattestationRequest setCertReq(Boolean certReq) {
        this.certReq = certReq;
        return this;
    }
    public Boolean getCertReq() {
        return this.certReq;
    }

    public GetTasTransactionattestationRequest setTransId(String transId) {
        this.transId = transId;
        return this;
    }
    public String getTransId() {
        return this.transId;
    }

    public GetTasTransactionattestationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
