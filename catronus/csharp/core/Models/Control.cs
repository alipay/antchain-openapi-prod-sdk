// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // control
    public class Control : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // rule
        [NameInMap("rules")]
        [Validation(Required=false)]
        public List<Rule> Rules { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
