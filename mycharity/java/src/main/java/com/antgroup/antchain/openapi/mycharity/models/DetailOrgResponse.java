// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class DetailOrgResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 机构详情结构体
    @NameInMap("org_vo")
    public OrgVO orgVo;

    public static DetailOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailOrgResponse self = new DetailOrgResponse();
        return TeaModel.build(map, self);
    }

    public DetailOrgResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailOrgResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailOrgResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailOrgResponse setOrgVo(OrgVO orgVo) {
        this.orgVo = orgVo;
        return this;
    }
    public OrgVO getOrgVo() {
        return this.orgVo;
    }

}
