// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetDomesticTrademarklogoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集ID
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 商标注册证号
    @NameInMap("tm_reg_num")
    @Validation(required = true)
    public String tmRegNum;

    // 商标类别
    @NameInMap("tm_form_type")
    @Validation(required = true)
    public String tmFormType;

    public static GetDomesticTrademarklogoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomesticTrademarklogoRequest self = new GetDomesticTrademarklogoRequest();
        return TeaModel.build(map, self);
    }

    public GetDomesticTrademarklogoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDomesticTrademarklogoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDomesticTrademarklogoRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public GetDomesticTrademarklogoRequest setTmRegNum(String tmRegNum) {
        this.tmRegNum = tmRegNum;
        return this;
    }
    public String getTmRegNum() {
        return this.tmRegNum;
    }

    public GetDomesticTrademarklogoRequest setTmFormType(String tmFormType) {
        this.tmFormType = tmFormType;
        return this;
    }
    public String getTmFormType() {
        return this.tmFormType;
    }

}
