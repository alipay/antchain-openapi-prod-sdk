// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationBatchqueryresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果文件临时链接
    // 
    @NameInMap("file_path")
    public String filePath;

    // 描述结果文件完成进度：
    // 如：
    // 余额不足，部分内容查询完成
    @NameInMap("message")
    public String message;

    public static QueryApplicationBatchqueryresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationBatchqueryresultResponse self = new QueryApplicationBatchqueryresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationBatchqueryresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationBatchqueryresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationBatchqueryresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationBatchqueryresultResponse setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public QueryApplicationBatchqueryresultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
