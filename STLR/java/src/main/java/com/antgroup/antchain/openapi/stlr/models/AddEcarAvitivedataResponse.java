// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddEcarAvitivedataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 排放数据录入明细编码
    @NameInMap("emission_data_entry_item_no")
    public String emissionDataEntryItemNo;

    // 企业业务单号
    @NameInMap("enterprise_biz_no")
    public String enterpriseBizNo;

    public static AddEcarAvitivedataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEcarAvitivedataResponse self = new AddEcarAvitivedataResponse();
        return TeaModel.build(map, self);
    }

    public AddEcarAvitivedataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddEcarAvitivedataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddEcarAvitivedataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddEcarAvitivedataResponse setEmissionDataEntryItemNo(String emissionDataEntryItemNo) {
        this.emissionDataEntryItemNo = emissionDataEntryItemNo;
        return this;
    }
    public String getEmissionDataEntryItemNo() {
        return this.emissionDataEntryItemNo;
    }

    public AddEcarAvitivedataResponse setEnterpriseBizNo(String enterpriseBizNo) {
        this.enterpriseBizNo = enterpriseBizNo;
        return this;
    }
    public String getEnterpriseBizNo() {
        return this.enterpriseBizNo;
    }

}
