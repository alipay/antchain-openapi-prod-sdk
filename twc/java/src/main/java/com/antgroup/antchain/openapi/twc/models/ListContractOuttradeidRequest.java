// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ListContractOuttradeidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 分页第几页
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 每页的大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListContractOuttradeidRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContractOuttradeidRequest self = new ListContractOuttradeidRequest();
        return TeaModel.build(map, self);
    }

    public ListContractOuttradeidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListContractOuttradeidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListContractOuttradeidRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ListContractOuttradeidRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListContractOuttradeidRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
