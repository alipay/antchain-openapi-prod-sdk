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

    // 联系人业务id
    @NameInMap("contact_id")
    public String contactId;

    // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
    @NameInMap("priority")
    public Long priority;

    // 联系人姓名
    @NameInMap("contact_name")
    public String contactName;

    // 联系人手机号
    @NameInMap("contact_phone")
    public String contactPhone;

    // 是否锁定 - 锁定时不允许c端用户修改联系人信息
    @NameInMap("locked")
    public Boolean locked;

    // 预留可扩展字段
    @NameInMap("extra_info")
    public String extraInfo;

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

    public QueryHealthContactResponse setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public QueryHealthContactResponse setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public QueryHealthContactResponse setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public QueryHealthContactResponse setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public QueryHealthContactResponse setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }
    public Boolean getLocked() {
        return this.locked;
    }

    public QueryHealthContactResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
