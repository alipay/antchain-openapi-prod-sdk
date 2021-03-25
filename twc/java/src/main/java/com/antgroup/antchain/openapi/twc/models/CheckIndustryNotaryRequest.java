// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckIndustryNotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 行业类型
    @NameInMap("industry_type")
    @Validation(required = true)
    public String industryType;

    // 核验数据列表
    @NameInMap("notary_check_meta_list")
    @Validation(required = true)
    public java.util.List<NotaryCheckMeta> notaryCheckMetaList;

    public static CheckIndustryNotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckIndustryNotaryRequest self = new CheckIndustryNotaryRequest();
        return TeaModel.build(map, self);
    }

    public CheckIndustryNotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckIndustryNotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckIndustryNotaryRequest setIndustryType(String industryType) {
        this.industryType = industryType;
        return this;
    }
    public String getIndustryType() {
        return this.industryType;
    }

    public CheckIndustryNotaryRequest setNotaryCheckMetaList(java.util.List<NotaryCheckMeta> notaryCheckMetaList) {
        this.notaryCheckMetaList = notaryCheckMetaList;
        return this;
    }
    public java.util.List<NotaryCheckMeta> getNotaryCheckMetaList() {
        return this.notaryCheckMetaList;
    }

}
