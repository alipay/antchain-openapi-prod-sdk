// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class AddCaruserUsersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务的id
    @NameInMap("business_id")
    @Validation(required = true)
    public java.util.List<String> businessId;

    // 数据的唯一code
    @NameInMap("data_uniqlo_code")
    @Validation(required = true)
    public String dataUniqloCode;

    // 批次数据编号
    @NameInMap("dat_phase_code")
    @Validation(required = true)
    public String datPhaseCode;

    // 批次的数据量
    @NameInMap("data_num")
    @Validation(required = true)
    public Long dataNum;

    public static AddCaruserUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCaruserUsersRequest self = new AddCaruserUsersRequest();
        return TeaModel.build(map, self);
    }

    public AddCaruserUsersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddCaruserUsersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddCaruserUsersRequest setBusinessId(java.util.List<String> businessId) {
        this.businessId = businessId;
        return this;
    }
    public java.util.List<String> getBusinessId() {
        return this.businessId;
    }

    public AddCaruserUsersRequest setDataUniqloCode(String dataUniqloCode) {
        this.dataUniqloCode = dataUniqloCode;
        return this;
    }
    public String getDataUniqloCode() {
        return this.dataUniqloCode;
    }

    public AddCaruserUsersRequest setDatPhaseCode(String datPhaseCode) {
        this.datPhaseCode = datPhaseCode;
        return this;
    }
    public String getDatPhaseCode() {
        return this.datPhaseCode;
    }

    public AddCaruserUsersRequest setDataNum(Long dataNum) {
        this.dataNum = dataNum;
        return this;
    }
    public Long getDataNum() {
        return this.dataNum;
    }

}
