// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryCodeCombineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数据量
    @NameInMap("total")
    public Long total;

    // 注册码信息
    @NameInMap("register_info")
    public CodeRegisterInfo registerInfo;

    // 关联信息
    @NameInMap("relation_infos")
    public java.util.List<CodeRelationInfo> relationInfos;

    public static QueryCodeCombineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeCombineResponse self = new QueryCodeCombineResponse();
        return TeaModel.build(map, self);
    }

    public QueryCodeCombineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCodeCombineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCodeCombineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCodeCombineResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryCodeCombineResponse setRegisterInfo(CodeRegisterInfo registerInfo) {
        this.registerInfo = registerInfo;
        return this;
    }
    public CodeRegisterInfo getRegisterInfo() {
        return this.registerInfo;
    }

    public QueryCodeCombineResponse setRelationInfos(java.util.List<CodeRelationInfo> relationInfos) {
        this.relationInfos = relationInfos;
        return this;
    }
    public java.util.List<CodeRelationInfo> getRelationInfos() {
        return this.relationInfos;
    }

}
