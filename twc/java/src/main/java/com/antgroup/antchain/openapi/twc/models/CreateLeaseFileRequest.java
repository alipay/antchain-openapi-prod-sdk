// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
    @NameInMap("file_notary_type")
    public String fileNotaryType;

    // 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
    @NameInMap("notary_file")
    @Validation(required = true)
    public String notaryFile;

    // 存证文件名称
    @NameInMap("notary_name")
    @Validation(required = true)
    public String notaryName;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
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

    public static CreateLeaseFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseFileRequest self = new CreateLeaseFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseFileRequest setFileNotaryType(String fileNotaryType) {
        this.fileNotaryType = fileNotaryType;
        return this;
    }
    public String getFileNotaryType() {
        return this.fileNotaryType;
    }

    public CreateLeaseFileRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public CreateLeaseFileRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateLeaseFileRequest setNotaryFile(String notaryFile) {
        this.notaryFile = notaryFile;
        return this;
    }
    public String getNotaryFile() {
        return this.notaryFile;
    }

    public CreateLeaseFileRequest setNotaryName(String notaryName) {
        this.notaryName = notaryName;
        return this;
    }
    public String getNotaryName() {
        return this.notaryName;
    }

    public CreateLeaseFileRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateLeaseFileRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateLeaseFileRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
