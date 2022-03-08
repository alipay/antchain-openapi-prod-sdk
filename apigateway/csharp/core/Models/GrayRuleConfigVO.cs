// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // GrayRuleConfigVO
    public class GrayRuleConfigVO : TeaModel {
        // lable
        [NameInMap("lable")]
        [Validation(Required=false)]
        public string Lable { get; set; }

        // weight
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // arg_key
        [NameInMap("arg_key")]
        [Validation(Required=false)]
        public string ArgKey { get; set; }

        // match_type
        [NameInMap("match_type")]
        [Validation(Required=false)]
        public string MatchType { get; set; }

        // arg_value
        [NameInMap("arg_value")]
        [Validation(Required=false)]
        public string ArgValue { get; set; }

    }

}
