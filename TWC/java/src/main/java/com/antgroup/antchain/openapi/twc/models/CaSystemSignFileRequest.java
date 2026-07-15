// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CaSystemSignFileRequest extends TeaModel {
    // 单次请求文件唯一id，与AntSignFileRequest中的fileId对应
    /**
     * <strong>example:</strong>
     * <p>签署文件id</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 签署区域信息（包括印模信息）
    @NameInMap("ca_system_sign_area_request_list")
    @Validation(required = true)
    public java.util.List<CaSystemSignAreaRequest> caSystemSignAreaRequestList;

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

    public CaSystemSignFileRequest setCaSystemSignAreaRequestList(java.util.List<CaSystemSignAreaRequest> caSystemSignAreaRequestList) {
        this.caSystemSignAreaRequestList = caSystemSignAreaRequestList;
        return this;
    }
    public java.util.List<CaSystemSignAreaRequest> getCaSystemSignAreaRequestList() {
        return this.caSystemSignAreaRequestList;
    }

}
