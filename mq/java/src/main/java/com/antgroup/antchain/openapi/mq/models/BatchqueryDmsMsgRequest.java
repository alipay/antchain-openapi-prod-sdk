// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class BatchqueryDmsMsgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // born_time_begin
    @NameInMap("born_time_begin")
    @Validation(required = true)
    public String bornTimeBegin;

    // born_time_end
    @NameInMap("born_time_end")
    @Validation(required = true)
    public String bornTimeEnd;

    // current_page
    @NameInMap("page_num")
    public Long pageNum;

    // eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static BatchqueryDmsMsgRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryDmsMsgRequest self = new BatchqueryDmsMsgRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryDmsMsgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryDmsMsgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryDmsMsgRequest setBornTimeBegin(String bornTimeBegin) {
        this.bornTimeBegin = bornTimeBegin;
        return this;
    }
    public String getBornTimeBegin() {
        return this.bornTimeBegin;
    }

    public BatchqueryDmsMsgRequest setBornTimeEnd(String bornTimeEnd) {
        this.bornTimeEnd = bornTimeEnd;
        return this;
    }
    public String getBornTimeEnd() {
        return this.bornTimeEnd;
    }

    public BatchqueryDmsMsgRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchqueryDmsMsgRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public BatchqueryDmsMsgRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchqueryDmsMsgRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryDmsMsgRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
