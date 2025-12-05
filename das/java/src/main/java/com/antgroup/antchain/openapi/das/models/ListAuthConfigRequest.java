// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ListAuthConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 连接器空间id
    @NameInMap("source_space_id")
    @Validation(required = true)
    public String sourceSpaceId;

    // 客户名称
    @NameInMap("target_name")
    public String targetName;

    // 业务应用名称
    @NameInMap("auth_app_name")
    public String authAppName;

    // 授权内容code列表
    @NameInMap("auth_content_code_list")
    public java.util.List<String> authContentCodeList;

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

    public ListAuthConfigRequest setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
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
