// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class NotifyAutoinsuranceEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 车架号
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 通知类型
    @NameInMap("notice_type")
    @Validation(required = true)
    public String noticeType;

    // 投保类型
    @NameInMap("insure_type")
    @Validation(required = true)
    public String insureType;

    // 发生时间yyyy-MM-dd HH:mm:ss
    @NameInMap("happen_time")
    @Validation(required = true)
    public String happenTime;

    // 附加信息，{"samePerson":true}  将会是一个JSON对象，samePerson表示车牌人和投保人是否同一个人，后续可能还会加其它附加信息。
    @NameInMap("extra_info")
    public String extraInfo;

    public static NotifyAutoinsuranceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAutoinsuranceEventRequest self = new NotifyAutoinsuranceEventRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAutoinsuranceEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyAutoinsuranceEventRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public NotifyAutoinsuranceEventRequest setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public NotifyAutoinsuranceEventRequest setNoticeType(String noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public String getNoticeType() {
        return this.noticeType;
    }

    public NotifyAutoinsuranceEventRequest setInsureType(String insureType) {
        this.insureType = insureType;
        return this;
    }
    public String getInsureType() {
        return this.insureType;
    }

    public NotifyAutoinsuranceEventRequest setHappenTime(String happenTime) {
        this.happenTime = happenTime;
        return this;
    }
    public String getHappenTime() {
        return this.happenTime;
    }

    public NotifyAutoinsuranceEventRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
