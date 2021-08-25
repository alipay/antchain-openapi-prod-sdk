// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PullIpCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 正版码批次编码
    @NameInMap("code_batch_id")
    @Validation(required = true)
    public String codeBatchId;

    // 分页参数:页码
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 分页参数:每页条目数(请小于2000)
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PullIpCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        PullIpCodeRequest self = new PullIpCodeRequest();
        return TeaModel.build(map, self);
    }

    public PullIpCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullIpCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PullIpCodeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public PullIpCodeRequest setCodeBatchId(String codeBatchId) {
        this.codeBatchId = codeBatchId;
        return this;
    }
    public String getCodeBatchId() {
        return this.codeBatchId;
    }

    public PullIpCodeRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PullIpCodeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
