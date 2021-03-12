// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVcContentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 目标查询的可验证声明的完整内容，如果有权限则返回明文内容，否则获取失败，此内容为空。
    @NameInMap("vc_content")
    public String vcContent;

    // 目标可验证声明的唯一ID
    @NameInMap("vc_id")
    public String vcId;

    // 当前声明的状态说明： 0：未授权 1：授权成功，-1：已吊销
    @NameInMap("status")
    public String status;

    public static QueryAuthVcContentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVcContentResponse self = new QueryAuthVcContentResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthVcContentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthVcContentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthVcContentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthVcContentResponse setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

    public QueryAuthVcContentResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public QueryAuthVcContentResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
