// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文本签证书信息
    public class ContractTextSignVerifyCertInfo : TeaModel {
        // 证书所有者
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 证书序列号
        [NameInMap("serial")]
        [Validation(Required=false)]
        public string Serial { get; set; }

        // 证书有效期开始时间
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public string StartDate { get; set; }

        // 证书有效期结束时间
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

        // 证书发布者名称
        [NameInMap("issuer_cn")]
        [Validation(Required=false)]
        public string IssuerCn { get; set; }

    }

}
