// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class UpdateAaaAcdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date;

    // 123
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static UpdateAaaAcdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAaaAcdRequest self = new UpdateAaaAcdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAaaAcdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAaaAcdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAaaAcdRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public UpdateAaaAcdRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
