// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class ApiInfoModel extends TeaModel {
    // api名称
    /**
     * <strong>example:</strong>
     * <p>demo.sss.ss.ss.bind</p>
     */
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // API所属网关技术产品码
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 是否是内部接口 0对外 1对内
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("internal")
    @Validation(required = true)
    public Long internal;

    // api版本号
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("api_version")
    @Validation(required = true)
    public String apiVersion;

    // api描述
    /**
     * <strong>example:</strong>
     * <p>测试用api</p>
     */
    @NameInMap("api_desc")
    @Validation(required = true)
    public String apiDesc;

    // api所属网关产品id
    /**
     * <strong>example:</strong>
     * <p>0000567567</p>
     */
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    public static ApiInfoModel build(java.util.Map<String, ?> map) throws Exception {
        ApiInfoModel self = new ApiInfoModel();
        return TeaModel.build(map, self);
    }

    public ApiInfoModel setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ApiInfoModel setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ApiInfoModel setInternal(Long internal) {
        this.internal = internal;
        return this;
    }
    public Long getInternal() {
        return this.internal;
    }

    public ApiInfoModel setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ApiInfoModel setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc;
        return this;
    }
    public String getApiDesc() {
        return this.apiDesc;
    }

    public ApiInfoModel setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
