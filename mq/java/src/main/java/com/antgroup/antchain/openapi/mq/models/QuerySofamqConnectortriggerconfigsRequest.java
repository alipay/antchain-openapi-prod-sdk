// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectortriggerconfigsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // source类型
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // sink类型
    @NameInMap("sink_type")
    @Validation(required = true)
    public String sinkType;

    public static QuerySofamqConnectortriggerconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectortriggerconfigsRequest self = new QuerySofamqConnectortriggerconfigsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectortriggerconfigsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConnectortriggerconfigsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConnectortriggerconfigsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public QuerySofamqConnectortriggerconfigsRequest setSinkType(String sinkType) {
        this.sinkType = sinkType;
        return this;
    }
    public String getSinkType() {
        return this.sinkType;
    }

}
