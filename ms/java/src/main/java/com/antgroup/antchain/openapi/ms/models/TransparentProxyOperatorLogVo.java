// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyOperatorLogVo extends TeaModel {
    // 日志 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 修改内容
    @NameInMap("modify_content")
    @Validation(required = true)
    public String modifyContent;

    // 操作人
    @NameInMap("modify_name")
    @Validation(required = true)
    public String modifyName;

    // 操作时间
    @NameInMap("modify_time")
    @Validation(required = true)
    public String modifyTime;

    // 端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    public static TransparentProxyOperatorLogVo build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyOperatorLogVo self = new TransparentProxyOperatorLogVo();
        return TeaModel.build(map, self);
    }

    public TransparentProxyOperatorLogVo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TransparentProxyOperatorLogVo setModifyContent(String modifyContent) {
        this.modifyContent = modifyContent;
        return this;
    }
    public String getModifyContent() {
        return this.modifyContent;
    }

    public TransparentProxyOperatorLogVo setModifyName(String modifyName) {
        this.modifyName = modifyName;
        return this;
    }
    public String getModifyName() {
        return this.modifyName;
    }

    public TransparentProxyOperatorLogVo setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public TransparentProxyOperatorLogVo setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

}
