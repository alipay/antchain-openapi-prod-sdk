// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgServiceratelimitrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 分页参数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 分页参数
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    public static QuerySgServiceratelimitrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySgServiceratelimitrulesRequest self = new QuerySgServiceratelimitrulesRequest();
        return TeaModel.build(map, self);
    }

    public QuerySgServiceratelimitrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySgServiceratelimitrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySgServiceratelimitrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QuerySgServiceratelimitrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySgServiceratelimitrulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySgServiceratelimitrulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
