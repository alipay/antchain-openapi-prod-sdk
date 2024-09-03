// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ExecTradeCoverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方唯一业务标识
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public Long outBizNo;

    // 需要抽取封面的文件url
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    public static ExecTradeCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecTradeCoverRequest self = new ExecTradeCoverRequest();
        return TeaModel.build(map, self);
    }

    public ExecTradeCoverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecTradeCoverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecTradeCoverRequest setOutBizNo(Long outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public Long getOutBizNo() {
        return this.outBizNo;
    }

    public ExecTradeCoverRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
