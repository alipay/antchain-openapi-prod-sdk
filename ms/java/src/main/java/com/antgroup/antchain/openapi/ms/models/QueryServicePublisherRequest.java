// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryServicePublisherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // app name
    @NameInMap("data_id")
    public String dataId;

    // num of page
    @NameInMap("page_num")
    @Validation(required = true)
    public Integer pageNum;

    // size of page
    @NameInMap("page_size")
    public String pageSize;

    public static QueryServicePublisherRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServicePublisherRequest self = new QueryServicePublisherRequest();
        return TeaModel.build(map, self);
    }

    public QueryServicePublisherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryServicePublisherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryServicePublisherRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryServicePublisherRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryServicePublisherRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryServicePublisherRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
