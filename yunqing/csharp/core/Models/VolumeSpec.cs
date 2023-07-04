// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 数据卷规格
    public class VolumeSpec : TeaModel {
        // 数据卷名称
        [NameInMap("volume_name")]
        [Validation(Required=true)]
        public string VolumeName { get; set; }

        // 数据卷容量，单位为G
        [NameInMap("capacity")]
        [Validation(Required=true)]
        public string Capacity { get; set; }

    }

}
