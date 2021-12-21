// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AddRegisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件oss id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 是否自动创建公证书,默认否
    @NameInMap("create_certificate")
    public Boolean createCertificate;

    // 证书类型
    @NameInMap("certificate_type")
    public String certificateType;

    // 是否创建证据包，默认否
    @NameInMap("create_package")
    public Boolean createPackage;

    // 公证处id
    @NameInMap("org_id")
    public String orgId;

    // 文件名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 128)
    public String name;

    // 文件类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 备注
    @NameInMap("memo")
    @Validation(maxLength = 512)
    public String memo;

    // 证件名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 电话号码
    @NameInMap("phone_num")
    public String phoneNum;

    // 幂等
    @NameInMap("client_token")
    public String clientToken;

    // 代理信息
    @NameInMap("proxy_info")
    public ProxyData proxyInfo;

    // 同步账号信息
    @NameInMap("sync_info")
    public AccountData syncInfo;

    public static AddRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRegisterRequest self = new AddRegisterRequest();
        return TeaModel.build(map, self);
    }

    public AddRegisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddRegisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddRegisterRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddRegisterRequest setCreateCertificate(Boolean createCertificate) {
        this.createCertificate = createCertificate;
        return this;
    }
    public Boolean getCreateCertificate() {
        return this.createCertificate;
    }

    public AddRegisterRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public AddRegisterRequest setCreatePackage(Boolean createPackage) {
        this.createPackage = createPackage;
        return this;
    }
    public Boolean getCreatePackage() {
        return this.createPackage;
    }

    public AddRegisterRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public AddRegisterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddRegisterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddRegisterRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public AddRegisterRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AddRegisterRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public AddRegisterRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public AddRegisterRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public AddRegisterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddRegisterRequest setProxyInfo(ProxyData proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public ProxyData getProxyInfo() {
        return this.proxyInfo;
    }

    public AddRegisterRequest setSyncInfo(AccountData syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
    public AccountData getSyncInfo() {
        return this.syncInfo;
    }

}
