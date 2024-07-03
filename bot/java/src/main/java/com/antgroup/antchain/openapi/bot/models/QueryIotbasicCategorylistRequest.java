// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotbasicCategorylistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 行业
    @NameInMap("industry")
    public String industry;

    // 场景
    @NameInMap("scene")
    public String scene;

    public static QueryIotbasicCategorylistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotbasicCategorylistRequest self = new QueryIotbasicCategorylistRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotbasicCategorylistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotbasicCategorylistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotbasicCategorylistRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public QueryIotbasicCategorylistRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
