// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetCourtTextnotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 业务类型标识
    @NameInMap("business_type")
    public String businessType;

    // 数据类型标识
    @NameInMap("data_type")
    public String dataType;

    // 文本数据
    @NameInMap("text_content")
    public String textContent;

    // 可信时间戳
    @NameInMap("tsr")
    public TsrResponse tsr;

    // 对应的法院编号
    @NameInMap("agency_code")
    public String agencyCode;

    // 对应的法院应用ID
    @NameInMap("application_code")
    public String applicationCode;

    public static GetCourtTextnotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCourtTextnotaryResponse self = new GetCourtTextnotaryResponse();
        return TeaModel.build(map, self);
    }

    public GetCourtTextnotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCourtTextnotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCourtTextnotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCourtTextnotaryResponse setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetCourtTextnotaryResponse setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetCourtTextnotaryResponse setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public GetCourtTextnotaryResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

    public GetCourtTextnotaryResponse setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
        return this;
    }
    public String getAgencyCode() {
        return this.agencyCode;
    }

    public GetCourtTextnotaryResponse setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

}
