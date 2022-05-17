// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class QueryEndpointsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 网络类型, classic, vpc
    @NameInMap("network")
    @Validation(required = true)
    public String network;

    // 当前页数
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页大小, 考虑到数据量并不多, 建议设置分页足够大(就10几个), 比如100, 一次性拿走所有数据
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 租户名
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 工作区名称, 如果不填, 则返回全部workspace的信息
    @NameInMap("workspace")
    public String workspace;

    public static QueryEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEndpointsRequest self = new QueryEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public QueryEndpointsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEndpointsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEndpointsRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public QueryEndpointsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryEndpointsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryEndpointsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryEndpointsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
