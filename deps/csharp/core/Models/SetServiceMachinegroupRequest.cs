// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class SetServiceMachinegroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 分组数
        [NameInMap("group_mount")]
        [Validation(Required=false)]
        public long? GroupMount { get; set; }

        // groupStrategyType
        [NameInMap("group_strategy_type")]
        [Validation(Required=false)]
        public string GroupStrategyType { get; set; }

        // machine_groups
        [NameInMap("machine_groups")]
        [Validation(Required=false)]
        public List<string> MachineGroups { get; set; }

        // need_beta
        [NameInMap("need_beta")]
        [Validation(Required=false)]
        public bool? NeedBeta { get; set; }

        // service_id
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // use_default_setup
        [NameInMap("use_default_setup")]
        [Validation(Required=false)]
        public bool? UseDefaultSetup { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
