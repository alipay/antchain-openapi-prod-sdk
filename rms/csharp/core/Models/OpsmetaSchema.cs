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
        [Validation(Required=true)]
        public List<string> Envs { get; set; }

        // idc
        [NameInMap("idc")]
        [Validation(Required=true)]
        public OpsFilter Idc { get; set; }

        // ldc
        [NameInMap("ldc")]
        [Validation(Required=true)]
        public OpsFilter Ldc { get; set; }

        // server
        [NameInMap("server")]
        [Validation(Required=true)]
        public OpsFilter Server { get; set; }

    }

}
