// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateInternalFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证事务id
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
    @NameInMap("notary_file")
    @Validation(required = true)
    public String notaryFile;

    // 存证文件名称
    @NameInMap("notary_name")
    @Validation(required = true)
    public String notaryName;

    // 文件存证模式，目前仅支持 FILE_RAW(文件原文内容) 和 FILE_HASH(文件hash)，建议填写，不填默认是FILE_RAW
    @NameInMap("file_notary_type")
    public String fileNotaryType;

    // 哈希算法，当 fileNotaryType 为 FILE_HASH 时填写，目前仅支持 SHA256
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    // 存证地点信息(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 代理客户存证时，实际用户的租户ID
    @NameInMap("real_tenant")
    public String realTenant;

    // 授权码
    @NameInMap("auth_code")
    public String authCode;

    // 授权码对应产品码
    @NameInMap("product")
    public String product;

    public static CreateInternalFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInternalFileRequest self = new CreateInternalFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateInternalFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInternalFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInternalFileRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateInternalFileRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateInternalFileRequest setNotaryFile(String notaryFile) {
        this.notaryFile = notaryFile;
        return this;
    }
    public String getNotaryFile() {
        return this.notaryFile;
    }

    public CreateInternalFileRequest setNotaryName(String notaryName) {
        this.notaryName = notaryName;
        return this;
    }
    public String getNotaryName() {
        return this.notaryName;
    }

    public CreateInternalFileRequest setFileNotaryType(String fileNotaryType) {
        this.fileNotaryType = fileNotaryType;
        return this;
    }
    public String getFileNotaryType() {
        return this.fileNotaryType;
    }

    public CreateInternalFileRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public CreateInternalFileRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

    public CreateInternalFileRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateInternalFileRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateInternalFileRequest setRealTenant(String realTenant) {
        this.realTenant = realTenant;
        return this;
    }
    public String getRealTenant() {
        return this.realTenant;
    }

    public CreateInternalFileRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CreateInternalFileRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
