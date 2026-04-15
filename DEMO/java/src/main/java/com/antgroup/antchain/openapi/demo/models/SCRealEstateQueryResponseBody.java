// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class SCRealEstateQueryResponseBody extends TeaModel {
    // cost
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("cost")
    @Validation(required = true)
    public Long cost;

    // response_status
    /**
     * <strong>example:</strong>
     * <p>response_status</p>
     */
    @NameInMap("response_status")
    @Validation(required = true)
    public String responseStatus;

    // response_code
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("response_code")
    @Validation(required = true)
    public String responseCode;

    // request_id
    /**
     * <strong>example:</strong>
     * <p>request_id</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // payload
    @NameInMap("payload")
    @Validation(required = true)
    public SCRealEstateQueryResponsePayload payload;

    public static SCRealEstateQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SCRealEstateQueryResponseBody self = new SCRealEstateQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SCRealEstateQueryResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public SCRealEstateQueryResponseBody setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }
    public String getResponseStatus() {
        return this.responseStatus;
    }

    public SCRealEstateQueryResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public SCRealEstateQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SCRealEstateQueryResponseBody setPayload(SCRealEstateQueryResponsePayload payload) {
        this.payload = payload;
        return this;
    }
    public SCRealEstateQueryResponsePayload getPayload() {
        return this.payload;
    }

}
