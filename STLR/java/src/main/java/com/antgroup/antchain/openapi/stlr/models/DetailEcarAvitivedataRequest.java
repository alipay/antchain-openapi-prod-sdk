// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailEcarAvitivedataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 排放数据录入明细编码
    @NameInMap("emission_data_entry_item_no")
    public String emissionDataEntryItemNo;

    // 企业业务单号
    @NameInMap("enterprise_biz_no")
    public String enterpriseBizNo;

    public static DetailEcarAvitivedataRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailEcarAvitivedataRequest self = new DetailEcarAvitivedataRequest();
        return TeaModel.build(map, self);
    }

    public DetailEcarAvitivedataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailEcarAvitivedataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailEcarAvitivedataRequest setEmissionDataEntryItemNo(String emissionDataEntryItemNo) {
        this.emissionDataEntryItemNo = emissionDataEntryItemNo;
        return this;
    }
    public String getEmissionDataEntryItemNo() {
        return this.emissionDataEntryItemNo;
    }

    public DetailEcarAvitivedataRequest setEnterpriseBizNo(String enterpriseBizNo) {
        this.enterpriseBizNo = enterpriseBizNo;
        return this;
    }
    public String getEnterpriseBizNo() {
        return this.enterpriseBizNo;
    }

}
