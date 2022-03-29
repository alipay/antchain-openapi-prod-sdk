// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cluster
    @NameInMap("cluster")
    public String cluster;

    // data_center
    @NameInMap("data_center")
    public String dataCenter;

    // hostname
    @NameInMap("hostname")
    public String hostname;

    // node_group
    @NameInMap("node_group")
    public String nodeGroup;

    // room
    @NameInMap("room")
    public String room;

    // page num
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // page size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListSofamqNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqNodeRequest self = new ListSofamqNodeRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqNodeRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListSofamqNodeRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ListSofamqNodeRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ListSofamqNodeRequest setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public String getNodeGroup() {
        return this.nodeGroup;
    }

    public ListSofamqNodeRequest setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

    public ListSofamqNodeRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSofamqNodeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
