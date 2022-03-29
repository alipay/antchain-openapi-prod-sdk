// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryTopicsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // page num
    @NameInMap("page_num")
    @Validation(required = true)
    public Integer pageNum;

    // page size
    @NameInMap("page_size")
    @Validation(required = true)
    public Integer pageSize;

    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QueryTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicsRequest self = new QueryTopicsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopicsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTopicsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTopicsRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public QueryTopicsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTopicsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTopicsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTopicsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
