// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class Assure extends TeaModel {
    // 担保ID
    // 
    // 
    @NameInMap("assure_id")
    @Validation(required = true)
    public String assureId;

    // 文件信息，支持上传多个文件
    // 
    // 
    @NameInMap("file_defines")
    @Validation(required = true)
    public java.util.List<FileDefine> fileDefines;

    public static Assure build(java.util.Map<String, ?> map) throws Exception {
        Assure self = new Assure();
        return TeaModel.build(map, self);
    }

    public Assure setAssureId(String assureId) {
        this.assureId = assureId;
        return this;
    }
    public String getAssureId() {
        return this.assureId;
    }

    public Assure setFileDefines(java.util.List<FileDefine> fileDefines) {
        this.fileDefines = fileDefines;
        return this;
    }
    public java.util.List<FileDefine> getFileDefines() {
        return this.fileDefines;
    }

}
