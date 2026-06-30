// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SupplementFile extends TeaModel {
    // 材料类型：
    // 301-行驶证正本
    // 302-行驶证副本
    // 303-车辆产证（摩托车二手车）
    // 
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 材料url
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 材料名称/描述
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("file_desc")
    public String fileDesc;

    // 材料后缀，如png/jpg/jpeg
    /**
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("file_suffix")
    public String fileSuffix;

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

    public SupplementFile setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
        return this;
    }
    public String getFileSuffix() {
        return this.fileSuffix;
    }

}
