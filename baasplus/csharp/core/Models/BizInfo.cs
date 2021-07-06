// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    // 用于内部业务统计的信息，外部商户请忽略
    public class BizInfo : TeaModel {
        // BPWZPFCN
        [NameInMap("client_tenent")]
        [Validation(Required=false)]
        public string ClientTenent { get; set; }

        // 业务代码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 内部产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

    }

}
