// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // volume mount of PersistentVolumeClaim.
    public class PersistentVolumeClaimSource : TeaModel {
        // 引用的PVC名称。
        [NameInMap("pvc_name")]
        [Validation(Required=true)]
        public string PvcName { get; set; }

    }

}
