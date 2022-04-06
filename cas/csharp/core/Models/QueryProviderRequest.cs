// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryProviderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // LB，COMPUTE，VPC,OBJECT_STORAGE等
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // paas_region_id
        [NameInMap("paas_region_id")]
        [Validation(Required=true)]
        public string PaasRegionId { get; set; }

    }

}
