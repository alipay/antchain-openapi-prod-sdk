// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用数据卷配置项，主要涉及：挂载路径、是否只读、挂载传递方式
    public class MountOptions : TeaModel {
        // 容器内挂载路径
        [NameInMap("mount_path")]
        [Validation(Required=true)]
        public string MountPath { get; set; }

        // 是否只读，默认false
        [NameInMap("read_only")]
        [Validation(Required=true)]
        public string ReadOnly { get; set; }

        // 挂载传递策略：    NONE("None"),
        //     HOSTTOCONTAINER("HostToContainer"),
        //     BIDIRECTIONAL("Bidirectional");
        // 
        [NameInMap("mount_propagation")]
        [Validation(Required=true)]
        public string MountPropagation { get; set; }

    }

}
