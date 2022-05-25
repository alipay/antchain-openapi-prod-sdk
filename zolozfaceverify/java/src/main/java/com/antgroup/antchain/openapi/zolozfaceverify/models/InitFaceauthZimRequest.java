// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class InitFaceauthZimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务参数
    @NameInMap("biz_data")
    public String bizData;

    // 渠道
    @NameInMap("channel")
    public String channel;

    // 商户
    @NameInMap("merchant")
    public String merchant;

    // 环境参数
    @NameInMap("meta_info")
    @Validation(required = true)
    public String metaInfo;

    // 产品节点
    @NameInMap("produce_node")
    public String produceNode;

    // 产品名称
    @NameInMap("product_name")
    public String productName;

    // 实人认证id
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    // 身份信息参数
    @NameInMap("zim_principal")
    public String zimPrincipal;

    public static InitFaceauthZimRequest build(java.util.Map<String, ?> map) throws Exception {
        InitFaceauthZimRequest self = new InitFaceauthZimRequest();
        return TeaModel.build(map, self);
    }

    public InitFaceauthZimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitFaceauthZimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitFaceauthZimRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public InitFaceauthZimRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public InitFaceauthZimRequest setMerchant(String merchant) {
        this.merchant = merchant;
        return this;
    }
    public String getMerchant() {
        return this.merchant;
    }

    public InitFaceauthZimRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitFaceauthZimRequest setProduceNode(String produceNode) {
        this.produceNode = produceNode;
        return this;
    }
    public String getProduceNode() {
        return this.produceNode;
    }

    public InitFaceauthZimRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public InitFaceauthZimRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

    public InitFaceauthZimRequest setZimPrincipal(String zimPrincipal) {
        this.zimPrincipal = zimPrincipal;
        return this;
    }
    public String getZimPrincipal() {
        return this.zimPrincipal;
    }

}
