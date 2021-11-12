// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryProdinstanceAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名，当前版本应用名不是全局唯一的，请结合产品码一起查询。
    @NameInMap("app_name")
    public String appName;

    // 单元ID
    @NameInMap("cell_id")
    public String cellId;

    // 部署单元。
    @NameInMap("deploy_unit")
    public String deployUnit;

    // 部署域。当前版本暂不支持。
    @NameInMap("deploy_zone")
    public String deployZone;

    // 环境唯一标识。
    @NameInMap("env_id")
    public String envId;

    // 当前页码，默认为1。
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认10，最大100。
    @NameInMap("page_size")
    public Long pageSize;

    // 产品码。
    @NameInMap("product_code")
    public String productCode;

    // 产品分组。如果入参设置了产品码，则默认忽略产品分组。
    @NameInMap("product_group")
    public String productGroup;

    public static QueryProdinstanceAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProdinstanceAppserviceRequest self = new QueryProdinstanceAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryProdinstanceAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProdinstanceAppserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryProdinstanceAppserviceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryProdinstanceAppserviceRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public QueryProdinstanceAppserviceRequest setDeployUnit(String deployUnit) {
        this.deployUnit = deployUnit;
        return this;
    }
    public String getDeployUnit() {
        return this.deployUnit;
    }

    public QueryProdinstanceAppserviceRequest setDeployZone(String deployZone) {
        this.deployZone = deployZone;
        return this;
    }
    public String getDeployZone() {
        return this.deployZone;
    }

    public QueryProdinstanceAppserviceRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public QueryProdinstanceAppserviceRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryProdinstanceAppserviceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryProdinstanceAppserviceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryProdinstanceAppserviceRequest setProductGroup(String productGroup) {
        this.productGroup = productGroup;
        return this;
    }
    public String getProductGroup() {
        return this.productGroup;
    }

}
