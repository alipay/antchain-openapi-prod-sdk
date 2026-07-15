// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclUserInfo extends TeaModel {
    // 用户账号ID
    // 长度不超过64位，本期只支持支付宝userid
    /**
     * <strong>example:</strong>
     * <p>2088xxxxx</p>
     */
    @NameInMap("user_account_id")
    @Validation(required = true, maxLength = 64)
    public String userAccountId;

    // 用户账号平台类型
    // 1.支付宝：ALIPAY
    // 本期暂时只支持支付宝
    /**
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
    @NameInMap("user_account_type")
    @Validation(required = true, maxLength = 16)
    public String userAccountType;

    // 承租人/企业姓名,长度不超过32位
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("user_cert_name")
    @Validation(required = true, maxLength = 128)
    public String userCertName;

    // 承租人/企业证件号,长度不超过64位
    /**
     * <strong>example:</strong>
     * <p>5002331982122xx233</p>
     */
    @NameInMap("user_cert_no")
    @Validation(required = true, maxLength = 64)
    public String userCertNo;

    // 承租人/企业证件类型:
    // 1.身份证：IDENTITY_CARD
    // 本期暂时只支持个人身份证
    /**
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("user_cert_type")
    @Validation(required = true, maxLength = 32)
    public String userCertType;

    // 承租人/企业手机号,长度不超过32位
    /**
     * <strong>example:</strong>
     * <p>172312xx231</p>
     */
    @NameInMap("user_phone_number")
    @Validation(required = true, maxLength = 32)
    public String userPhoneNumber;

    // 承租人身份证人像面/企业营业执照 先调用文件上传的接口,这里填上传后返回的fileid
    /**
     * <strong>example:</strong>
     * <p>24343.jpg</p>
     */
    @NameInMap("user_cert_front_file_id")
    @Validation(required = true, maxLength = 64)
    public String userCertFrontFileId;

    // 承租人身份证国徽面 先调用文件上传的接口,这里填上传后返回的fileid
    /**
     * <strong>example:</strong>
     * <p>342323.jpg</p>
     */
    @NameInMap("user_cert_back_file_id")
    @Validation(maxLength = 64)
    public String userCertBackFileId;

    public static BclUserInfo build(java.util.Map<String, ?> map) throws Exception {
        BclUserInfo self = new BclUserInfo();
        return TeaModel.build(map, self);
    }

    public BclUserInfo setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }
    public String getUserAccountId() {
        return this.userAccountId;
    }

    public BclUserInfo setUserAccountType(String userAccountType) {
        this.userAccountType = userAccountType;
        return this;
    }
    public String getUserAccountType() {
        return this.userAccountType;
    }

    public BclUserInfo setUserCertName(String userCertName) {
        this.userCertName = userCertName;
        return this;
    }
    public String getUserCertName() {
        return this.userCertName;
    }

    public BclUserInfo setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

    public BclUserInfo setUserCertType(String userCertType) {
        this.userCertType = userCertType;
        return this;
    }
    public String getUserCertType() {
        return this.userCertType;
    }

    public BclUserInfo setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public BclUserInfo setUserCertFrontFileId(String userCertFrontFileId) {
        this.userCertFrontFileId = userCertFrontFileId;
        return this;
    }
    public String getUserCertFrontFileId() {
        return this.userCertFrontFileId;
    }

    public BclUserInfo setUserCertBackFileId(String userCertBackFileId) {
        this.userCertBackFileId = userCertBackFileId;
        return this;
    }
    public String getUserCertBackFileId() {
        return this.userCertBackFileId;
    }

}
