// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    //  计量规则
    public class MethodMatchingRule : TeaModel {
        // 网关api
        [NameInMap("method")]
        [Validation(Required=true)]
        public string Method { get; set; }

        // 匹配规则
        [NameInMap("matching_rule")]
        [Validation(Required=true)]
        public string MatchingRule { get; set; }

    }

}
