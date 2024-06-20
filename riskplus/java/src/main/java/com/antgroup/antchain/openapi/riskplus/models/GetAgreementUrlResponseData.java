// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetAgreementUrlResponseData extends TeaModel {
    // 协议标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 协议地址
    @NameInMap("agreement_url")
    public String agreementUrl;

    // 协议文件Base64
    @NameInMap("file_base64")
    public String fileBase64;

    // 协议图片文件base64集合
    @NameInMap("pic_file_base64_list")
    public java.util.List<String> picFileBase64List;

    // 图片文件oss集合
    @NameInMap("pic_oss_path_list")
    public java.util.List<String> picOssPathList;

    // 机构名称
    @NameInMap("organization_name")
    @Validation(required = true)
    public String organizationName;

    // 协议类型-code
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 协议类型-名称
    @NameInMap("file_type_name")
    @Validation(required = true)
    public String fileTypeName;

    public static GetAgreementUrlResponseData build(java.util.Map<String, ?> map) throws Exception {
        GetAgreementUrlResponseData self = new GetAgreementUrlResponseData();
        return TeaModel.build(map, self);
    }

    public GetAgreementUrlResponseData setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetAgreementUrlResponseData setAgreementUrl(String agreementUrl) {
        this.agreementUrl = agreementUrl;
        return this;
    }
    public String getAgreementUrl() {
        return this.agreementUrl;
    }

    public GetAgreementUrlResponseData setFileBase64(String fileBase64) {
        this.fileBase64 = fileBase64;
        return this;
    }
    public String getFileBase64() {
        return this.fileBase64;
    }

    public GetAgreementUrlResponseData setPicFileBase64List(java.util.List<String> picFileBase64List) {
        this.picFileBase64List = picFileBase64List;
        return this;
    }
    public java.util.List<String> getPicFileBase64List() {
        return this.picFileBase64List;
    }

    public GetAgreementUrlResponseData setPicOssPathList(java.util.List<String> picOssPathList) {
        this.picOssPathList = picOssPathList;
        return this;
    }
    public java.util.List<String> getPicOssPathList() {
        return this.picOssPathList;
    }

    public GetAgreementUrlResponseData setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public GetAgreementUrlResponseData setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public GetAgreementUrlResponseData setFileTypeName(String fileTypeName) {
        this.fileTypeName = fileTypeName;
        return this;
    }
    public String getFileTypeName() {
        return this.fileTypeName;
    }

}
