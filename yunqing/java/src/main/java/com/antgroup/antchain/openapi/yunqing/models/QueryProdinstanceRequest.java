// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryProdinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 单元ID
    @NameInMap("cell_id")
    public String cellId;

    // 环境唯一标识。
    @NameInMap("env_id")
    public String envId;

    // 当前页码。
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小。默认值为10，最大值100。
    @NameInMap("page_size")
    public Long pageSize;

    // 产品码。
    @NameInMap("product_code")
    public String productCode;

    public static QueryProdinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProdinstanceRequest self = new QueryProdinstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryProdinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProdinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryProdinstanceRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public QueryProdinstanceRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public QueryProdinstanceRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryProdinstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryProdinstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
