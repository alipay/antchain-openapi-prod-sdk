// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 区县集合
    public class County : TeaModel {
        // 城市id
        [NameInMap("cid")]
        [Validation(Required=true)]
        public string Cid { get; set; }

        // 区县id
        [NameInMap("countyid")]
        [Validation(Required=true)]
        public string Countyid { get; set; }

        // 区县名
        [NameInMap("countyname")]
        [Validation(Required=true)]
        public string Countyname { get; set; }

    }

}
