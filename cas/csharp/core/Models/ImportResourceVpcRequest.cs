// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ImportResourceVpcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // region identity
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // vpc iaas id
        [NameInMap("vpc_id")]
        [Validation(Required=true)]
        public string VpcId { get; set; }

        // workspace identity
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // vrouter id
        [NameInMap("vrouter_id")]
        [Validation(Required=true)]
        public string VrouterId { get; set; }

        // vpc name
        [NameInMap("vpc_name")]
        [Validation(Required=true)]
        public string VpcName { get; set; }

        // cidr block
        [NameInMap("cidr_block")]
        [Validation(Required=false)]
        public string CidrBlock { get; set; }

        // paas_region_id
        [NameInMap("paas_region_id")]
        [Validation(Required=true)]
        public string PaasRegionId { get; set; }

    }

}
