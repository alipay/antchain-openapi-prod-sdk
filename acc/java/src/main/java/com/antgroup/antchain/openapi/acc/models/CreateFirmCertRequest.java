// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateFirmCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 云蚂侧企业id
    @NameInMap("firm_id")
    @Validation(required = true)
    public Long firmId;

    // 企业名称
    @NameInMap("firm_name")
    @Validation(required = true)
    public String firmName;

    // 企业类型
    @NameInMap("firm_type")
    public String firmType;

    // 行业类型
    @NameInMap("industry_type")
    @Validation(required = true)
    public String industryType;

    // 企业地址省份
    @NameInMap("firm_address")
    @Validation(required = true)
    public String firmAddress;

    // 企业营业执照注册号
    @NameInMap("cert_reg_no")
    @Validation(required = true)
    public String certRegNo;

    // 营业执照图片id，应用侧fileId
    @NameInMap("cert_reg_file")
    @Validation(required = true)
    public Long certRegFile;

    // 营业执照图片类型(JPEG,JPG)
    @NameInMap("cert_reg_file_type")
    @Validation(required = true)
    public String certRegFileType;

    // 法定代表人证件类型
    @NameInMap("lp_cert_type")
    @Validation(required = true)
    public String lpCertType;

    // 法人证件号码
    @NameInMap("lp_cert_no")
    @Validation(required = true)
    public String lpCertNo;

    // 法人姓名
    @NameInMap("lp_name")
    @Validation(required = true)
    public String lpName;

    // 法人身份证正面图片id，应用侧FileId
    @NameInMap("lp_cert_file_front")
    @Validation(required = true)
    public Long lpCertFileFront;

    // 法人身份证正面图片文件类型(JPEG,JPG)
    @NameInMap("lp_cert_file_front_type")
    @Validation(required = true)
    public String lpCertFileFrontType;

    // 法人身份证反面图片id，应用侧FileId
    @NameInMap("lp_cert_file_reverse")
    @Validation(required = true)
    public Long lpCertFileReverse;

    // 法人身份证反面图片id，应用侧FileId
    @NameInMap("lp_cert_file_reverse_type")
    @Validation(required = true)
    public String lpCertFileReverseType;

    public static CreateFirmCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFirmCertRequest self = new CreateFirmCertRequest();
        return TeaModel.build(map, self);
    }

    public CreateFirmCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFirmCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateFirmCertRequest setFirmId(Long firmId) {
        this.firmId = firmId;
        return this;
    }
    public Long getFirmId() {
        return this.firmId;
    }

    public CreateFirmCertRequest setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public CreateFirmCertRequest setFirmType(String firmType) {
        this.firmType = firmType;
        return this;
    }
    public String getFirmType() {
        return this.firmType;
    }

    public CreateFirmCertRequest setIndustryType(String industryType) {
        this.industryType = industryType;
        return this;
    }
    public String getIndustryType() {
        return this.industryType;
    }

    public CreateFirmCertRequest setFirmAddress(String firmAddress) {
        this.firmAddress = firmAddress;
        return this;
    }
    public String getFirmAddress() {
        return this.firmAddress;
    }

    public CreateFirmCertRequest setCertRegNo(String certRegNo) {
        this.certRegNo = certRegNo;
        return this;
    }
    public String getCertRegNo() {
        return this.certRegNo;
    }

    public CreateFirmCertRequest setCertRegFile(Long certRegFile) {
        this.certRegFile = certRegFile;
        return this;
    }
    public Long getCertRegFile() {
        return this.certRegFile;
    }

    public CreateFirmCertRequest setCertRegFileType(String certRegFileType) {
        this.certRegFileType = certRegFileType;
        return this;
    }
    public String getCertRegFileType() {
        return this.certRegFileType;
    }

    public CreateFirmCertRequest setLpCertType(String lpCertType) {
        this.lpCertType = lpCertType;
        return this;
    }
    public String getLpCertType() {
        return this.lpCertType;
    }

    public CreateFirmCertRequest setLpCertNo(String lpCertNo) {
        this.lpCertNo = lpCertNo;
        return this;
    }
    public String getLpCertNo() {
        return this.lpCertNo;
    }

    public CreateFirmCertRequest setLpName(String lpName) {
        this.lpName = lpName;
        return this;
    }
    public String getLpName() {
        return this.lpName;
    }

    public CreateFirmCertRequest setLpCertFileFront(Long lpCertFileFront) {
        this.lpCertFileFront = lpCertFileFront;
        return this;
    }
    public Long getLpCertFileFront() {
        return this.lpCertFileFront;
    }

    public CreateFirmCertRequest setLpCertFileFrontType(String lpCertFileFrontType) {
        this.lpCertFileFrontType = lpCertFileFrontType;
        return this;
    }
    public String getLpCertFileFrontType() {
        return this.lpCertFileFrontType;
    }

    public CreateFirmCertRequest setLpCertFileReverse(Long lpCertFileReverse) {
        this.lpCertFileReverse = lpCertFileReverse;
        return this;
    }
    public Long getLpCertFileReverse() {
        return this.lpCertFileReverse;
    }

    public CreateFirmCertRequest setLpCertFileReverseType(String lpCertFileReverseType) {
        this.lpCertFileReverseType = lpCertFileReverseType;
        return this;
    }
    public String getLpCertFileReverseType() {
        return this.lpCertFileReverseType;
    }

}
