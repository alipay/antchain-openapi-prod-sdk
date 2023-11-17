// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class PagequeryAntchainPdcpDatasetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集名称
    @NameInMap("name")
    public String name;

    // 所属的数据源id，非必填
    @NameInMap("datasource_id")
    public String datasourceId;

    // 所属的数据源类型，非必填。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    @NameInMap("datasource_type")
    public String datasourceType;

    // 分页页数,不允许为空
    @NameInMap("page")
    @Validation(required = true, minimum = 1)
    public Long page;

    // 分页大小，不允许为空
    @NameInMap("page_size")
    @Validation(required = true, minimum = 1)
    public Long pageSize;

    public static PagequeryAntchainPdcpDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntchainPdcpDatasetRequest self = new PagequeryAntchainPdcpDatasetRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAntchainPdcpDatasetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAntchainPdcpDatasetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryAntchainPdcpDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PagequeryAntchainPdcpDatasetRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public PagequeryAntchainPdcpDatasetRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public PagequeryAntchainPdcpDatasetRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PagequeryAntchainPdcpDatasetRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
