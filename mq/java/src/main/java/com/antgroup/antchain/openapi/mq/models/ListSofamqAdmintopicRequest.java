// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqAdmintopicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例ID
    @NameInMap("instance_id")
    public String instanceId;

    // 集群名
    @NameInMap("cluster")
    public String cluster;

    // topic名
    @NameInMap("topic")
    public String topic;

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    //  页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListSofamqAdmintopicRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqAdmintopicRequest self = new ListSofamqAdmintopicRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqAdmintopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqAdmintopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqAdmintopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSofamqAdmintopicRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListSofamqAdmintopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ListSofamqAdmintopicRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSofamqAdmintopicRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
