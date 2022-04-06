// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class AddLoadbalanceVcomputergroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // v_computer_group_id
        [NameInMap("v_computer_group_id")]
        [Validation(Required=true)]
        public string VComputerGroupId { get; set; }

        // is_eip
        [NameInMap("is_eip")]
        [Validation(Required=false)]
        public bool? IsEip { get; set; }

        // computer 的id数组
        [NameInMap("computer_ids")]
        [Validation(Required=false)]
        public List<string> ComputerIds { get; set; }

        // 权重
        [NameInMap("weights")]
        [Validation(Required=true)]
        public List<long?> Weights { get; set; }

        // ports
        [NameInMap("ports")]
        [Validation(Required=true)]
        public List<string> Ports { get; set; }

        // 当is_eip时必填
        [NameInMap("eips")]
        [Validation(Required=false)]
        public List<string> Eips { get; set; }

    }

}
