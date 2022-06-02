// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiAuthteplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // JWT生成，设置失效时间，维持会话数据
    @NameInMap("token")
    public String token;

    // Unix时间戳 秒
    @NameInMap("expire_time")
    public Long expireTime;

    // 模版树
    @NameInMap("tree_template")
    public TreeTemplate treeTemplate;

    public static QueryApiAuthteplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiAuthteplateResponse self = new QueryApiAuthteplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiAuthteplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiAuthteplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiAuthteplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiAuthteplateResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryApiAuthteplateResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public QueryApiAuthteplateResponse setTreeTemplate(TreeTemplate treeTemplate) {
        this.treeTemplate = treeTemplate;
        return this;
    }
    public TreeTemplate getTreeTemplate() {
        return this.treeTemplate;
    }

}
