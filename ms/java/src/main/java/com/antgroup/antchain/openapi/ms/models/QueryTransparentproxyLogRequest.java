// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryTransparentproxyLogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 租户实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 修改人姓名
    @NameInMap("modify_name")
    public String modifyName;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 排序策略，默认为 desc
    @NameInMap("time_sort")
    public String timeSort;

    public static QueryTransparentproxyLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTransparentproxyLogRequest self = new QueryTransparentproxyLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryTransparentproxyLogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTransparentproxyLogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTransparentproxyLogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryTransparentproxyLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTransparentproxyLogRequest setModifyName(String modifyName) {
        this.modifyName = modifyName;
        return this;
    }
    public String getModifyName() {
        return this.modifyName;
    }

    public QueryTransparentproxyLogRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTransparentproxyLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTransparentproxyLogRequest setTimeSort(String timeSort) {
        this.timeSort = timeSort;
        return this;
    }
    public String getTimeSort() {
        return this.timeSort;
    }

}
