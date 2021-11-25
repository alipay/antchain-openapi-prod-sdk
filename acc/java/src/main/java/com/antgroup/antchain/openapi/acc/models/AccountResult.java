// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class AccountResult extends TeaModel {
    // 财报ID
    // 
    // 
    @NameInMap("acc_result_id")
    @Validation(required = true)
    public String accResultId;

    // 文件信息，支持上传多个文件
    // 
    // 
    @NameInMap("file_defines")
    @Validation(required = true)
    public java.util.List<FileDefine> fileDefines;

    public static AccountResult build(java.util.Map<String, ?> map) throws Exception {
        AccountResult self = new AccountResult();
        return TeaModel.build(map, self);
    }

    public AccountResult setAccResultId(String accResultId) {
        this.accResultId = accResultId;
        return this;
    }
    public String getAccResultId() {
        return this.accResultId;
    }

    public AccountResult setFileDefines(java.util.List<FileDefine> fileDefines) {
        this.fileDefines = fileDefines;
        return this;
    }
    public java.util.List<FileDefine> getFileDefines() {
        return this.fileDefines;
    }

}
