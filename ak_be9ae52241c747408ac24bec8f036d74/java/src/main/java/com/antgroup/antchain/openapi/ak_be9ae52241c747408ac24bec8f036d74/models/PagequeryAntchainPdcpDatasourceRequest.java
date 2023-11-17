// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class PagequeryAntchainPdcpDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源名称，筛选用，非必填
    @NameInMap("name")
    public String name;

    // 数据源类型，筛选用，非必填。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // OSS,
    // MINIO
    @NameInMap("type")
    public String type;

    // 数据源是否可写，筛选用，非必填
    @NameInMap("writable")
    public Boolean writable;

    // 分页页数，必填
    @NameInMap("page")
    @Validation(required = true, minimum = 1)
    public Long page;

    // 分页大小，必填
    @NameInMap("page_size")
    @Validation(required = true, minimum = 1)
    public Long pageSize;

    public static PagequeryAntchainPdcpDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntchainPdcpDatasourceRequest self = new PagequeryAntchainPdcpDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAntchainPdcpDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAntchainPdcpDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryAntchainPdcpDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PagequeryAntchainPdcpDatasourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PagequeryAntchainPdcpDatasourceRequest setWritable(Boolean writable) {
        this.writable = writable;
        return this;
    }
    public Boolean getWritable() {
        return this.writable;
    }

    public PagequeryAntchainPdcpDatasourceRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PagequeryAntchainPdcpDatasourceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
