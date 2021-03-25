// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // sidecar环境参数配置
    public class SidecarParamsConfig : TeaModel {
        // 类型：默认、透明劫持
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 环境参数内容
        [NameInMap("params")]
        [Validation(Required=false)]
        public string Params { get; set; }

    }

}
