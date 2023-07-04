// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // AAP应用数据卷元数据
    public class Volume : TeaModel {
        // 数据卷名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        //  可挂载的配置
        [NameInMap("volume_source")]
        [Validation(Required=true)]
        public VolumeSource VolumeSource { get; set; }

        // 数据卷配置
        [NameInMap("mount_options")]
        [Validation(Required=true)]
        public MountOptions MountOptions { get; set; }

    }

}
