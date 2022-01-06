// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxySidecarScriptLinkVo extends TeaModel {
    // 安装sidecar下载链接
    @NameInMap("install_sidecar_script_link")
    @Validation(required = true)
    public String installSidecarScriptLink;

    // 清理sidecar脚本下载链接
    @NameInMap("clean_sidecar_script_link")
    @Validation(required = true)
    public String cleanSidecarScriptLink;

    public static TransparentProxySidecarScriptLinkVo build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxySidecarScriptLinkVo self = new TransparentProxySidecarScriptLinkVo();
        return TeaModel.build(map, self);
    }

    public TransparentProxySidecarScriptLinkVo setInstallSidecarScriptLink(String installSidecarScriptLink) {
        this.installSidecarScriptLink = installSidecarScriptLink;
        return this;
    }
    public String getInstallSidecarScriptLink() {
        return this.installSidecarScriptLink;
    }

    public TransparentProxySidecarScriptLinkVo setCleanSidecarScriptLink(String cleanSidecarScriptLink) {
        this.cleanSidecarScriptLink = cleanSidecarScriptLink;
        return this;
    }
    public String getCleanSidecarScriptLink() {
        return this.cleanSidecarScriptLink;
    }

}
