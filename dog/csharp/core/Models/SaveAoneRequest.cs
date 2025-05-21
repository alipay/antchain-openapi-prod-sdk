// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DOG.Models
{
    public class SaveAoneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建者的工号
        [NameInMap("author")]
        [Validation(Required=true)]
        public string Author { get; set; }

        // versionIds
        [NameInMap("version_ids")]
        [Validation(Required=true)]
        public List<long?> VersionIds { get; set; }

        // assignedTo
        [NameInMap("assigned_to")]
        [Validation(Required=true)]
        public string AssignedTo { get; set; }

    }

}
