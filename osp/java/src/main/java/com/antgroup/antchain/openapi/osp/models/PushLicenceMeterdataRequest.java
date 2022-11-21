// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class PushLicenceMeterdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品Code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 商品code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 规格
    @NameInMap("spec_code")
    public String specCode;

    // 实例ID, 如果是SOFA产品，则表示SOFA的实例ID。
    // 如果不传则认为是当前环境的总使用量；
    // 如果传了则认为是特定instanceId内的使用量
    @NameInMap("instance_id")
    public String instanceId;

    // 用户id 
    @NameInMap("user_id")
    public String userId;

    // 原始计量数据，KV结构。
    // 每一对KV 对应一个计量项及其值；Key 为计量项Code，value为其具体的值。比如，某产品有TPS 和节点数两个计量项。
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 用量发生的时间
    @NameInMap("gmt_meter")
    @Validation(required = true)
    public String gmtMeter;

    public static PushLicenceMeterdataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushLicenceMeterdataRequest self = new PushLicenceMeterdataRequest();
        return TeaModel.build(map, self);
    }

    public PushLicenceMeterdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushLicenceMeterdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushLicenceMeterdataRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PushLicenceMeterdataRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public PushLicenceMeterdataRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public PushLicenceMeterdataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushLicenceMeterdataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PushLicenceMeterdataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushLicenceMeterdataRequest setGmtMeter(String gmtMeter) {
        this.gmtMeter = gmtMeter;
        return this;
    }
    public String getGmtMeter() {
        return this.gmtMeter;
    }

}
