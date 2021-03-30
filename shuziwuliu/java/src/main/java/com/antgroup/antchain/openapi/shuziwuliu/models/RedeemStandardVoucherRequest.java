// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class RedeemStandardVoucherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据标识
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 所属账户
    @NameInMap("voucher_owner")
    @Validation(required = true)
    public String voucherOwner;

    // 余额
    @NameInMap("balance_sender_transfer")
    @Validation(required = true)
    public String balanceSenderTransfer;

    // 余额
    @NameInMap("balance_proof")
    @Validation(required = true)
    public String balanceProof;

    // 余额
    @NameInMap("balance_receiver_account")
    @Validation(required = true)
    public String balanceReceiverAccount;

    // 余额
    @NameInMap("balance_receiver_business_code")
    @Validation(required = true)
    public String balanceReceiverBusinessCode;

    // 余额
    @NameInMap("balance_receiver_transfer")
    @Validation(required = true)
    public String balanceReceiverTransfer;

    public static RedeemStandardVoucherRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeemStandardVoucherRequest self = new RedeemStandardVoucherRequest();
        return TeaModel.build(map, self);
    }

    public RedeemStandardVoucherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RedeemStandardVoucherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RedeemStandardVoucherRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public RedeemStandardVoucherRequest setVoucherOwner(String voucherOwner) {
        this.voucherOwner = voucherOwner;
        return this;
    }
    public String getVoucherOwner() {
        return this.voucherOwner;
    }

    public RedeemStandardVoucherRequest setBalanceSenderTransfer(String balanceSenderTransfer) {
        this.balanceSenderTransfer = balanceSenderTransfer;
        return this;
    }
    public String getBalanceSenderTransfer() {
        return this.balanceSenderTransfer;
    }

    public RedeemStandardVoucherRequest setBalanceProof(String balanceProof) {
        this.balanceProof = balanceProof;
        return this;
    }
    public String getBalanceProof() {
        return this.balanceProof;
    }

    public RedeemStandardVoucherRequest setBalanceReceiverAccount(String balanceReceiverAccount) {
        this.balanceReceiverAccount = balanceReceiverAccount;
        return this;
    }
    public String getBalanceReceiverAccount() {
        return this.balanceReceiverAccount;
    }

    public RedeemStandardVoucherRequest setBalanceReceiverBusinessCode(String balanceReceiverBusinessCode) {
        this.balanceReceiverBusinessCode = balanceReceiverBusinessCode;
        return this;
    }
    public String getBalanceReceiverBusinessCode() {
        return this.balanceReceiverBusinessCode;
    }

    public RedeemStandardVoucherRequest setBalanceReceiverTransfer(String balanceReceiverTransfer) {
        this.balanceReceiverTransfer = balanceReceiverTransfer;
        return this;
    }
    public String getBalanceReceiverTransfer() {
        return this.balanceReceiverTransfer;
    }

}
