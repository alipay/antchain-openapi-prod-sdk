// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateSofamqConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目标名
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // 目标类型
        [NameInMap("target_type")]
        [Validation(Required=true)]
        public long? TargetType { get; set; }

        // 配置名
        [NameInMap("property")]
        [Validation(Required=true)]
        public string Property { get; set; }

        // 配置值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
