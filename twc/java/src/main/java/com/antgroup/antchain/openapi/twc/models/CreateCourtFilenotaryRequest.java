// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateCourtFilenotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对应的法院编号
    @NameInMap("agency_code")
    public String agencyCode;

    // 对应的法院应用ID	
    @NameInMap("application_code")
    public String applicationCode;

    // 业务类型标识
    @NameInMap("business_type")
    public String businessType;

    // 数据类型标识
    @NameInMap("data_type")
    public String dataType;

    // 文件哈希
    @NameInMap("file_hash")
    @Validation(required = true)
    public String fileHash;

    // 文件名
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 哈希算法，目前仅支持SHA256
    @NameInMap("hash_algorithm")
    @Validation(required = true)
    public String hashAlgorithm;

    // 地理位置信息
    @NameInMap("location")
    public Location location;

    // 存证阶段
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 存证事务ID
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 是否使用可信时间戳
    @NameInMap("tsr")
    public Boolean tsr;

    public static CreateCourtFilenotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCourtFilenotaryRequest self = new CreateCourtFilenotaryRequest();
        return TeaModel.build(map, self);
    }

    public CreateCourtFilenotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCourtFilenotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCourtFilenotaryRequest setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
        return this;
    }
    public String getAgencyCode() {
        return this.agencyCode;
    }

    public CreateCourtFilenotaryRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public CreateCourtFilenotaryRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateCourtFilenotaryRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateCourtFilenotaryRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public CreateCourtFilenotaryRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateCourtFilenotaryRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public CreateCourtFilenotaryRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateCourtFilenotaryRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateCourtFilenotaryRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateCourtFilenotaryRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateCourtFilenotaryRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

}
