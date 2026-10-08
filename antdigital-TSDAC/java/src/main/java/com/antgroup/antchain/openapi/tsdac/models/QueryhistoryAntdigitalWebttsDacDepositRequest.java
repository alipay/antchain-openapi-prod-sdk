// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryhistoryAntdigitalWebttsDacDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作员Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 1
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryhistoryAntdigitalWebttsDacDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryhistoryAntdigitalWebttsDacDepositRequest self = new QueryhistoryAntdigitalWebttsDacDepositRequest();
        return TeaModel.build(map, self);
    }

    public QueryhistoryAntdigitalWebttsDacDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryhistoryAntdigitalWebttsDacDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryhistoryAntdigitalWebttsDacDepositRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public QueryhistoryAntdigitalWebttsDacDepositRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryhistoryAntdigitalWebttsDacDepositRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryhistoryAntdigitalWebttsDacDepositRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
