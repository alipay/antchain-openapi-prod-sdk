// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetSofamqConsumerstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的单元
    @NameInMap("cell")
    public String cell;

    // 是否查询详细信息。取值说明如下：true：要查询详细信息；false：不查询详细信息。
    @NameInMap("detail")
    public Boolean detail;

    // 需要查询的消费端 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 是否打印 Jstack 信息
    @NameInMap("need_jstack")
    public Boolean needJstack;

    public static GetSofamqConsumerstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSofamqConsumerstatusRequest self = new GetSofamqConsumerstatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSofamqConsumerstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSofamqConsumerstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetSofamqConsumerstatusRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public GetSofamqConsumerstatusRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public GetSofamqConsumerstatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetSofamqConsumerstatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSofamqConsumerstatusRequest setNeedJstack(Boolean needJstack) {
        this.needJstack = needJstack;
        return this;
    }
    public Boolean getNeedJstack() {
        return this.needJstack;
    }

}
