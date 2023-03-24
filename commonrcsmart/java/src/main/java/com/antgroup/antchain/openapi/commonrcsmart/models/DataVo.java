// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class DataVo extends TeaModel {
    // 文件审核地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 文件类型
    @NameInMap("file_type")
    public String fileType;

    public static DataVo build(java.util.Map<String, ?> map) throws Exception {
        DataVo self = new DataVo();
        return TeaModel.build(map, self);
    }

    public DataVo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DataVo setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
