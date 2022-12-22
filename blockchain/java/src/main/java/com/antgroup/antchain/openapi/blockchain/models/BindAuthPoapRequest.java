// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BindAuthPoapRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过64字符的业务流水唯一id，可作幂等处理
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 徽章元数据ID
    @NameInMap("poap_meta_id")
    @Validation(required = true)
    public String poapMetaId;

    // 支付宝UID，2088开头
    @NameInMap("user_id")
    public String userId;

    // 用户真实姓名
    @NameInMap("user_name")
    public String userName;

    // 用户手机号
    @NameInMap("user_cert_no")
    public String userCertNo;

    // 用户手机号
    @NameInMap("user_mobile")
    public String userMobile;

    // 定制id会有白名单进行权限限制。id格式要求：长度6-20，允许字母、数字、部分特殊字符(_#:|)
    @NameInMap("poap_id")
    public String poapId;

    // 徽章关联权益时，用户领取权益的动作类型
    @NameInMap("profit_action")
    public String profitAction;

    // 徽章关联权益时，用户领取权益的地址
    @NameInMap("profit_url")
    public String profitUrl;

    // 徽章关联权益时附带信息，buttonName为自定义领取按钮名称，needAuth为是否需要授权，authId为授权请求id，authBizId为授权请求场景id
    @NameInMap("payload")
    public String payload;

    public static BindAuthPoapRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAuthPoapRequest self = new BindAuthPoapRequest();
        return TeaModel.build(map, self);
    }

    public BindAuthPoapRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAuthPoapRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindAuthPoapRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BindAuthPoapRequest setPoapMetaId(String poapMetaId) {
        this.poapMetaId = poapMetaId;
        return this;
    }
    public String getPoapMetaId() {
        return this.poapMetaId;
    }

    public BindAuthPoapRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BindAuthPoapRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public BindAuthPoapRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

    public BindAuthPoapRequest setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public BindAuthPoapRequest setPoapId(String poapId) {
        this.poapId = poapId;
        return this;
    }
    public String getPoapId() {
        return this.poapId;
    }

    public BindAuthPoapRequest setProfitAction(String profitAction) {
        this.profitAction = profitAction;
        return this;
    }
    public String getProfitAction() {
        return this.profitAction;
    }

    public BindAuthPoapRequest setProfitUrl(String profitUrl) {
        this.profitUrl = profitUrl;
        return this;
    }
    public String getProfitUrl() {
        return this.profitUrl;
    }

    public BindAuthPoapRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

}
