// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryRightsprodVoucherResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 用户openId
    @NameInMap("open_id")
    public String openId;

    // 应用ID
    @NameInMap("app_id")
    public String appId;

    // 权益编码
    @NameInMap("rights_code")
    public String rightsCode;

    // 权益名称
    @NameInMap("rights_name")
    public String rightsName;

    // 券实例编码
    @NameInMap("voucher_code")
    public String voucherCode;

    // 券状态
    // WAIT_EFFECT：待生效 
    // WAIT_VERIFY：待核销 
    // EXPIRED：已过期 
    // VERIFY_SUCCESS：核销成功（已核销）
    // INVALID：已失效 
    // 公域场景下只会包含以上五种状态，私域场景会包含下方状态基
    // FREEZE：已冻结 
    // VERIFYING：核销处理中 
    // VERIFY_FAIL：核销失败 
    // VERIFY_CANCELING：核销撤销中
    // NO_NEED_VERIFY：无需核销
    @NameInMap("status")
    public String status;

    public static QueryRightsprodVoucherResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRightsprodVoucherResponse self = new QueryRightsprodVoucherResponse();
        return TeaModel.build(map, self);
    }

    public QueryRightsprodVoucherResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRightsprodVoucherResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRightsprodVoucherResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRightsprodVoucherResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryRightsprodVoucherResponse setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QueryRightsprodVoucherResponse setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryRightsprodVoucherResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryRightsprodVoucherResponse setRightsCode(String rightsCode) {
        this.rightsCode = rightsCode;
        return this;
    }
    public String getRightsCode() {
        return this.rightsCode;
    }

    public QueryRightsprodVoucherResponse setRightsName(String rightsName) {
        this.rightsName = rightsName;
        return this;
    }
    public String getRightsName() {
        return this.rightsName;
    }

    public QueryRightsprodVoucherResponse setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

    public QueryRightsprodVoucherResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
