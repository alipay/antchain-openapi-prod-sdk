// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class PagequeryAntchainPdcpProjectAuthdatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true, minLength = 1)
    public String projectId;

    // 分页参数
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 分页参数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PagequeryAntchainPdcpProjectAuthdatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntchainPdcpProjectAuthdatasourceRequest self = new PagequeryAntchainPdcpProjectAuthdatasourceRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
