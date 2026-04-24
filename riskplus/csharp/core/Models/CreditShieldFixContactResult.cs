// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 可信联系方式查询
    public class CreditShieldFixContactResult : TeaModel {
        // 1-查得，0-未查得
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 查得手机号md5
        [NameInMap("phones")]
        [Validation(Required=false)]
        public List<string> Phones { get; set; }

    }

}
