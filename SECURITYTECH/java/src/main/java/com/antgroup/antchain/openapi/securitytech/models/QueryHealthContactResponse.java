// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryHealthContactResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 品牌方渠道标识
    @NameInMap("channe_id")
    public String channeId;

    // 设备唯一id
    @NameInMap("tuid")
    public String tuid;

    // 健康联系人信息
    @NameInMap("contact_list")
    public java.util.List<HealthContactInfo> contactList;

    public static QueryHealthContactResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthContactResponse self = new QueryHealthContactResponse();
        return TeaModel.build(map, self);
    }

    public QueryHealthContactResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHealthContactResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHealthContactResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHealthContactResponse setChanneId(String channeId) {
        this.channeId = channeId;
        return this;
    }
    public String getChanneId() {
        return this.channeId;
    }

    public QueryHealthContactResponse setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryHealthContactResponse setContactList(java.util.List<HealthContactInfo> contactList) {
        this.contactList = contactList;
        return this;
    }
    public java.util.List<HealthContactInfo> getContactList() {
        return this.contactList;
    }

}
