// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class EpiAdmEnergyPolicyAttachment extends TeaModel {
    // 文件名称
    /**
     * <strong>example:</strong>
     * <p>文件名称.pdf</p>
     */
    @NameInMap("filename")
    public String filename;

    // 文件下载地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.oss.com/download">https://www.oss.com/download</a></p>
     */
    @NameInMap("fileurl")
    public String fileurl;

    public static EpiAdmEnergyPolicyAttachment build(java.util.Map<String, ?> map) throws Exception {
        EpiAdmEnergyPolicyAttachment self = new EpiAdmEnergyPolicyAttachment();
        return TeaModel.build(map, self);
    }

    public EpiAdmEnergyPolicyAttachment setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public EpiAdmEnergyPolicyAttachment setFileurl(String fileurl) {
        this.fileurl = fileurl;
        return this;
    }
    public String getFileurl() {
        return this.fileurl;
    }

}
