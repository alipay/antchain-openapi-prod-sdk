// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // OPS分组方式
    public class OpsGroupBy : TeaModel {
        // 是否按环境分组
        [NameInMap("env")]
        [Validation(Required=false)]
        public bool? Env { get; set; }

        // 是否按部署单元分组
        [NameInMap("deploy_unit")]
        [Validation(Required=false)]
        public bool? DeployUnit { get; set; }

        // 是否按应用分组
        [NameInMap("app")]
        [Validation(Required=false)]
        public bool? App { get; set; }

        // 是否按idc分组
        [NameInMap("idc")]
        [Validation(Required=false)]
        public bool? Idc { get; set; }

        // 是否按ldc分组
        [NameInMap("ldc")]
        [Validation(Required=false)]
        public bool? Ldc { get; set; }

        // 是否按server分组
        [NameInMap("server")]
        [Validation(Required=false)]
        public bool? Server { get; set; }

        // 附加信息
        [NameInMap("extra")]
        [Validation(Required=false)]
        public string Extra { get; set; }

    }

}
