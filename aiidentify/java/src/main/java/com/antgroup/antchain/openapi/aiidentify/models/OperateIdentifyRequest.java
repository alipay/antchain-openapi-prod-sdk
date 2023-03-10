// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class OperateIdentifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类名称
    @NameInMap("category_name")
    @Validation(required = true)
    public String categoryName;

    // 品牌名称
    @NameInMap("brand_name")
    @Validation(required = true)
    public String brandName;

    // 款式名称
    @NameInMap("style_name")
    @Validation(required = true)
    public String styleName;

    // 款式编号
    @NameInMap("style_code")
    public String styleCode;

    // 鉴定点信息列表
    @NameInMap("identify_point_list")
    public java.util.List<IdentifyPointReq> identifyPointList;

    // 鉴定点图片列表，当不能提供完整鉴定点信息列表时，可根据鉴定点查询接口出参中order字段将图片直接放入列表中
    @NameInMap("identify_point_img_list")
    public java.util.List<String> identifyPointImgList;

    public static OperateIdentifyRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIdentifyRequest self = new OperateIdentifyRequest();
        return TeaModel.build(map, self);
    }

    public OperateIdentifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIdentifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIdentifyRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public OperateIdentifyRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public OperateIdentifyRequest setStyleName(String styleName) {
        this.styleName = styleName;
        return this;
    }
    public String getStyleName() {
        return this.styleName;
    }

    public OperateIdentifyRequest setStyleCode(String styleCode) {
        this.styleCode = styleCode;
        return this;
    }
    public String getStyleCode() {
        return this.styleCode;
    }

    public OperateIdentifyRequest setIdentifyPointList(java.util.List<IdentifyPointReq> identifyPointList) {
        this.identifyPointList = identifyPointList;
        return this;
    }
    public java.util.List<IdentifyPointReq> getIdentifyPointList() {
        return this.identifyPointList;
    }

    public OperateIdentifyRequest setIdentifyPointImgList(java.util.List<String> identifyPointImgList) {
        this.identifyPointImgList = identifyPointImgList;
        return this;
    }
    public java.util.List<String> getIdentifyPointImgList() {
        return this.identifyPointImgList;
    }

}
