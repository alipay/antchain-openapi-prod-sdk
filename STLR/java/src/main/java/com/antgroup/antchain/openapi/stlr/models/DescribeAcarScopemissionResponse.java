// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DescribeAcarScopemissionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总排放量
    @NameInMap("total_emissions")
    public Long totalEmissions;

    // 单位
    @NameInMap("unit")
    public String unit;

    // 各范围的排放情况列表
    @NameInMap("scope_emissions_list")
    public java.util.List<EmissionsScopeStatistics> scopeEmissionsList;

    public static DescribeAcarScopemissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcarScopemissionResponse self = new DescribeAcarScopemissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAcarScopemissionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeAcarScopemissionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAcarScopemissionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeAcarScopemissionResponse setTotalEmissions(Long totalEmissions) {
        this.totalEmissions = totalEmissions;
        return this;
    }
    public Long getTotalEmissions() {
        return this.totalEmissions;
    }

    public DescribeAcarScopemissionResponse setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public DescribeAcarScopemissionResponse setScopeEmissionsList(java.util.List<EmissionsScopeStatistics> scopeEmissionsList) {
        this.scopeEmissionsList = scopeEmissionsList;
        return this;
    }
    public java.util.List<EmissionsScopeStatistics> getScopeEmissionsList() {
        return this.scopeEmissionsList;
    }

}
