// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateChainContractContentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // content
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // content_id
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        // content_name
        [NameInMap("content_name")]
        [Validation(Required=false)]
        public string ContentName { get; set; }

        // parent_content_id
        [NameInMap("parent_content_id")]
        [Validation(Required=false)]
        public string ParentContentId { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // consortium_id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

    }

}
