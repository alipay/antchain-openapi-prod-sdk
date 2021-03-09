// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // vpc import info
    public class VpcImport : TeaModel {
        // cidr block
        [NameInMap("cidr_block")]
        [Validation(Required=false)]
        public string CidrBlock { get; set; }

        // vpc描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // vpc iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=true)]
        public string IaasId { get; set; }

        // import workspace info
        [NameInMap("import_info")]
        [Validation(Required=true)]
        public ImportInfo ImportInfo { get; set; }

        // vpc name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // vpc status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
