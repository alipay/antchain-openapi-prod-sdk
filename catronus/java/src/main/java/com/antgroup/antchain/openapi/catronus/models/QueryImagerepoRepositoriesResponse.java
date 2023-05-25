// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryImagerepoRepositoriesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 仓库列表
    @NameInMap("repositories")
    public java.util.List<Repository> repositories;

    public static QueryImagerepoRepositoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImagerepoRepositoriesResponse self = new QueryImagerepoRepositoriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryImagerepoRepositoriesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryImagerepoRepositoriesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryImagerepoRepositoriesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryImagerepoRepositoriesResponse setRepositories(java.util.List<Repository> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<Repository> getRepositories() {
        return this.repositories;
    }

}
