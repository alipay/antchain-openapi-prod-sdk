// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class AddCaruserPrdRequest extends TeaModel {
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
    @NameInMap("data_phase_code")
    @Validation(required = true)
    public String dataPhaseCode;

    // 批次的数据量
    @NameInMap("phase_data_num")
    @Validation(required = true)
    public Long phaseDataNum;

    // 整体数据量
    @NameInMap("uniqlo_data_num")
    @Validation(required = true)
    public Long uniqloDataNum;

    // 业务类型
    @NameInMap("business_type")
    @Validation(required = true)
    public String businessType;

    public static AddCaruserPrdRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCaruserPrdRequest self = new AddCaruserPrdRequest();
        return TeaModel.build(map, self);
    }

    public AddCaruserPrdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddCaruserPrdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddCaruserPrdRequest setBusinessId(java.util.List<String> businessId) {
        this.businessId = businessId;
        return this;
    }
    public java.util.List<String> getBusinessId() {
        return this.businessId;
    }

    public AddCaruserPrdRequest setDataUniqloCode(String dataUniqloCode) {
        this.dataUniqloCode = dataUniqloCode;
        return this;
    }
    public String getDataUniqloCode() {
        return this.dataUniqloCode;
    }

    public AddCaruserPrdRequest setDataPhaseCode(String dataPhaseCode) {
        this.dataPhaseCode = dataPhaseCode;
        return this;
    }
    public String getDataPhaseCode() {
        return this.dataPhaseCode;
    }

    public AddCaruserPrdRequest setPhaseDataNum(Long phaseDataNum) {
        this.phaseDataNum = phaseDataNum;
        return this;
    }
    public Long getPhaseDataNum() {
        return this.phaseDataNum;
    }

    public AddCaruserPrdRequest setUniqloDataNum(Long uniqloDataNum) {
        this.uniqloDataNum = uniqloDataNum;
        return this;
    }
    public Long getUniqloDataNum() {
        return this.uniqloDataNum;
    }

    public AddCaruserPrdRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
