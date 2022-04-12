// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class UploadRequest extends TeaModel {
    // 文件流/文件地址
    @NameInMap("stream")
    @Validation(required = true)
    public String stream;

    // 文件名称
    @NameInMap("filename")
    @Validation(required = true)
    public String filename;

    // 内外工号
    @NameInMap("user")
    @Validation(required = true)
    public String user;

    // 附件的关联对象类型
    @NameInMap("target_type")
    @Validation(required = true)
    public String targetType;

    // 附件的关联对象ID
    @NameInMap("target_id")
    @Validation(required = true)
    public Long targetId;

    public static UploadRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRequest self = new UploadRequest();
        return TeaModel.build(map, self);
    }

    public UploadRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public UploadRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public UploadRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public UploadRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UploadRequest setTargetId(Long targetId) {
        this.targetId = targetId;
        return this;
    }
    public Long getTargetId() {
        return this.targetId;
    }

}
