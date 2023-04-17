// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class GetMessagesHistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 历史数据提交的产物
    @NameInMap("submit_id")
    @Validation(required = true)
    public String submitId;

    // request_id
    @NameInMap("request_id")
    public String requestId;

    // page_now
    @NameInMap("page_now")
    @Validation(required = true)
    public Long pageNow;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static GetMessagesHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessagesHistoryRequest self = new GetMessagesHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetMessagesHistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMessagesHistoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMessagesHistoryRequest setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

    public GetMessagesHistoryRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessagesHistoryRequest setPageNow(Long pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Long getPageNow() {
        return this.pageNow;
    }

    public GetMessagesHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
