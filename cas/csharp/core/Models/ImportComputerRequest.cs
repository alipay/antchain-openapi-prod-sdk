// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ImportComputerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // computer iaas ids
        [NameInMap("computer_ids")]
        [Validation(Required=true)]
        public List<string> ComputerIds { get; set; }

        // workspace 名称
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // computer 所在的 zone identity。可不填。
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

    }

}
