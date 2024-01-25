// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAcopmTestobjectTestsubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // consumerId
    @NameInMap("consumerid")
    public String consumerid;

    // originMsgId
    @NameInMap("originmsgid")
    public String originmsgid;

    // prodCode
    @NameInMap("prodcode")
    public String prodcode;

    // msgSource
    @NameInMap("msgsource")
    public String msgsource;

    public static QueryAcopmTestobjectTestsubRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAcopmTestobjectTestsubRequest self = new QueryAcopmTestobjectTestsubRequest();
        return TeaModel.build(map, self);
    }

    public QueryAcopmTestobjectTestsubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAcopmTestobjectTestsubRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAcopmTestobjectTestsubRequest setConsumerid(String consumerid) {
        this.consumerid = consumerid;
        return this;
    }
    public String getConsumerid() {
        return this.consumerid;
    }

    public QueryAcopmTestobjectTestsubRequest setOriginmsgid(String originmsgid) {
        this.originmsgid = originmsgid;
        return this;
    }
    public String getOriginmsgid() {
        return this.originmsgid;
    }

    public QueryAcopmTestobjectTestsubRequest setProdcode(String prodcode) {
        this.prodcode = prodcode;
        return this;
    }
    public String getProdcode() {
        return this.prodcode;
    }

    public QueryAcopmTestobjectTestsubRequest setMsgsource(String msgsource) {
        this.msgsource = msgsource;
        return this;
    }
    public String getMsgsource() {
        return this.msgsource;
    }

}
