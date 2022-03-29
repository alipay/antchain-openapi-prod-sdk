// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorrecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务执行摘要
    @NameInMap("digest")
    @Validation(required = true)
    public InstanceDigest digest;

    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 时间，本字段已经废除，不需要传递
    @NameInMap("date")
    public String date;

    public static QuerySofamqConnectorrecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorrecordRequest self = new QuerySofamqConnectorrecordRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorrecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConnectorrecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConnectorrecordRequest setDigest(InstanceDigest digest) {
        this.digest = digest;
        return this;
    }
    public InstanceDigest getDigest() {
        return this.digest;
    }

    public QuerySofamqConnectorrecordRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QuerySofamqConnectorrecordRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
