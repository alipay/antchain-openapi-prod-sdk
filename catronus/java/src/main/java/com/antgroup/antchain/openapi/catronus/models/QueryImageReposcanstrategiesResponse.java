// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryImageReposcanstrategiesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 镜像扫描策略
    @NameInMap("repo_strategies")
    public java.util.List<RepoScanStrategy> repoStrategies;

    public static QueryImageReposcanstrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageReposcanstrategiesResponse self = new QueryImageReposcanstrategiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageReposcanstrategiesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryImageReposcanstrategiesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryImageReposcanstrategiesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryImageReposcanstrategiesResponse setRepoStrategies(java.util.List<RepoScanStrategy> repoStrategies) {
        this.repoStrategies = repoStrategies;
        return this;
    }
    public java.util.List<RepoScanStrategy> getRepoStrategies() {
        return this.repoStrategies;
    }

}
