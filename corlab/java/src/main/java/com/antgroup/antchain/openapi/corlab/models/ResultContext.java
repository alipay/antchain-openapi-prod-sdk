// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class ResultContext extends TeaModel {
    // 产品码
    @NameInMap("product_code")
    public String productCode;

    // 结果文件名
    @NameInMap("file_name")
    public String fileName;

    // 结果文件下载地址
    @NameInMap("file_url")
    public String fileUrl;

    public static ResultContext build(java.util.Map<String, ?> map) throws Exception {
        ResultContext self = new ResultContext();
        return TeaModel.build(map, self);
    }

    public ResultContext setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ResultContext setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ResultContext setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
