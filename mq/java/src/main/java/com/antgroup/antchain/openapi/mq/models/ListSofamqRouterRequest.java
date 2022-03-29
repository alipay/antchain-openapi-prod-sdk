// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqRouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目标单元
    @NameInMap("destination_cell")
    public String destinationCell;

    // 目标实例 ID
    @NameInMap("destination_instance_id")
    @Validation(required = true)
    public String destinationInstanceId;

    // 目标 Topic
    @NameInMap("destination_topic")
    public String destinationTopic;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 源单元
    @NameInMap("source_cell")
    public String sourceCell;

    // 源实例 ID
    @NameInMap("source_instance_id")
    @Validation(required = true)
    public String sourceInstanceId;

    // 源 Topic
    @NameInMap("source_topic")
    public String sourceTopic;

    public static ListSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqRouterRequest self = new ListSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqRouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqRouterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqRouterRequest setDestinationCell(String destinationCell) {
        this.destinationCell = destinationCell;
        return this;
    }
    public String getDestinationCell() {
        return this.destinationCell;
    }

    public ListSofamqRouterRequest setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public ListSofamqRouterRequest setDestinationTopic(String destinationTopic) {
        this.destinationTopic = destinationTopic;
        return this;
    }
    public String getDestinationTopic() {
        return this.destinationTopic;
    }

    public ListSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSofamqRouterRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSofamqRouterRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSofamqRouterRequest setSourceCell(String sourceCell) {
        this.sourceCell = sourceCell;
        return this;
    }
    public String getSourceCell() {
        return this.sourceCell;
    }

    public ListSofamqRouterRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListSofamqRouterRequest setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

}
