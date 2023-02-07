// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateFeatureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // feature_id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 可以序列化成Map的Json字符串
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 详情参考 https://velocity.apache.org/engine/
        [NameInMap("conditional_content")]
        [Validation(Required=false)]
        public string ConditionalContent { get; set; }

    }

}
