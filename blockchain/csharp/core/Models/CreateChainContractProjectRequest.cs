// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateChainContractProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // consortium_id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // project_name
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // project_version
        [NameInMap("project_version")]
        [Validation(Required=false)]
        public string ProjectVersion { get; set; }

        // project_description
        [NameInMap("project_description")]
        [Validation(Required=false)]
        public string ProjectDescription { get; set; }

    }

}
