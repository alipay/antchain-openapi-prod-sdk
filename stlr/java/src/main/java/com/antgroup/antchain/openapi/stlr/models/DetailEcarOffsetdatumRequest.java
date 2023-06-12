// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailEcarOffsetdatumRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务发生时的调用方的业务单号
    @NameInMap("acquisition_item_no")
    @Validation(required = true)
    public String acquisitionItemNo;

    public static DetailEcarOffsetdatumRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailEcarOffsetdatumRequest self = new DetailEcarOffsetdatumRequest();
        return TeaModel.build(map, self);
    }

    public DetailEcarOffsetdatumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailEcarOffsetdatumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailEcarOffsetdatumRequest setAcquisitionItemNo(String acquisitionItemNo) {
        this.acquisitionItemNo = acquisitionItemNo;
        return this;
    }
    public String getAcquisitionItemNo() {
        return this.acquisitionItemNo;
    }

}
