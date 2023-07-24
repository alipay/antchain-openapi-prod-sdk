// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class AuthFileIntegrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权类型：BUCKET，OBJECT
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // object名称（当auth_type为OBJECT必填）
        [NameInMap("object_name")]
        [Validation(Required=false)]
        public string ObjectName { get; set; }

        // 授权过期时间，格式为 yyyy-MM-dd HH:mm:ss
        [NameInMap("auth_expire_time")]
        [Validation(Required=true)]
        public string AuthExpireTime { get; set; }

        // 被授权的租户id
        [NameInMap("target_tenant")]
        [Validation(Required=true)]
        public string TargetTenant { get; set; }

    }

}
