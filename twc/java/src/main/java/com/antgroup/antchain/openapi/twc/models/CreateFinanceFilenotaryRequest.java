// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateFinanceFilenotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 反欺诈需要的证件号码
    @NameInMap("cert_no")
    public String certNo;

    // 创建日期，时间戳类型，单位毫秒
    @NameInMap("created_date")
    @Validation(required = true)
    public Long createdDate;

    // 存证文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件存证类型，支持小于 1M 源文件或者文件哈希
    @NameInMap("file_notary_type")
    @Validation(required = true)
    public String fileNotaryType;

    // 文件大小，单位 Bytes
    @NameInMap("file_size")
    public Long fileSize;

    // 文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 文件地址
    @NameInMap("file_url")
    public String fileUrl;

    // 哈希算法
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 位置信息
    @NameInMap("location")
    public Location location;

    // 反欺诈查询需要的手机号
    @NameInMap("mobile")
    public String mobile;

    // 文件存证内容
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 存证阶段
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 扩展属性，用户可自行维护
    @NameInMap("properties")
    public String properties;

    // 存证事务ID
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 是否使用可信时间戳
    @NameInMap("tsr")
    public Boolean tsr;

    // 反欺诈查询需要的证件上的姓名
    @NameInMap("user_name")
    public String userName;

    // 本次请求的唯一ID
    @NameInMap("third_message_id")
    public String thirdMessageId;

    public static CreateFinanceFilenotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFinanceFilenotaryRequest self = new CreateFinanceFilenotaryRequest();
        return TeaModel.build(map, self);
    }

    public CreateFinanceFilenotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFinanceFilenotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateFinanceFilenotaryRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateFinanceFilenotaryRequest setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    public Long getCreatedDate() {
        return this.createdDate;
    }

    public CreateFinanceFilenotaryRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateFinanceFilenotaryRequest setFileNotaryType(String fileNotaryType) {
        this.fileNotaryType = fileNotaryType;
        return this;
    }
    public String getFileNotaryType() {
        return this.fileNotaryType;
    }

    public CreateFinanceFilenotaryRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public CreateFinanceFilenotaryRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateFinanceFilenotaryRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateFinanceFilenotaryRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public CreateFinanceFilenotaryRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateFinanceFilenotaryRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateFinanceFilenotaryRequest setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public CreateFinanceFilenotaryRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateFinanceFilenotaryRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateFinanceFilenotaryRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateFinanceFilenotaryRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

    public CreateFinanceFilenotaryRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateFinanceFilenotaryRequest setThirdMessageId(String thirdMessageId) {
        this.thirdMessageId = thirdMessageId;
        return this;
    }
    public String getThirdMessageId() {
        return this.thirdMessageId;
    }

}
