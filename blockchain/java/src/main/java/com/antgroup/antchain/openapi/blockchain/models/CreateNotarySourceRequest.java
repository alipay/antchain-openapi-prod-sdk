// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateNotarySourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 原文文件描述
    @NameInMap("source_desc")
    @Validation(required = true)
    public String sourceDesc;

    // base64加密后的原文文件内容
    @NameInMap("source_file")
    @Validation(required = true)
    public String sourceFile;

    // 存证原文名称
    @NameInMap("source_name")
    @Validation(required = true)
    public String sourceName;

    // 存证事务ID
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    public static CreateNotarySourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotarySourceRequest self = new CreateNotarySourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotarySourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNotarySourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateNotarySourceRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateNotarySourceRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateNotarySourceRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateNotarySourceRequest setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
        return this;
    }
    public String getSourceDesc() {
        return this.sourceDesc;
    }

    public CreateNotarySourceRequest setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
        return this;
    }
    public String getSourceFile() {
        return this.sourceFile;
    }

    public CreateNotarySourceRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public CreateNotarySourceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateNotarySourceRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

}
