// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class CreateRealtytradeOrgsealRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业账户注册时返回的机构ID
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 印章样式说明，Round-圆章，Oval-椭圆章，默认Round
    @NameInMap("template_type")
    public String templateType;

    // 印章颜色，ed-红色，Blue-蓝色，Black-黑色，默认Red
    @NameInMap("seal_color")
    public String sealColor;

    // 中心图案类型，Star-圆形有五角星，None-圆形无五角星，默认None
    @NameInMap("center_pattern")
    public String centerPattern;

    // 企业用章说明，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
    @NameInMap("horizontal_title")
    public String horizontalTitle;

    // 企业用章日期范围等，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
    @NameInMap("last_title")
    public String lastTitle;

    public static CreateRealtytradeOrgsealRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtytradeOrgsealRequest self = new CreateRealtytradeOrgsealRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealtytradeOrgsealRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRealtytradeOrgsealRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRealtytradeOrgsealRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateRealtytradeOrgsealRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateRealtytradeOrgsealRequest setSealColor(String sealColor) {
        this.sealColor = sealColor;
        return this;
    }
    public String getSealColor() {
        return this.sealColor;
    }

    public CreateRealtytradeOrgsealRequest setCenterPattern(String centerPattern) {
        this.centerPattern = centerPattern;
        return this;
    }
    public String getCenterPattern() {
        return this.centerPattern;
    }

    public CreateRealtytradeOrgsealRequest setHorizontalTitle(String horizontalTitle) {
        this.horizontalTitle = horizontalTitle;
        return this;
    }
    public String getHorizontalTitle() {
        return this.horizontalTitle;
    }

    public CreateRealtytradeOrgsealRequest setLastTitle(String lastTitle) {
        this.lastTitle = lastTitle;
        return this;
    }
    public String getLastTitle() {
        return this.lastTitle;
    }

}
