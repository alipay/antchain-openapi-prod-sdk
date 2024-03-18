// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanVideoProfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 2D_PRESET---2d预置；
    // 3D_PRESET---3d预置；
    // 2D_CUSTOM--2d定制；
    // 3D_CUSTOM--3d定制；
    // 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 分页查询页面索引，传值为空不分页
    // 索引从0开始。
    @NameInMap("page_index")
    public Long pageIndex;

    // 分页页面大小，默认10
    @NameInMap("page_size")
    public Long pageSize;

    public static ListUniversalsaasDigitalhumanVideoProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanVideoProfileRequest self = new ListUniversalsaasDigitalhumanVideoProfileRequest();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanVideoProfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUniversalsaasDigitalhumanVideoProfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListUniversalsaasDigitalhumanVideoProfileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListUniversalsaasDigitalhumanVideoProfileRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListUniversalsaasDigitalhumanVideoProfileRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
