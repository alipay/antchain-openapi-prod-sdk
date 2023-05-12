// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class QueryBiztypeRelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 参与者信息
    @NameInMap("app_action")
    public java.util.List<AppActionVO> appAction;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 业务类型
    @NameInMap("biz_type")
    public String bizType;

    // 描述
    @NameInMap("desc")
    public String desc;

    public static QueryBiztypeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBiztypeRelationResponse self = new QueryBiztypeRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryBiztypeRelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBiztypeRelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBiztypeRelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBiztypeRelationResponse setAppAction(java.util.List<AppActionVO> appAction) {
        this.appAction = appAction;
        return this;
    }
    public java.util.List<AppActionVO> getAppAction() {
        return this.appAction;
    }

    public QueryBiztypeRelationResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryBiztypeRelationResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryBiztypeRelationResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
