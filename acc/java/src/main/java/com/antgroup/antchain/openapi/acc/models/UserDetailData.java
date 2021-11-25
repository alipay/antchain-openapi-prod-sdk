// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class UserDetailData extends TeaModel {
    // 账户Id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 统一身份id
    // 
    // 
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 账户名
    // 
    // 
    @NameInMap("login_id")
    @Validation(required = true)
    public String loginId;

    // 用户姓名
    // 
    // 
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户类型
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 账户类型
    @NameInMap("account_type")
    @Validation(required = true)
    public String accountType;

    // 个人认证状态
    @NameInMap("cert_status")
    @Validation(required = true)
    public String certStatus;

    // 邮箱
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 手机号
    @NameInMap("telphone")
    @Validation(required = true)
    public String telphone;

    // 个人证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件号码	
    // 
    @NameInMap("cert_num")
    @Validation(required = true)
    public String certNum;

    // cert_file_front_id
    @NameInMap("cert_file_front_id")
    @Validation(required = true)
    public String certFileFrontId;

    // 个人证件正面类型
    @NameInMap("cert_file_front_type")
    @Validation(required = true)
    public String certFileFrontType;

    // 个人证件反面图片，osskeyId
    // 
    // 
    @NameInMap("cert_file_reverse_id")
    @Validation(required = true)
    public String certFileReverseId;

    // 个人证件反面类型。JPG
    // 
    // 
    @NameInMap("cert_file_reverse_type")
    @Validation(required = true)
    public String certFileReverseType;

    // 关联企业信息
    // 
    // 
    @NameInMap("ref_firms")
    @Validation(required = true)
    public java.util.List<RefFirm> refFirms;

    // 是否有印章
    @NameInMap("seal_flag")
    public Boolean sealFlag;

    public static UserDetailData build(java.util.Map<String, ?> map) throws Exception {
        UserDetailData self = new UserDetailData();
        return TeaModel.build(map, self);
    }

    public UserDetailData setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public UserDetailData setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UserDetailData setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public UserDetailData setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UserDetailData setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public UserDetailData setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public UserDetailData setCertStatus(String certStatus) {
        this.certStatus = certStatus;
        return this;
    }
    public String getCertStatus() {
        return this.certStatus;
    }

    public UserDetailData setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UserDetailData setTelphone(String telphone) {
        this.telphone = telphone;
        return this;
    }
    public String getTelphone() {
        return this.telphone;
    }

    public UserDetailData setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public UserDetailData setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public UserDetailData setCertFileFrontId(String certFileFrontId) {
        this.certFileFrontId = certFileFrontId;
        return this;
    }
    public String getCertFileFrontId() {
        return this.certFileFrontId;
    }

    public UserDetailData setCertFileFrontType(String certFileFrontType) {
        this.certFileFrontType = certFileFrontType;
        return this;
    }
    public String getCertFileFrontType() {
        return this.certFileFrontType;
    }

    public UserDetailData setCertFileReverseId(String certFileReverseId) {
        this.certFileReverseId = certFileReverseId;
        return this;
    }
    public String getCertFileReverseId() {
        return this.certFileReverseId;
    }

    public UserDetailData setCertFileReverseType(String certFileReverseType) {
        this.certFileReverseType = certFileReverseType;
        return this;
    }
    public String getCertFileReverseType() {
        return this.certFileReverseType;
    }

    public UserDetailData setRefFirms(java.util.List<RefFirm> refFirms) {
        this.refFirms = refFirms;
        return this;
    }
    public java.util.List<RefFirm> getRefFirms() {
        return this.refFirms;
    }

    public UserDetailData setSealFlag(Boolean sealFlag) {
        this.sealFlag = sealFlag;
        return this;
    }
    public Boolean getSealFlag() {
        return this.sealFlag;
    }

}
