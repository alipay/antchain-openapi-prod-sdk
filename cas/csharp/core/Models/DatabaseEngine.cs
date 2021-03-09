// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // DatabaseEngine
    public class DatabaseEngine : TeaModel {
        // iaas_type
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // engine
        [NameInMap("engine")]
        [Validation(Required=false)]
        public string Engine { get; set; }

        // engine_versions
        [NameInMap("engine_versions")]
        [Validation(Required=false)]
        public List<string> EngineVersions { get; set; }

    }

}
