// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ImportWaybillLocationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 描述信息
    // 
    @NameInMap("desc")
    public String desc;

    // 运单轨迹信息
    @NameInMap("location")
    @Validation(required = true)
    public java.util.List<LogisticLocation> location;

    // 所属平台分布式数字身份，缺省时为自己的分布式数字身份
    // 
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 运单id
    // 
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    public static ImportWaybillLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportWaybillLocationRequest self = new ImportWaybillLocationRequest();
        return TeaModel.build(map, self);
    }

    public ImportWaybillLocationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportWaybillLocationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportWaybillLocationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ImportWaybillLocationRequest setLocation(java.util.List<LogisticLocation> location) {
        this.location = location;
        return this;
    }
    public java.util.List<LogisticLocation> getLocation() {
        return this.location;
    }

    public ImportWaybillLocationRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public ImportWaybillLocationRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

}
