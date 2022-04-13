// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // zone info
    public class ZoneInfo : TeaModel {
        // zone identity
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // zone name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 所属region信息。
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // zone display name
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

    }

}
