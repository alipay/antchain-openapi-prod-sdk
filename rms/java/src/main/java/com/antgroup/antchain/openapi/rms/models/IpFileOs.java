// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class IpFileOs extends TeaModel {
    // error_msg
    @NameInMap("error_msg")
    @Validation(required = true)
    public String errorMsg;

    // ip
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // next_file_id
    @NameInMap("next_file_id")
    @Validation(required = true)
    public String nextFileId;

    // next_offset
    @NameInMap("next_offset")
    @Validation(required = true)
    public Long nextOffset;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    public static IpFileOs build(java.util.Map<String, ?> map) throws Exception {
        IpFileOs self = new IpFileOs();
        return TeaModel.build(map, self);
    }

    public IpFileOs setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public IpFileOs setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public IpFileOs setNextFileId(String nextFileId) {
        this.nextFileId = nextFileId;
        return this;
    }
    public String getNextFileId() {
        return this.nextFileId;
    }

    public IpFileOs setNextOffset(Long nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }
    public Long getNextOffset() {
        return this.nextOffset;
    }

    public IpFileOs setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
