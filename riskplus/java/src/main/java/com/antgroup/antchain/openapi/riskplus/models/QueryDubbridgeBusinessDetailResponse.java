// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeBusinessDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 社会统一信用代码
    @NameInMap("uc_code")
    public String ucCode;

    // 注册日期
    @NameInMap("register_date")
    public String registerDate;

    // 经营地址
    @NameInMap("operating_addr_json")
    public String operatingAddrJson;

    // 详细地址
    @NameInMap("address_detail")
    public String addressDetail;

    public static QueryDubbridgeBusinessDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeBusinessDetailResponse self = new QueryDubbridgeBusinessDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeBusinessDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeBusinessDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeBusinessDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeBusinessDetailResponse setUcCode(String ucCode) {
        this.ucCode = ucCode;
        return this;
    }
    public String getUcCode() {
        return this.ucCode;
    }

    public QueryDubbridgeBusinessDetailResponse setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

    public QueryDubbridgeBusinessDetailResponse setOperatingAddrJson(String operatingAddrJson) {
        this.operatingAddrJson = operatingAddrJson;
        return this;
    }
    public String getOperatingAddrJson() {
        return this.operatingAddrJson;
    }

    public QueryDubbridgeBusinessDetailResponse setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
        return this;
    }
    public String getAddressDetail() {
        return this.addressDetail;
    }

}
