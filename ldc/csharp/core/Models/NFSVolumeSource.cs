// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // NFS volume
    public class NFSVolumeSource : TeaModel {
        // 挂载路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // NFS 服务端地址
        [NameInMap("server")]
        [Validation(Required=true)]
        public string Server { get; set; }

    }

}
