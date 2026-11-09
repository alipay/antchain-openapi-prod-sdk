// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class DownloadStockUseflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 格式：yyyy-MM-DD，仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
    @NameInMap("bill_date")
    @Validation(required = true)
    public String billDate;

    // 【批次号】单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减
    @NameInMap("stock_id")
    @Validation(required = true)
    public String stockId;

    public static DownloadStockUseflowRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadStockUseflowRequest self = new DownloadStockUseflowRequest();
        return TeaModel.build(map, self);
    }

    public DownloadStockUseflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadStockUseflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadStockUseflowRequest setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

    public DownloadStockUseflowRequest setStockId(String stockId) {
        this.stockId = stockId;
        return this;
    }
    public String getStockId() {
        return this.stockId;
    }

}
