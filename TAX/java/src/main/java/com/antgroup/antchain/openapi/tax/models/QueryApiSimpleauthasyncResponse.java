// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiSimpleauthasyncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功
    @NameInMap("return_result")
    public String returnResult;

    // false 有值
    // true  无值
    @NameInMap("null_data_flag")
    public String nullDataFlag;

    // json格式，其他内容
    @NameInMap("biz_content")
    public String bizContent;

    public static QueryApiSimpleauthasyncResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiSimpleauthasyncResponse self = new QueryApiSimpleauthasyncResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiSimpleauthasyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiSimpleauthasyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiSimpleauthasyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiSimpleauthasyncResponse setReturnResult(String returnResult) {
        this.returnResult = returnResult;
        return this;
    }
    public String getReturnResult() {
        return this.returnResult;
    }

    public QueryApiSimpleauthasyncResponse setNullDataFlag(String nullDataFlag) {
        this.nullDataFlag = nullDataFlag;
        return this;
    }
    public String getNullDataFlag() {
        return this.nullDataFlag;
    }

    public QueryApiSimpleauthasyncResponse setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
