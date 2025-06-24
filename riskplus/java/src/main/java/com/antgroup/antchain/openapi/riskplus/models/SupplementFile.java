// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SupplementFile extends TeaModel {
    // 材料类型：
    // 301-行驶证正本
    // 302-行驶证副本
    // 303-车辆产证（摩托车二手车）
    // 
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 材料url
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 材料名称/描述
    @NameInMap("file_desc")
    @Validation(required = true)
    public String fileDesc;

    public static SupplementFile build(java.util.Map<String, ?> map) throws Exception {
        SupplementFile self = new SupplementFile();
        return TeaModel.build(map, self);
    }

    public SupplementFile setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public SupplementFile setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SupplementFile setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
        return this;
    }
    public String getFileDesc() {
        return this.fileDesc;
    }

}
