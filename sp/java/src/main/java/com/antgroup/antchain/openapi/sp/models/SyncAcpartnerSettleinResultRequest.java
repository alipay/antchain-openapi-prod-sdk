// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class SyncAcpartnerSettleinResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 租户code
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 入驻申请id
    @NameInMap("apply_id")
    @Validation(required = true)
    public Long applyId;

    // 外部的业务单据号
    @NameInMap("out_business_no")
    @Validation(required = true)
    public String outBusinessNo;

    // 结果码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static SyncAcpartnerSettleinResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAcpartnerSettleinResultRequest self = new SyncAcpartnerSettleinResultRequest();
        return TeaModel.build(map, self);
    }

    public SyncAcpartnerSettleinResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAcpartnerSettleinResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAcpartnerSettleinResultRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public SyncAcpartnerSettleinResultRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SyncAcpartnerSettleinResultRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public SyncAcpartnerSettleinResultRequest setOutBusinessNo(String outBusinessNo) {
        this.outBusinessNo = outBusinessNo;
        return this;
    }
    public String getOutBusinessNo() {
        return this.outBusinessNo;
    }

    public SyncAcpartnerSettleinResultRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
