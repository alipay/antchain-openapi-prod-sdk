// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ClaimInformation extends TeaModel {
    // 索赔资料地址url
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.xxx.com">https://www.xxx.com</a></p>
     */
    @NameInMap("file_url")
    @Validation(required = true, maxLength = 500)
    public String fileUrl;

    // 文件名	
    /**
     * <strong>example:</strong>
     * <p>客服判责资料 </p>
     */
    @NameInMap("file_name")
    @Validation(required = true, maxLength = 200)
    public String fileName;

    public static ClaimInformation build(java.util.Map<String, ?> map) throws Exception {
        ClaimInformation self = new ClaimInformation();
        return TeaModel.build(map, self);
    }

    public ClaimInformation setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ClaimInformation setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
