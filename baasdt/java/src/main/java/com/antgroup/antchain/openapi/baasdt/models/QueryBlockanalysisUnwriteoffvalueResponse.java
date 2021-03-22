// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockanalysisUnwriteoffvalueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 资产ID
    @NameInMap("asset_id")
    public String assetId;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 未核销的资产总额（单位：元）
    @NameInMap("total_value")
    public String totalValue;

    public static QueryBlockanalysisUnwriteoffvalueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockanalysisUnwriteoffvalueResponse self = new QueryBlockanalysisUnwriteoffvalueResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockanalysisUnwriteoffvalueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockanalysisUnwriteoffvalueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockanalysisUnwriteoffvalueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockanalysisUnwriteoffvalueResponse setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public QueryBlockanalysisUnwriteoffvalueResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryBlockanalysisUnwriteoffvalueResponse setTotalValue(String totalValue) {
        this.totalValue = totalValue;
        return this;
    }
    public String getTotalValue() {
        return this.totalValue;
    }

}
