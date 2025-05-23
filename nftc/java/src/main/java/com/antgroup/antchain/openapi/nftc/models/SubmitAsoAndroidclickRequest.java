// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class SubmitAsoAndroidclickRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 提交的批量数据
    @NameInMap("data_list")
    @Validation(required = true)
    public java.util.List<Data> dataList;

    // 数据来源:qimai
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static SubmitAsoAndroidclickRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsoAndroidclickRequest self = new SubmitAsoAndroidclickRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAsoAndroidclickRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAsoAndroidclickRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAsoAndroidclickRequest setDataList(java.util.List<Data> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<Data> getDataList() {
        return this.dataList;
    }

    public SubmitAsoAndroidclickRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
