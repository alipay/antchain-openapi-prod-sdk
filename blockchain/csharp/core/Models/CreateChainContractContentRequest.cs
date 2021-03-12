// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateChainContractContentRequest : TeaModel {
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

        // content_name
        [NameInMap("content_name")]
        [Validation(Required=true)]
        public string ContentName { get; set; }

        // is_directory
        [NameInMap("is_directory")]
        [Validation(Required=true)]
        public bool? IsDirectory { get; set; }

        // parent_content_id
        [NameInMap("parent_content_id")]
        [Validation(Required=false)]
        public string ParentContentId { get; set; }

        // project_id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // consortium_id
        [NameInMap("consortium_id")]
        [Validation(Required=true)]
        public string ConsortiumId { get; set; }

    }

}
