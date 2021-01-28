// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractOrgsealRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 印章别名
    @NameInMap("alias")
    public String alias;

    // 中心图案类型，STAR-圆形有五角星，NONE-圆形无五角星， 详见机构印章样式说明
    @NameInMap("central")
    @Validation(required = true)
    public String central;

    // 印章颜色，RED-红色，BLUE-蓝色，BLACK-黑色
    @NameInMap("color")
    @Validation(required = true)
    public String color;

    // 印章高度，默认159px
    @NameInMap("height")
    public Long height;

    // 横向文，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
    @NameInMap("htext")
    public String htext;

    // 机构ID
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 下弦文，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文	
    @NameInMap("qtext")
    public String qtext;

    // 模板类型，TEMPLATE_ROUND-圆章，TEMPLATE_OVAL-椭圆章， 详见机构印章样式说明	
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 印章宽度，默认159px
    @NameInMap("width")
    public Long width;

    public static CreateContractOrgsealRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractOrgsealRequest self = new CreateContractOrgsealRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractOrgsealRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractOrgsealRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractOrgsealRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateContractOrgsealRequest setCentral(String central) {
        this.central = central;
        return this;
    }
    public String getCentral() {
        return this.central;
    }

    public CreateContractOrgsealRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateContractOrgsealRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public CreateContractOrgsealRequest setHtext(String htext) {
        this.htext = htext;
        return this;
    }
    public String getHtext() {
        return this.htext;
    }

    public CreateContractOrgsealRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateContractOrgsealRequest setQtext(String qtext) {
        this.qtext = qtext;
        return this;
    }
    public String getQtext() {
        return this.qtext;
    }

    public CreateContractOrgsealRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateContractOrgsealRequest setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
