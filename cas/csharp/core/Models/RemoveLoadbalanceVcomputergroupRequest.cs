// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class RemoveLoadbalanceVcomputergroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // computer_ids
        [NameInMap("computer_ids")]
        [Validation(Required=true)]
        public List<string> ComputerIds { get; set; }

        // 后端是否是弹性网卡
        [NameInMap("is_eip")]
        [Validation(Required=false)]
        public bool? IsEip { get; set; }

        // ports
        [NameInMap("ports")]
        [Validation(Required=true)]
        public List<long?> Ports { get; set; }

        // weights
        [NameInMap("weights")]
        [Validation(Required=true)]
        public List<long?> Weights { get; set; }

        // eips
        [NameInMap("eips")]
        [Validation(Required=false)]
        public List<string> Eips { get; set; }

        // v_computer_group_id
        [NameInMap("v_computer_group_id")]
        [Validation(Required=true)]
        public string VComputerGroupId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

    }

}
