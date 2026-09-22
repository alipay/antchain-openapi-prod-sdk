// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class SearchKmDocumentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 搜索结果JSON数组(KbSearchItem字段定义见文档)
    @NameInMap("items")
    public String items;

    public static SearchKmDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchKmDocumentResponse self = new SearchKmDocumentResponse();
        return TeaModel.build(map, self);
    }

    public SearchKmDocumentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SearchKmDocumentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SearchKmDocumentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SearchKmDocumentResponse setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

}
