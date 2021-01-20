// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // Zone
    public class Zone : TeaModel {
        // zone名称
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // zone显示名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // zone paas id
        [NameInMap("paas_id")]
        [Validation(Required=false)]
        public string PaasId { get; set; }

        // region identity
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // zone state
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 机房iaas identity
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

    }

}
