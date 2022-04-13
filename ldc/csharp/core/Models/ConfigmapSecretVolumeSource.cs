// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 基于configmap&secret的volume。
    public class ConfigmapSecretVolumeSource : TeaModel {
        // 引用volume名称。
        [NameInMap("volume_ref_name")]
        [Validation(Required=true)]
        public string VolumeRefName { get; set; }

    }

}
