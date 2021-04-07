// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class GetRegionAliasbyidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // providerId
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // iaasConnType
        [NameInMap("iaas_conn_type")]
        [Validation(Required=true)]
        public string IaasConnType { get; set; }

    }

}
