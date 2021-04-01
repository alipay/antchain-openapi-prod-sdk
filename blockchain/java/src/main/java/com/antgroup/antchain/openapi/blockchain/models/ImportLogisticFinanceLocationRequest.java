// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ImportLogisticFinanceLocationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 描述信息
    @NameInMap("desc")
    public String desc;

    // 运单轨迹信息
    @NameInMap("location")
    @Validation(required = true)
    public java.util.List<LogisticLocation> location;

    // 所属平台分布式数字身份，缺省时为自己的分布式数字身份
    @NameInMap("platform_did")
    public String platformDid;

    // 运单id
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    public static ImportLogisticFinanceLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportLogisticFinanceLocationRequest self = new ImportLogisticFinanceLocationRequest();
        return TeaModel.build(map, self);
    }

    public ImportLogisticFinanceLocationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportLogisticFinanceLocationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportLogisticFinanceLocationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ImportLogisticFinanceLocationRequest setLocation(java.util.List<LogisticLocation> location) {
        this.location = location;
        return this;
    }
    public java.util.List<LogisticLocation> getLocation() {
        return this.location;
    }

    public ImportLogisticFinanceLocationRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public ImportLogisticFinanceLocationRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

}
