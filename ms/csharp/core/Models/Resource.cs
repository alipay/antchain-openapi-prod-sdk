// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 动态资源
    public class Resource : TeaModel {
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        [NameInMap("attributes")]
        [Validation(Required=false)]
        public List<Attribute> Attributes { get; set; }

        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

    }

}
