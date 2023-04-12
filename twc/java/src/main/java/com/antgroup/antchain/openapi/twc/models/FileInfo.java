// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FileInfo extends TeaModel {
    // 文件key
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件类型(枚举)
    // CASE_NOTICE: 立案通知书
    // CASE_VERDICT: 仲裁裁决书
    // CASE_EFFECT_PROVE: 裁决书司法生效证明
    // CASE_SERVED_NOTICE: 电子送达通知
    // PAYMETN_INFO: 缴费相关文件
    @NameInMap("file_type")
    public String fileType;

    public static FileInfo build(java.util.Map<String, ?> map) throws Exception {
        FileInfo self = new FileInfo();
        return TeaModel.build(map, self);
    }

    public FileInfo setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public FileInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileInfo setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
