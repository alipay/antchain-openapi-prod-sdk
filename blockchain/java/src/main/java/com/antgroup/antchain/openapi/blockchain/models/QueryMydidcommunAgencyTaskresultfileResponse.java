// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryMydidcommunAgencyTaskresultfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 文件临时路径
    @NameInMap("file_url")
    public String fileUrl;

    public static QueryMydidcommunAgencyTaskresultfileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMydidcommunAgencyTaskresultfileResponse self = new QueryMydidcommunAgencyTaskresultfileResponse();
        return TeaModel.build(map, self);
    }

    public QueryMydidcommunAgencyTaskresultfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMydidcommunAgencyTaskresultfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMydidcommunAgencyTaskresultfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMydidcommunAgencyTaskresultfileResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
