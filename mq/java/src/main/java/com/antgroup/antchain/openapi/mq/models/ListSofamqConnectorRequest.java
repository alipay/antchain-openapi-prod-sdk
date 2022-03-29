// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqConnectorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 任务查询条件
    @NameInMap("query")
    public ConnectorJobQuery query;

    // 租户实例编号
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static ListSofamqConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqConnectorRequest self = new ListSofamqConnectorRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqConnectorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqConnectorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqConnectorRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSofamqConnectorRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSofamqConnectorRequest setQuery(ConnectorJobQuery query) {
        this.query = query;
        return this;
    }
    public ConnectorJobQuery getQuery() {
        return this.query;
    }

    public ListSofamqConnectorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
