// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ListAuthConfigRequest extends TeaModel {
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

    // 客户名称
    @NameInMap("target_name")
    public String targetName;

    // 业务应用名称
    @NameInMap("auth_app_name")
    public String authAppName;

    // 授权内容code列表
    @NameInMap("auth_content_code_list")
    public java.util.List<String> authContentCodeList;

    // 国标产品标识码列表
    @NameInMap("product_identity_id_list")
    public java.util.List<String> productIdentityIdList;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthConfigRequest self = new ListAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAuthConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAuthConfigRequest setSourceServiceNodeId(String sourceServiceNodeId) {
        this.sourceServiceNodeId = sourceServiceNodeId;
        return this;
    }
    public String getSourceServiceNodeId() {
        return this.sourceServiceNodeId;
    }

    public ListAuthConfigRequest setSourceTenantId(String sourceTenantId) {
        this.sourceTenantId = sourceTenantId;
        return this;
    }
    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

    public ListAuthConfigRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ListAuthConfigRequest setAuthAppName(String authAppName) {
        this.authAppName = authAppName;
        return this;
    }
    public String getAuthAppName() {
        return this.authAppName;
    }

    public ListAuthConfigRequest setAuthContentCodeList(java.util.List<String> authContentCodeList) {
        this.authContentCodeList = authContentCodeList;
        return this;
    }
    public java.util.List<String> getAuthContentCodeList() {
        return this.authContentCodeList;
    }

    public ListAuthConfigRequest setProductIdentityIdList(java.util.List<String> productIdentityIdList) {
        this.productIdentityIdList = productIdentityIdList;
        return this;
    }
    public java.util.List<String> getProductIdentityIdList() {
        return this.productIdentityIdList;
    }

    public ListAuthConfigRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAuthConfigRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
