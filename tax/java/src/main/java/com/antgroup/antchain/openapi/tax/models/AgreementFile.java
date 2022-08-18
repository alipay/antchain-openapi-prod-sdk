// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AgreementFile extends TeaModel {
    // 授权文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 授权文件内容
    @NameInMap("file_content_base64_string")
    @Validation(required = true)
    public String fileContentBase64String;

    public static AgreementFile build(java.util.Map<String, ?> map) throws Exception {
        AgreementFile self = new AgreementFile();
        return TeaModel.build(map, self);
    }

    public AgreementFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AgreementFile setFileContentBase64String(String fileContentBase64String) {
        this.fileContentBase64String = fileContentBase64String;
        return this;
    }
    public String getFileContentBase64String() {
        return this.fileContentBase64String;
    }

}
