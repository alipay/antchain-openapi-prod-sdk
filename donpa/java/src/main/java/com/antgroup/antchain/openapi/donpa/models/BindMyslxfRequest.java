// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class BindMyslxfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次ID
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 身份证号码
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 绑定哪个手机号码，需要提供修复结果的序号，从1开始。
    @NameInMap("seq")
    @Validation(required = true)
    public Long seq;

    // 呼叫号码。必须预先注册
    @NameInMap("call_number")
    @Validation(required = true)
    public String callNumber;

    // 外显号码，必须预先平台注册
    @NameInMap("display_number")
    @Validation(required = true)
    public String displayNumber;

    public static BindMyslxfRequest build(java.util.Map<String, ?> map) throws Exception {
        BindMyslxfRequest self = new BindMyslxfRequest();
        return TeaModel.build(map, self);
    }

    public BindMyslxfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindMyslxfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindMyslxfRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BindMyslxfRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public BindMyslxfRequest setSeq(Long seq) {
        this.seq = seq;
        return this;
    }
    public Long getSeq() {
        return this.seq;
    }

    public BindMyslxfRequest setCallNumber(String callNumber) {
        this.callNumber = callNumber;
        return this;
    }
    public String getCallNumber() {
        return this.callNumber;
    }

    public BindMyslxfRequest setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
        return this;
    }
    public String getDisplayNumber() {
        return this.displayNumber;
    }

}
