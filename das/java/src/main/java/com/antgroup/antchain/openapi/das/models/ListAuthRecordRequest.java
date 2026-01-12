// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ListAuthRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源可信空间id
    @NameInMap("source_service_node_id")
    @Validation(required = true)
    public String sourceServiceNodeId;

    // 数据源租户id
    @NameInMap("source_tenant_id")
    @Validation(required = true)
    public String sourceTenantId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 用户信息
    @NameInMap("user_info")
    public String userInfo;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListAuthRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthRecordRequest self = new ListAuthRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAuthRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAuthRecordRequest setSourceServiceNodeId(String sourceServiceNodeId) {
        this.sourceServiceNodeId = sourceServiceNodeId;
        return this;
    }
    public String getSourceServiceNodeId() {
        return this.sourceServiceNodeId;
    }

    public ListAuthRecordRequest setSourceTenantId(String sourceTenantId) {
        this.sourceTenantId = sourceTenantId;
        return this;
    }
    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

    public ListAuthRecordRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ListAuthRecordRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

    public ListAuthRecordRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAuthRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
