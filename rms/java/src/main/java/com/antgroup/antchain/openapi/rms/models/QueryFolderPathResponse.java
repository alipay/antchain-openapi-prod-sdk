// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryFolderPathResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件夹路径
    @NameInMap("paths")
    public java.util.List<FolderPath> paths;

    public static QueryFolderPathResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFolderPathResponse self = new QueryFolderPathResponse();
        return TeaModel.build(map, self);
    }

    public QueryFolderPathResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFolderPathResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFolderPathResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFolderPathResponse setPaths(java.util.List<FolderPath> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<FolderPath> getPaths() {
        return this.paths;
    }

}
