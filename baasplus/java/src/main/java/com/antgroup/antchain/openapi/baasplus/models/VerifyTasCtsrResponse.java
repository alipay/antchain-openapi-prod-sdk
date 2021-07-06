// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class VerifyTasCtsrResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 公司名
    @NameInMap("company_name")
    public String companyName;

    // 事务步骤的描述
    @NameInMap("desc")
    public String desc;

    // 请求时间凭证时传入的事物hash
    @NameInMap("hash_value")
    public String hashValue;

    // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
    @NameInMap("sn")
    public String sn;

    // 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
    @NameInMap("ts")
    public String ts;

    public static VerifyTasCtsrResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyTasCtsrResponse self = new VerifyTasCtsrResponse();
        return TeaModel.build(map, self);
    }

    public VerifyTasCtsrResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyTasCtsrResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyTasCtsrResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyTasCtsrResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public VerifyTasCtsrResponse setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public VerifyTasCtsrResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public VerifyTasCtsrResponse setHashValue(String hashValue) {
        this.hashValue = hashValue;
        return this;
    }
    public String getHashValue() {
        return this.hashValue;
    }

    public VerifyTasCtsrResponse setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public VerifyTasCtsrResponse setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
