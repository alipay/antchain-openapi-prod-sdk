// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryLoadbalanceVcomputergroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // load_balance_ids
        [NameInMap("load_balance_ids")]
        [Validation(Required=true)]
        public List<string> LoadBalanceIds { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // statuses
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
