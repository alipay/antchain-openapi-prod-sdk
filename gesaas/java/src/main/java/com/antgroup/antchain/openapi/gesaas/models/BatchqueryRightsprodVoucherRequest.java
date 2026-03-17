// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class BatchqueryRightsprodVoucherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 券编码（券实例）列表
    @NameInMap("voucher_code_list")
    @Validation(required = true)
    public java.util.List<String> voucherCodeList;

    public static BatchqueryRightsprodVoucherRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryRightsprodVoucherRequest self = new BatchqueryRightsprodVoucherRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryRightsprodVoucherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryRightsprodVoucherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryRightsprodVoucherRequest setVoucherCodeList(java.util.List<String> voucherCodeList) {
        this.voucherCodeList = voucherCodeList;
        return this;
    }
    public java.util.List<String> getVoucherCodeList() {
        return this.voucherCodeList;
    }

}
