// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateLoadbalanceVcomputergroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // v_computergroup_id
        [NameInMap("v_computergroup_id")]
        [Validation(Required=true)]
        public string VComputergroupId { get; set; }

        // is_eip
        [NameInMap("is_eip")]
        [Validation(Required=false)]
        public bool? IsEip { get; set; }

        // eips
        [NameInMap("eips")]
        [Validation(Required=true)]
        public List<string> Eips { get; set; }

        // computer_ids
        [NameInMap("computer_ids")]
        [Validation(Required=false)]
        public List<string> ComputerIds { get; set; }

        // weights
        [NameInMap("weights")]
        [Validation(Required=true)]
        public List<long?> Weights { get; set; }

        // ports
        [NameInMap("ports")]
        [Validation(Required=true)]
        public List<long?> Ports { get; set; }

        // 是否只是调整权重，不增删后端服务器
        [NameInMap("update_weight_only")]
        [Validation(Required=false)]
        public bool? UpdateWeightOnly { get; set; }

    }

}
