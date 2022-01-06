// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class RollbackSgRouterrulesnapshotsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ConfigSnapshotModel
        [NameInMap("config_snapshot")]
        [Validation(Required=true)]
        public string ConfigSnapshot { get; set; }

        // RouterRuleGroupModel
        [NameInMap("router_rule_group")]
        [Validation(Required=true)]
        public string RouterRuleGroup { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

    }

}
