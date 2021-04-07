// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateDiskStrategyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // delete_with_computer
        [NameInMap("delete_with_computer")]
        [Validation(Required=false)]
        public bool? DeleteWithComputer { get; set; }

        // delete_auto_snapshot
        [NameInMap("delete_auto_snapshot")]
        [Validation(Required=false)]
        public bool? DeleteAutoSnapshot { get; set; }

        // enable_auto_snapshot
        [NameInMap("enable_auto_snapshot")]
        [Validation(Required=false)]
        public bool? EnableAutoSnapshot { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=true)]
        public List<string> Ids { get; set; }

    }

}
