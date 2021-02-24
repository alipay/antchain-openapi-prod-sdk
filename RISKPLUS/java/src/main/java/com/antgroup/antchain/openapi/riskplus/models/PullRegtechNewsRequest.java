// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PullRegtechNewsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 表示本地数据库中舆情数据中的最大id
    @NameInMap("news_max_id")
    @Validation(required = true)
    public String newsMaxId;

    public static PullRegtechNewsRequest build(java.util.Map<String, ?> map) throws Exception {
        PullRegtechNewsRequest self = new PullRegtechNewsRequest();
        return TeaModel.build(map, self);
    }

    public PullRegtechNewsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullRegtechNewsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PullRegtechNewsRequest setNewsMaxId(String newsMaxId) {
        this.newsMaxId = newsMaxId;
        return this;
    }
    public String getNewsMaxId() {
        return this.newsMaxId;
    }

}
