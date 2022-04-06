// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteLoadbalanceVcomputergroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 虚拟服务器ID，PAAS ID非IAAS ID
        [NameInMap("v_computer_group_id")]
        [Validation(Required=true)]
        public string VComputerGroupId { get; set; }

    }

}
