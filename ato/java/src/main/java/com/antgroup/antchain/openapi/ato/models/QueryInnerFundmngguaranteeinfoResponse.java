// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundmngguaranteeinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户角色
    // ROLE_MERCHANT(0, "商户"),
    // ROLE_FINANCIER(1, "资金方"),
    // ROLE_MIX(2, "商户资金方"),
    // DATA_PROVIDER(3, "数据提供者"),
    // ROLE_GUARANTOR(4, "担保方"),;
    @NameInMap("tenant_role")
    public Long tenantRole;

    // 担保信息
    @NameInMap("guarantee_info")
    public String guaranteeInfo;

    public static QueryInnerFundmngguaranteeinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundmngguaranteeinfoResponse self = new QueryInnerFundmngguaranteeinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundmngguaranteeinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerFundmngguaranteeinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerFundmngguaranteeinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerFundmngguaranteeinfoResponse setTenantRole(Long tenantRole) {
        this.tenantRole = tenantRole;
        return this;
    }
    public Long getTenantRole() {
        return this.tenantRole;
    }

    public QueryInnerFundmngguaranteeinfoResponse setGuaranteeInfo(String guaranteeInfo) {
        this.guaranteeInfo = guaranteeInfo;
        return this;
    }
    public String getGuaranteeInfo() {
        return this.guaranteeInfo;
    }

}
