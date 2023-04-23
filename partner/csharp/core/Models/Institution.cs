// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 银行顶级机构信息
    public class Institution : TeaModel {
        // 机构id
        [NameInMap("inst_id")]
        [Validation(Required=true)]
        public string InstId { get; set; }

        // 机构名称
        [NameInMap("inst_name")]
        [Validation(Required=true)]
        public string InstName { get; set; }

        // 机构code
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

    }

}
