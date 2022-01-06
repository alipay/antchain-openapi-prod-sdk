// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class DeleteDdcsAttributeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        [NameInMap("attribute_name")]
        [Validation(Required=true)]
        public string AttributeName { get; set; }

        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

    }

}
