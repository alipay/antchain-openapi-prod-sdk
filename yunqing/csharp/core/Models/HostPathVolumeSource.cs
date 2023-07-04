// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 宿主机挂载配置，比如：挂载路径、目录还是文件
    public class HostPathVolumeSource : TeaModel {
        // 宿主机挂载的路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        //   挂载的类型：  FILE("File"),
        //     DIRECTORY("Directory");
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
