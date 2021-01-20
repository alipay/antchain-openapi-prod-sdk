// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // OpsmetaSchema
    public class OpsmetaSchema : TeaModel {
        // envs
        [NameInMap("envs")]
        [Validation(Required=false)]
        public List<string> Envs { get; set; }

        // idc
        [NameInMap("idc")]
        [Validation(Required=false)]
        public OpsFilter Idc { get; set; }

        // ldc
        [NameInMap("ldc")]
        [Validation(Required=false)]
        public OpsFilter Ldc { get; set; }

        // server
        [NameInMap("server")]
        [Validation(Required=false)]
        public OpsFilter Server { get; set; }

    }

}
