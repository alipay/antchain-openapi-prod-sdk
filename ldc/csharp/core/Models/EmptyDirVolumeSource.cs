// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // EmptyDir based volume.
    public class EmptyDirVolumeSource : TeaModel {
        // 存储介质。
        [NameInMap("medium")]
        [Validation(Required=true)]
        public string Medium { get; set; }

        // volume name。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 存储大小。
        [NameInMap("size_limit")]
        [Validation(Required=true)]
        public string SizeLimit { get; set; }

    }

}
