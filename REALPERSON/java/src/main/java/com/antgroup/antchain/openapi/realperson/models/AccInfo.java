// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class AccInfo extends TeaModel {
    // 身份证号
    /**
     * <strong>example:</strong>
     * <p>111222190002309999</p>
     */
    @NameInMap("cert_no")
    public String certNo;

    // 持卡人姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("cert_name")
    public String certName;

    // 银行卡号
    /**
     * <strong>example:</strong>
     * <p>7881620854713</p>
     */
    @NameInMap("bank_card")
    public String bankCard;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>13900001234</p>
     */
    @NameInMap("mobile")
    public String mobile;

    // 银行卡类型，
    // 0：借记卡
    // 1：信用卡
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("card_type")
    public String cardType;

    public static AccInfo build(java.util.Map<String, ?> map) throws Exception {
        AccInfo self = new AccInfo();
        return TeaModel.build(map, self);
    }

    public AccInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public AccInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AccInfo setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }
    public String getBankCard() {
        return this.bankCard;
    }

    public AccInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public AccInfo setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

}
