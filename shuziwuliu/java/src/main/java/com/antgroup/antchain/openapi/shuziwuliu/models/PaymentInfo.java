// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PaymentInfo extends TeaModel {
    // 收款账户名称
    /**
     * <strong>example:</strong>
     * <p>王大力</p>
     */
    @NameInMap("receiver_account_name")
    @Validation(required = true, maxLength = 200)
    public String receiverAccountName;

    // 收款账户，支付宝账号
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@sina.com">xxx@sina.com</a></p>
     */
    @NameInMap("receiver_account")
    @Validation(required = true, maxLength = 50)
    public String receiverAccount;

    // 收款账户类型 ,1-个人账号，0-公司账号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("receiver_account_type")
    @Validation(required = true, maxLength = 2)
    public String receiverAccountType;

    // 收款人证件号码 ，账户类型为个人时，非空
    /**
     * <strong>example:</strong>
     * <p>39991000299910029</p>
     */
    @NameInMap("receiver_certificate_no")
    @Validation(maxLength = 50)
    public String receiverCertificateNo;

    // 收款人证件类型，01-身份证，02-护照，03-军官证，04-港澳通行证，05-驾驶证，06-港澳回乡证或台胞证，07-临时身份证，99-其他
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("receiver_certificate_type")
    @Validation(required = true, maxLength = 2)
    public String receiverCertificateType;

    public static PaymentInfo build(java.util.Map<String, ?> map) throws Exception {
        PaymentInfo self = new PaymentInfo();
        return TeaModel.build(map, self);
    }

    public PaymentInfo setReceiverAccountName(String receiverAccountName) {
        this.receiverAccountName = receiverAccountName;
        return this;
    }
    public String getReceiverAccountName() {
        return this.receiverAccountName;
    }

    public PaymentInfo setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount;
        return this;
    }
    public String getReceiverAccount() {
        return this.receiverAccount;
    }

    public PaymentInfo setReceiverAccountType(String receiverAccountType) {
        this.receiverAccountType = receiverAccountType;
        return this;
    }
    public String getReceiverAccountType() {
        return this.receiverAccountType;
    }

    public PaymentInfo setReceiverCertificateNo(String receiverCertificateNo) {
        this.receiverCertificateNo = receiverCertificateNo;
        return this;
    }
    public String getReceiverCertificateNo() {
        return this.receiverCertificateNo;
    }

    public PaymentInfo setReceiverCertificateType(String receiverCertificateType) {
        this.receiverCertificateType = receiverCertificateType;
        return this;
    }
    public String getReceiverCertificateType() {
        return this.receiverCertificateType;
    }

}
