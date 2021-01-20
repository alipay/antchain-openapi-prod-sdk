// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 错误原因
    public class Reason : TeaModel {
        // content
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // visible
        [NameInMap("visible")]
        [Validation(Required=false)]
        public bool? Visible { get; set; }

        // code
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // placeholder
        [NameInMap("placeholder")]
        [Validation(Required=false)]
        public string Placeholder { get; set; }

        // params
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<string> Params { get; set; }

    }

}
