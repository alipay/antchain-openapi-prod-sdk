// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class GwVerifyScene extends TeaModel {
    // 调用方系统名
    @NameInMap("system_name")
    @Validation(required = true)
    public String systemName;

    // 业务方产品
    @NameInMap("biz_product")
    @Validation(required = true)
    public String bizProduct;

    // 业务产品节点
    @NameInMap("biz_prod_node")
    @Validation(required = true)
    public String bizProdNode;

    // 业务接入渠道
    @NameInMap("access_channel")
    @Validation(required = true)
    public String accessChannel;

    // 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
    @NameInMap("language")
    @Validation(required = true)
    public String language;

    public static GwVerifyScene build(java.util.Map<String, ?> map) throws Exception {
        GwVerifyScene self = new GwVerifyScene();
        return TeaModel.build(map, self);
    }

    public GwVerifyScene setSystemName(String systemName) {
        this.systemName = systemName;
        return this;
    }
    public String getSystemName() {
        return this.systemName;
    }

    public GwVerifyScene setBizProduct(String bizProduct) {
        this.bizProduct = bizProduct;
        return this;
    }
    public String getBizProduct() {
        return this.bizProduct;
    }

    public GwVerifyScene setBizProdNode(String bizProdNode) {
        this.bizProdNode = bizProdNode;
        return this;
    }
    public String getBizProdNode() {
        return this.bizProdNode;
    }

    public GwVerifyScene setAccessChannel(String accessChannel) {
        this.accessChannel = accessChannel;
        return this;
    }
    public String getAccessChannel() {
        return this.accessChannel;
    }

    public GwVerifyScene setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
