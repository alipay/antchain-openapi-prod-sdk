// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSystemSignFileRequest extends TeaModel {
    // 签署文件id,和签署文件列表fileId呼应
    @NameInMap("file_id")
    public String fileId;

    // 签署文件列表（包含印模和签署区域）
    @NameInMap("system_sign_area_request_list")
    @Validation(required = true)
    public java.util.List<CaSystemSignAreaRequest> systemSignAreaRequestList;

    public static CaSystemSignFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSystemSignFileRequest self = new CaSystemSignFileRequest();
        return TeaModel.build(map, self);
    }

    public CaSystemSignFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CaSystemSignFileRequest setSystemSignAreaRequestList(java.util.List<CaSystemSignAreaRequest> systemSignAreaRequestList) {
        this.systemSignAreaRequestList = systemSignAreaRequestList;
        return this;
    }
    public java.util.List<CaSystemSignAreaRequest> getSystemSignAreaRequestList() {
        return this.systemSignAreaRequestList;
    }

}
