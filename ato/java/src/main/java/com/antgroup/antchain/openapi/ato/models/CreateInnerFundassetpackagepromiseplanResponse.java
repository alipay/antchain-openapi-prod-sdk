// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerFundassetpackagepromiseplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 履约计划
    @NameInMap("promise_plan_list")
    public java.util.List<AssetPackagePromisePlan> promisePlanList;

    public static CreateInnerFundassetpackagepromiseplanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerFundassetpackagepromiseplanResponse self = new CreateInnerFundassetpackagepromiseplanResponse();
        return TeaModel.build(map, self);
    }

    public CreateInnerFundassetpackagepromiseplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateInnerFundassetpackagepromiseplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateInnerFundassetpackagepromiseplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateInnerFundassetpackagepromiseplanResponse setPromisePlanList(java.util.List<AssetPackagePromisePlan> promisePlanList) {
        this.promisePlanList = promisePlanList;
        return this;
    }
    public java.util.List<AssetPackagePromisePlan> getPromisePlanList() {
        return this.promisePlanList;
    }

}
