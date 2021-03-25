// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLargefileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传至中枢文件扩展服务后得到的文件ID
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 存证事务ID
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

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

    public static CreateLargefileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLargefileRequest self = new CreateLargefileRequest();
        return TeaModel.build(map, self);
    }

    public CreateLargefileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLargefileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLargefileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateLargefileRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateLargefileRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateLargefileRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

    public CreateLargefileRequest setNotaryName(String notaryName) {
        this.notaryName = notaryName;
        return this;
    }
    public String getNotaryName() {
        return this.notaryName;
    }

    public CreateLargefileRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateLargefileRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
