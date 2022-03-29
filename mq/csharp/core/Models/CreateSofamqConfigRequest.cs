// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // property
        [NameInMap("property")]
        [Validation(Required=true)]
        public string Property { get; set; }

        // target_name
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // target_type
        [NameInMap("target_type")]
        [Validation(Required=true)]
        public long? TargetType { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 生效范围，三板斧使用
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

    }

}
