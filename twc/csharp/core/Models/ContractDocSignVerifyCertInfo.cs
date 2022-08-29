// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文件签验签证书结构体
    public class ContractDocSignVerifyCertInfo : TeaModel {
        // 证书所有者
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 证书序列号
        [NameInMap("serial")]
        [Validation(Required=false)]
        public string Serial { get; set; }

        // 证书开始日期
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public string StartDate { get; set; }

        // 证书结束日期
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

        // 证书颁发机构
        [NameInMap("issuer_cn")]
        [Validation(Required=false)]
        public string IssuerCn { get; set; }

    }

}
