// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // RouterConfigVO
    public class RouterConfigVO : TeaModel {
        // argKey
        [NameInMap("arg_key")]
        [Validation(Required=false)]
        public string ArgKey { get; set; }

        // argValue
        [NameInMap("arg_value")]
        [Validation(Required=false)]
        public string ArgValue { get; set; }

        // matchType
        [NameInMap("match_type")]
        [Validation(Required=false)]
        public string MatchType { get; set; }

        // param_location
        [NameInMap("param_location")]
        [Validation(Required=false)]
        public string ParamLocation { get; set; }

        // router_type
        [NameInMap("router_type")]
        [Validation(Required=false)]
        public string RouterType { get; set; }

        // systemCluster
        [NameInMap("system_cluster")]
        [Validation(Required=false)]
        public SystemClusterVO SystemCluster { get; set; }

        // sys_id
        [NameInMap("sys_id")]
        [Validation(Required=false)]
        public string SysId { get; set; }

        // weight
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // interceptionRule
        [NameInMap("interception_rule")]
        [Validation(Required=false)]
        public string InterceptionRule { get; set; }

    }

}
