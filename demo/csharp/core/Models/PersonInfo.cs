// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // x
    public class PersonInfo : TeaModel {
        // 1
        [NameInMap("card_infos")]
        [Validation(Required=true)]
        public CardInfos CardInfos { get; set; }

        // 123
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
