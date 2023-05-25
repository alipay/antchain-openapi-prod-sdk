// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryImageReposResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 镜像仓库列表
    @NameInMap("repos")
    public java.util.List<ImageRepo> repos;

    public static QueryImageReposResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageReposResponse self = new QueryImageReposResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageReposResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryImageReposResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryImageReposResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryImageReposResponse setRepos(java.util.List<ImageRepo> repos) {
        this.repos = repos;
        return this;
    }
    public java.util.List<ImageRepo> getRepos() {
        return this.repos;
    }

}
