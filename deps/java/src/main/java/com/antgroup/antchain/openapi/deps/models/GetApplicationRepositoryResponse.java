// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationRepositoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代码库信息
    @NameInMap("repository")
    public Repository repository;

    public static GetApplicationRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationRepositoryResponse self = new GetApplicationRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationRepositoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetApplicationRepositoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetApplicationRepositoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetApplicationRepositoryResponse setRepository(Repository repository) {
        this.repository = repository;
        return this;
    }
    public Repository getRepository() {
        return this.repository;
    }

}
