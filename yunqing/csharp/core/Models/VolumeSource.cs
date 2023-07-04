// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 数据卷挂载方式，比如：宿主机挂载、PV持久化存储挂载
    public class VolumeSource : TeaModel {
        // 宿主机模式配置
        [NameInMap("host_path")]
        [Validation(Required=false)]
        public HostPathVolumeSource HostPath { get; set; }

        // 和Host二选一
        [NameInMap("persistent_volume")]
        [Validation(Required=false)]
        public PersistentVolumeSource PersistentVolume { get; set; }

    }

}
