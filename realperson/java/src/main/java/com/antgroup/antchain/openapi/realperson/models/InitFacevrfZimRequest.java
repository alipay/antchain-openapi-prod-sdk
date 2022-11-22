// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class InitFacevrfZimRequest extends TeaModel {
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
    // 
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    // 身份信息参数
    // 
    @NameInMap("zim_principal")
    public String zimPrincipal;

    public static InitFacevrfZimRequest build(java.util.Map<String, ?> map) throws Exception {
        InitFacevrfZimRequest self = new InitFacevrfZimRequest();
        return TeaModel.build(map, self);
    }

    public InitFacevrfZimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitFacevrfZimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitFacevrfZimRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public InitFacevrfZimRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public InitFacevrfZimRequest setMerchant(String merchant) {
        this.merchant = merchant;
        return this;
    }
    public String getMerchant() {
        return this.merchant;
    }

    public InitFacevrfZimRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitFacevrfZimRequest setProduceNode(String produceNode) {
        this.produceNode = produceNode;
        return this;
    }
    public String getProduceNode() {
        return this.produceNode;
    }

    public InitFacevrfZimRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public InitFacevrfZimRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

    public InitFacevrfZimRequest setZimPrincipal(String zimPrincipal) {
        this.zimPrincipal = zimPrincipal;
        return this;
    }
    public String getZimPrincipal() {
        return this.zimPrincipal;
    }

}
