// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVcBatchauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 批量进行可验证声明颁发的所有候选声明内容
    @NameInMap("claim_list")
    @Validation(required = true)
    public java.util.List<Claim> claimList;

    // 非托管的情况下必选，业务方持有的did身份。
    @NameInMap("did")
    public String did;

    // 业务方可以传递的附加信息，通常跟可验证声明的claim有关，目前是可选项，将来业务复杂后，需要指定claim类型，或者附加信息内容说明。
    @NameInMap("extension")
    public String extension;

    // jN1LVH5YhbTvgrdeBqlImPJBWDzVdNyyHZ1n9A0pSOQKnt11jWM5Qn707+wEa7bc8TOd1WvRItTe\r\nmx4xYCqX0gE=\r\n	
    @NameInMap("signature")
    public String signature;

    // 涉及的C类用户身份信息，如果是支付宝体系内，需要提供userId，并且提供二要素信息(name，certNo)
    @NameInMap("user_info")
    @Validation(required = true)
    public String userInfo;

    public static StartAuthVcBatchauthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVcBatchauthRequest self = new StartAuthVcBatchauthRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthVcBatchauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthVcBatchauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthVcBatchauthRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthVcBatchauthRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthVcBatchauthRequest setClaimList(java.util.List<Claim> claimList) {
        this.claimList = claimList;
        return this;
    }
    public java.util.List<Claim> getClaimList() {
        return this.claimList;
    }

    public StartAuthVcBatchauthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAuthVcBatchauthRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public StartAuthVcBatchauthRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartAuthVcBatchauthRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

}
