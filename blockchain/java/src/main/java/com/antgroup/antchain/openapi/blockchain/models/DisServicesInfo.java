// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DisServicesInfo extends TeaModel {
    // did doc service扩展字段
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extesion")
    public String extesion;

    // did doc service id
    /**
     * <strong>example:</strong>
     * <p>didauth-1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 服务endpoint
    /**
     * <strong>example:</strong>
     * <p><a href="http://auth.mydid.agent.com">http://auth.mydid.agent.com</a></p>
     */
    @NameInMap("service_endpoint")
    @Validation(required = true)
    public String serviceEndpoint;

    // service type
    /**
     * <strong>example:</strong>
     * <p>DidAuthService</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // EXIST
    // CONFLICT
    // VALID
    // INVALID
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("desc")
    public String desc;

    public static DisServicesInfo build(java.util.Map<String, ?> map) throws Exception {
        DisServicesInfo self = new DisServicesInfo();
        return TeaModel.build(map, self);
    }

    public DisServicesInfo setExtesion(String extesion) {
        this.extesion = extesion;
        return this;
    }
    public String getExtesion() {
        return this.extesion;
    }

    public DisServicesInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DisServicesInfo setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    public DisServicesInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DisServicesInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
