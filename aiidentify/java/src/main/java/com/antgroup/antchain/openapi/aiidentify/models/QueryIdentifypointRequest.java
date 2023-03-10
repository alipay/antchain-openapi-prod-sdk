// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class QueryIdentifypointRequest extends TeaModel {
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

    public static QueryIdentifypointRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentifypointRequest self = new QueryIdentifypointRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdentifypointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdentifypointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdentifypointRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public QueryIdentifypointRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public QueryIdentifypointRequest setStyleName(String styleName) {
        this.styleName = styleName;
        return this;
    }
    public String getStyleName() {
        return this.styleName;
    }

}
