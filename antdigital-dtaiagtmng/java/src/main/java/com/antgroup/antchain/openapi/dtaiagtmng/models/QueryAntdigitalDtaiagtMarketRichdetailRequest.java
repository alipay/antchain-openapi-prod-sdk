// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagtmng.models;

import com.aliyun.tea.*;

public class QueryAntdigitalDtaiagtMarketRichdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 市场条目 ID，必填
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 当前空间 ID（用于判断订阅状态），非必填
    @NameInMap("bot_id")
    public Long botId;

    public static QueryAntdigitalDtaiagtMarketRichdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalDtaiagtMarketRichdetailRequest self = new QueryAntdigitalDtaiagtMarketRichdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalDtaiagtMarketRichdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalDtaiagtMarketRichdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalDtaiagtMarketRichdetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryAntdigitalDtaiagtMarketRichdetailRequest setBotId(Long botId) {
        this.botId = botId;
        return this;
    }
    public Long getBotId() {
        return this.botId;
    }

}
