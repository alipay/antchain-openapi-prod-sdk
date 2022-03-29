// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqAdmingroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集群名
    @NameInMap("cluster")
    public String cluster;

    // 组名
    @NameInMap("group_id")
    public String groupId;

    // 实例ID
    @NameInMap("instance_id")
    public String instanceId;

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 是否显示router group
    @NameInMap("show_router")
    public Boolean showRouter;

    public static ListSofamqAdmingroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqAdmingroupRequest self = new ListSofamqAdmingroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqAdmingroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqAdmingroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqAdmingroupRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListSofamqAdmingroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListSofamqAdmingroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSofamqAdmingroupRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSofamqAdmingroupRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSofamqAdmingroupRequest setShowRouter(Boolean showRouter) {
        this.showRouter = showRouter;
        return this;
    }
    public Boolean getShowRouter() {
        return this.showRouter;
    }

}
