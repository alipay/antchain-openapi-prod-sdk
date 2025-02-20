// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class ReceiveDrrdataTrackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务数据
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 运单
    @NameInMap("mail_no")
    @Validation(required = true)
    public String mailNo;

    // 快递公司编码
    @NameInMap("cp_code")
    public String cpCode;

    // 自定义标签
    @NameInMap("tag")
    public String tag;

    public static ReceiveDrrdataTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveDrrdataTrackRequest self = new ReceiveDrrdataTrackRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveDrrdataTrackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveDrrdataTrackRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ReceiveDrrdataTrackRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ReceiveDrrdataTrackRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReceiveDrrdataTrackRequest setMailNo(String mailNo) {
        this.mailNo = mailNo;
        return this;
    }
    public String getMailNo() {
        return this.mailNo;
    }

    public ReceiveDrrdataTrackRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public ReceiveDrrdataTrackRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
