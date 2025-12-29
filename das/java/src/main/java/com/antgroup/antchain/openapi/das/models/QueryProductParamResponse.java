// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryProductParamResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户表示类型
    @NameInMap("user_type")
    public String userType;

    // 产品参数信息列表
    @NameInMap("param_info_list")
    public java.util.List<ProductParamInfo> paramInfoList;

    public static QueryProductParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductParamResponse self = new QueryProductParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductParamResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProductParamResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProductParamResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProductParamResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public QueryProductParamResponse setParamInfoList(java.util.List<ProductParamInfo> paramInfoList) {
        this.paramInfoList = paramInfoList;
        return this;
    }
    public java.util.List<ProductParamInfo> getParamInfoList() {
        return this.paramInfoList;
    }

}
