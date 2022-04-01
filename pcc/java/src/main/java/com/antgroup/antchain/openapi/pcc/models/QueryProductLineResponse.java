// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class QueryProductLineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 产品树JSON字符串
    @NameInMap("product_tree")
    public java.util.List<BusinessLine> productTree;

    public static QueryProductLineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductLineResponse self = new QueryProductLineResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductLineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProductLineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProductLineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProductLineResponse setProductTree(java.util.List<BusinessLine> productTree) {
        this.productTree = productTree;
        return this;
    }
    public java.util.List<BusinessLine> getProductTree() {
        return this.productTree;
    }

}
