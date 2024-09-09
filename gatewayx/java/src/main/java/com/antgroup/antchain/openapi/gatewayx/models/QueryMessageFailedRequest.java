// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class QueryMessageFailedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 消息事件编码
    @NameInMap("msg_key")
    @Validation(required = true)
    public String msgKey;

    // 消费方id，例如appId，tenantId 只支持单个传入
    @NameInMap("consumer_id")
    public String consumerId;

    // 消费者类型，例如TENANT, APP
    @NameInMap("consumer_type")
    public String consumerType;

    // 每页条数，最大支持100条
    @NameInMap("page_size")
    @Validation(required = true)
    public String pageSize;

    // 第几页
    @NameInMap("page_num")
    @Validation(required = true)
    public String pageNum;

    public static QueryMessageFailedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageFailedRequest self = new QueryMessageFailedRequest();
        return TeaModel.build(map, self);
    }

    public QueryMessageFailedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMessageFailedRequest setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public QueryMessageFailedRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public QueryMessageFailedRequest setConsumerType(String consumerType) {
        this.consumerType = consumerType;
        return this;
    }
    public String getConsumerType() {
        return this.consumerType;
    }

    public QueryMessageFailedRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryMessageFailedRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

}
