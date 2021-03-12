// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateChainCertAntRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=true)]
        public string AntChainId { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // upload_req
        [NameInMap("upload_req")]
        [Validation(Required=true)]
        public string UploadReq { get; set; }

    }

}
