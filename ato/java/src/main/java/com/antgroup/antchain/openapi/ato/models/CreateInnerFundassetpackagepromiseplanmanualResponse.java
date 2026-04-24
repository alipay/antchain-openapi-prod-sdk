// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerFundassetpackagepromiseplanmanualResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产包履约计划列表
    @NameInMap("asset_package_promise_plan_list")
    public java.util.List<AssetPackagePromisePlan> assetPackagePromisePlanList;

    public static CreateInnerFundassetpackagepromiseplanmanualResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerFundassetpackagepromiseplanmanualResponse self = new CreateInnerFundassetpackagepromiseplanmanualResponse();
        return TeaModel.build(map, self);
    }

    public CreateInnerFundassetpackagepromiseplanmanualResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateInnerFundassetpackagepromiseplanmanualResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateInnerFundassetpackagepromiseplanmanualResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateInnerFundassetpackagepromiseplanmanualResponse setAssetPackagePromisePlanList(java.util.List<AssetPackagePromisePlan> assetPackagePromisePlanList) {
        this.assetPackagePromisePlanList = assetPackagePromisePlanList;
        return this;
    }
    public java.util.List<AssetPackagePromisePlan> getAssetPackagePromisePlanList() {
        return this.assetPackagePromisePlanList;
    }

}
