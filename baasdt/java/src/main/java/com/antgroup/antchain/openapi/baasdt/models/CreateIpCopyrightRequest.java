// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateIpCopyrightRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 【暂不支持中文】文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件oss地址
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 文件类型，IMAGE：图片文件；TEXT：文本文件；VIDEO：视屏；AUDIO：音频；ZIP：压缩包；FILE：其他文件
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 【需要真实的】版权方法人证件名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 【需要真实的】版权方法人证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 是否创建证书，此时默认选true
    @NameInMap("create_certificate")
    @Validation(required = true)
    public Boolean createCertificate;

    // 证书类型，公证处证书，值为NotaryOffice
    @NameInMap("certificate_type")
    public String certificateType;

    // 是否创建证据包，默认选否，如果没有创建公证书，不支持证据包
    @NameInMap("certificate_package")
    public Boolean certificatePackage;

    // 公证处ID，默认为LUJIANG，鹭江公证处
    @NameInMap("org_id")
    public String orgId;

    // 电话号码，生成公证处证书需要，格式范例，(86-573)2651630或(86)13738258505
    @NameInMap("phone_num")
    public String phoneNum;

    // 备注，最长不超过512字符
    @NameInMap("memo")
    public String memo;

    public static CreateIpCopyrightRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpCopyrightRequest self = new CreateIpCopyrightRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpCopyrightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIpCopyrightRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIpCopyrightRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public CreateIpCopyrightRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateIpCopyrightRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateIpCopyrightRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateIpCopyrightRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateIpCopyrightRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateIpCopyrightRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateIpCopyrightRequest setCreateCertificate(Boolean createCertificate) {
        this.createCertificate = createCertificate;
        return this;
    }
    public Boolean getCreateCertificate() {
        return this.createCertificate;
    }

    public CreateIpCopyrightRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public CreateIpCopyrightRequest setCertificatePackage(Boolean certificatePackage) {
        this.certificatePackage = certificatePackage;
        return this;
    }
    public Boolean getCertificatePackage() {
        return this.certificatePackage;
    }

    public CreateIpCopyrightRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateIpCopyrightRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CreateIpCopyrightRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
