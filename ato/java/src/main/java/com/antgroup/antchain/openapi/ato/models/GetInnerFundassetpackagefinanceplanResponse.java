// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetInnerFundassetpackagefinanceplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资金方案
    @NameInMap("asset_package_finance_plan")
    public AssetPackageFinancePlan assetPackageFinancePlan;

    public static GetInnerFundassetpackagefinanceplanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInnerFundassetpackagefinanceplanResponse self = new GetInnerFundassetpackagefinanceplanResponse();
        return TeaModel.build(map, self);
    }

    public GetInnerFundassetpackagefinanceplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInnerFundassetpackagefinanceplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInnerFundassetpackagefinanceplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInnerFundassetpackagefinanceplanResponse setAssetPackageFinancePlan(AssetPackageFinancePlan assetPackageFinancePlan) {
        this.assetPackageFinancePlan = assetPackageFinancePlan;
        return this;
    }
    public AssetPackageFinancePlan getAssetPackageFinancePlan() {
        return this.assetPackageFinancePlan;
    }

}
