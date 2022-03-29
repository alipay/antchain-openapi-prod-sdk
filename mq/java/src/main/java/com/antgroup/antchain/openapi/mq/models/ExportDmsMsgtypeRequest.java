// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExportDmsMsgtypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // id列表，为空则表示导出当前instance_id全部数据
    @NameInMap("ids")
    public String ids;

    // field
    @NameInMap("field")
    public String field;

    // order
    @NameInMap("order")
    public String order;

    // topic
    @NameInMap("topic")
    public String topic;

    // eventcode
    @NameInMap("eventcode")
    public String eventcode;

    public static ExportDmsMsgtypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDmsMsgtypeRequest self = new ExportDmsMsgtypeRequest();
        return TeaModel.build(map, self);
    }

    public ExportDmsMsgtypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportDmsMsgtypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExportDmsMsgtypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportDmsMsgtypeRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ExportDmsMsgtypeRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public ExportDmsMsgtypeRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ExportDmsMsgtypeRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExportDmsMsgtypeRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

}
