// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateNotaryFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // base64加密后的存证文件内容
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
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    public static CreateNotaryFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotaryFileRequest self = new CreateNotaryFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotaryFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNotaryFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateNotaryFileRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateNotaryFileRequest setNotaryFile(String notaryFile) {
        this.notaryFile = notaryFile;
        return this;
    }
    public String getNotaryFile() {
        return this.notaryFile;
    }

    public CreateNotaryFileRequest setNotaryName(String notaryName) {
        this.notaryName = notaryName;
        return this;
    }
    public String getNotaryName() {
        return this.notaryName;
    }

    public CreateNotaryFileRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateNotaryFileRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateNotaryFileRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateNotaryFileRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

}
