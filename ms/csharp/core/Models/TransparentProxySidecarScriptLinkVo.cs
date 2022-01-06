// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持下载链接VO结构套件
    public class TransparentProxySidecarScriptLinkVo : TeaModel {
        // 安装sidecar下载链接
        [NameInMap("install_sidecar_script_link")]
        [Validation(Required=true)]
        public string InstallSidecarScriptLink { get; set; }

        // 清理sidecar脚本下载链接
        [NameInMap("clean_sidecar_script_link")]
        [Validation(Required=true)]
        public string CleanSidecarScriptLink { get; set; }

    }

}
