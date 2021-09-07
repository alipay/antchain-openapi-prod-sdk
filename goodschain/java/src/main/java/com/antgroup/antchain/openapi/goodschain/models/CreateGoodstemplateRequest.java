// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class CreateGoodstemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 商品定义描述，格式如示例
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 联盟id
    @NameInMap("league_id")
    @Validation(required = true)
    public String leagueId;

    public static CreateGoodstemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGoodstemplateRequest self = new CreateGoodstemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateGoodstemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateGoodstemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateGoodstemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGoodstemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateGoodstemplateRequest setLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }
    public String getLeagueId() {
        return this.leagueId;
    }

}
