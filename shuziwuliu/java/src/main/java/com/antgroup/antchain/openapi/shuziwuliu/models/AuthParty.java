// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class AuthParty extends TeaModel {
    // 签署方名称
    /**
     * <strong>example:</strong>
     * <p>贾玲</p>
     */
    @NameInMap("sign_party_name")
    @Validation(required = true)
    public String signPartyName;

    // 签署方证件类型，可以填写的枚举类：IDENTIFICATION_CARD，表示身份证
    /**
     * <strong>example:</strong>
     * <p>IDENTIFICATION_CARD</p>
     */
    @NameInMap("sign_party_cert_type")
    @Validation(required = true)
    public String signPartyCertType;

    // 签署方证件号码
    /**
     * <strong>example:</strong>
     * <p>3308199612247856</p>
     */
    @NameInMap("sign_party_cert_num")
    @Validation(required = true)
    public String signPartyCertNum;

    // 签署结果（必填，FINISH,FAIL,REFUSE三者选一，分别表示签署完成、失败和拒签）
    /**
     * <strong>example:</strong>
     * <p>FINISH</p>
     */
    @NameInMap("sign_result")
    @Validation(required = true)
    public String signResult;

    // 签署失败或拒签原因（失败或拒签时必填）
    /**
     * <strong>example:</strong>
     * <p>审批未通过</p>
     */
    @NameInMap("sign_fail_reason")
    public String signFailReason;

    // 签署时间(13位毫秒时间戳)
    /**
     * <strong>example:</strong>
     * <p>2881999301656</p>
     */
    @NameInMap("sign_time")
    @Validation(required = true)
    public String signTime;

    public static AuthParty build(java.util.Map<String, ?> map) throws Exception {
        AuthParty self = new AuthParty();
        return TeaModel.build(map, self);
    }

    public AuthParty setSignPartyName(String signPartyName) {
        this.signPartyName = signPartyName;
        return this;
    }
    public String getSignPartyName() {
        return this.signPartyName;
    }

    public AuthParty setSignPartyCertType(String signPartyCertType) {
        this.signPartyCertType = signPartyCertType;
        return this;
    }
    public String getSignPartyCertType() {
        return this.signPartyCertType;
    }

    public AuthParty setSignPartyCertNum(String signPartyCertNum) {
        this.signPartyCertNum = signPartyCertNum;
        return this;
    }
    public String getSignPartyCertNum() {
        return this.signPartyCertNum;
    }

    public AuthParty setSignResult(String signResult) {
        this.signResult = signResult;
        return this;
    }
    public String getSignResult() {
        return this.signResult;
    }

    public AuthParty setSignFailReason(String signFailReason) {
        this.signFailReason = signFailReason;
        return this;
    }
    public String getSignFailReason() {
        return this.signFailReason;
    }

    public AuthParty setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

}
