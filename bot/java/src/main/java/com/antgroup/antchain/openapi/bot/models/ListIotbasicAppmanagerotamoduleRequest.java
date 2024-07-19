// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotbasicAppmanagerotamoduleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    public static ListIotbasicAppmanagerotamoduleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIotbasicAppmanagerotamoduleRequest self = new ListIotbasicAppmanagerotamoduleRequest();
        return TeaModel.build(map, self);
    }

    public ListIotbasicAppmanagerotamoduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIotbasicAppmanagerotamoduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIotbasicAppmanagerotamoduleRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

}
