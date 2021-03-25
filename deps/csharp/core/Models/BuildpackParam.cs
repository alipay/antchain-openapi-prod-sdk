// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // BuildpackParam
    public class BuildpackParam : TeaModel {
        // default_value
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        // key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // readonly
        [NameInMap("readonly")]
        [Validation(Required=false)]
        public bool? Readonly { get; set; }

        // required
        [NameInMap("required")]
        [Validation(Required=false)]
        public bool? Required { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
