// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CancelFileIntegrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被授权目标租户ID
        [NameInMap("target_tenant")]
        [Validation(Required=true)]
        public string TargetTenant { get; set; }

        // 授权类型：BUCKET，OBJECT
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // object名称（当auth_type为OBJECT必填）	
        [NameInMap("object_name")]
        [Validation(Required=false)]
        public string ObjectName { get; set; }

    }

}
