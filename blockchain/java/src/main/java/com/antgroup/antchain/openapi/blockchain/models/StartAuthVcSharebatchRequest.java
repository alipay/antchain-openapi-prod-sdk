// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVcSharebatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 非托管的情况下必选，业务方持有的did身份。
    @NameInMap("did")
    public String did;

    // 非托管的情况下必选。 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
    @NameInMap("signature")
    public String signature;

    // 分享声明的目标方DID
    @NameInMap("target_did")
    @Validation(required = true)
    public String targetDid;

    // 目标待分享的VC列表，不超过10个
    @NameInMap("vc_share_list")
    @Validation(required = true)
    public java.util.List<VcShareStruct> vcShareList;

    public static StartAuthVcSharebatchRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVcSharebatchRequest self = new StartAuthVcSharebatchRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthVcSharebatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthVcSharebatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthVcSharebatchRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAuthVcSharebatchRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartAuthVcSharebatchRequest setTargetDid(String targetDid) {
        this.targetDid = targetDid;
        return this;
    }
    public String getTargetDid() {
        return this.targetDid;
    }

    public StartAuthVcSharebatchRequest setVcShareList(java.util.List<VcShareStruct> vcShareList) {
        this.vcShareList = vcShareList;
        return this;
    }
    public java.util.List<VcShareStruct> getVcShareList() {
        return this.vcShareList;
    }

}
