// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotbasicProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 品类类型
    // 标准品类：standard
    // 自定义品类：custom
    @NameInMap("category_type")
    @Validation(required = true)
    public String categoryType;

    // 品类编码
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 连网方式
    // WIFI： Wi-Fi
    // CELLULAR：蜂窝网ETHERNET：以太网OTHER：其他
    @NameInMap("net_type")
    @Validation(required = true)
    public String netType;

    // 设备种类
    // 0：直连网络设备
    // 1：网关设备
    @NameInMap("node_type")
    @Validation(required = true)
    public Long nodeType;

    // 安全SDK接入模式
    // NO_SEC：不进行安全认证
    // PRODUCTION_PRESET：产线预置
    // AIR_DISTRIBUTION：空中发行
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 产品描述
    // 长度不超过100个字符
    @NameInMap("description")
    public String description;

    public static CreateIotbasicProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIotbasicProductRequest self = new CreateIotbasicProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateIotbasicProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIotbasicProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIotbasicProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateIotbasicProductRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public CreateIotbasicProductRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public CreateIotbasicProductRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateIotbasicProductRequest setNodeType(Long nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public Long getNodeType() {
        return this.nodeType;
    }

    public CreateIotbasicProductRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateIotbasicProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
