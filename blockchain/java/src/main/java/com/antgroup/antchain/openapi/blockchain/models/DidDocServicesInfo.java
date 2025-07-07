// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidDocServicesInfo extends TeaModel {
    // 服务的扩展字段
    /**
     * <strong>example:</strong>
     * <p>json string</p>
     */
    @NameInMap("extension")
    public String extension;

    // 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
    // DidAuthService， 有且只能有一个，并且id必须为didauth-1；
    // VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
    /**
     * <strong>example:</strong>
     * <p>service-id1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 服务的可访问地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://example.com">http://example.com</a></p>
     */
    @NameInMap("service_endpoint")
    @Validation(required = true)
    public String serviceEndpoint;

    // 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
    /**
     * <strong>example:</strong>
     * <p>KYBServiceType</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static DidDocServicesInfo build(java.util.Map<String, ?> map) throws Exception {
        DidDocServicesInfo self = new DidDocServicesInfo();
        return TeaModel.build(map, self);
    }

    public DidDocServicesInfo setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public DidDocServicesInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DidDocServicesInfo setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    public DidDocServicesInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
