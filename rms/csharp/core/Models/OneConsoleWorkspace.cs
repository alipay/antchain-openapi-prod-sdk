// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // oneconsole需要的workspace
    public class OneConsoleWorkspace : TeaModel {
        // ws id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
