// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class QueryOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小游戏ID
    @NameInMap("mini_program_id")
    @Validation(required = true)
    public String miniProgramId;

    // 平台ID
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 客户订单号
    @NameInMap("custom_id")
    @Validation(required = true)
    public String customId;

    public static QueryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderRequest self = new QueryOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOrderRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public QueryOrderRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public QueryOrderRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

}
