// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CheckCommercialcoreProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // true: code已存在 ；false : code不存在
    @NameInMap("is_duplicate")
    public Boolean isDuplicate;

    public static CheckCommercialcoreProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCommercialcoreProductResponse self = new CheckCommercialcoreProductResponse();
        return TeaModel.build(map, self);
    }

    public CheckCommercialcoreProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckCommercialcoreProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckCommercialcoreProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckCommercialcoreProductResponse setIsDuplicate(Boolean isDuplicate) {
        this.isDuplicate = isDuplicate;
        return this;
    }
    public Boolean getIsDuplicate() {
        return this.isDuplicate;
    }

}
