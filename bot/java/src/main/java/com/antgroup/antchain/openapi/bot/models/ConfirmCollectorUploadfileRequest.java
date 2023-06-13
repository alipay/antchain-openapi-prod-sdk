// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ConfirmCollectorUploadfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上报文件任务ID，blockchain.bot.collector.uploadfileurl.create接口中获取
    @NameInMap("upload_id")
    @Validation(required = true)
    public String uploadId;

    // 上报数据的总数，用于和CSV文件中的数据进行核验
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static ConfirmCollectorUploadfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmCollectorUploadfileRequest self = new ConfirmCollectorUploadfileRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmCollectorUploadfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmCollectorUploadfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmCollectorUploadfileRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public ConfirmCollectorUploadfileRequest setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
