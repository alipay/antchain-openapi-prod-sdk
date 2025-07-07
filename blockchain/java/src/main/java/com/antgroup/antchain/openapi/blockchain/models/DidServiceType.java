// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidServiceType extends TeaModel {
    // 枚举类型，描述访问服务的方式
    /**
     * <strong>example:</strong>
     * <p>http,https,openapi,ftp,other...</p>
     */
    @NameInMap("access_mode")
    public String accessMode;

    // 对服务的文字描述，<1000个字符
    /**
     * <strong>example:</strong>
     * <p>对服务描述</p>
     */
    @NameInMap("description")
    @Validation(maxLength = 1000)
    public String description;

    // 服务类型创建者did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxx</p>
     */
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // { "item1":"", "item2":"",...
    /**
     * <strong>example:</strong>
     * <p>json描述服务入参</p>
     */
    @NameInMap("service_input")
    public String serviceInput;

    // 返回值类型描述，json形式
    /**
     * <strong>example:</strong>
     * <p>{ &quot;item1&quot;:&quot;&quot; &quot;item2&quot;:&quot;&quot; ... }</p>
     */
    @NameInMap("service_output")
    public String serviceOutput;

    // 自定义服务类型，字符数16～32个
    /**
     * <strong>example:</strong>
     * <p>KYBServiceType</p>
     */
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    public static DidServiceType build(java.util.Map<String, ?> map) throws Exception {
        DidServiceType self = new DidServiceType();
        return TeaModel.build(map, self);
    }

    public DidServiceType setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public DidServiceType setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DidServiceType setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public DidServiceType setServiceInput(String serviceInput) {
        this.serviceInput = serviceInput;
        return this;
    }
    public String getServiceInput() {
        return this.serviceInput;
    }

    public DidServiceType setServiceOutput(String serviceOutput) {
        this.serviceOutput = serviceOutput;
        return this;
    }
    public String getServiceOutput() {
        return this.serviceOutput;
    }

    public DidServiceType setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
