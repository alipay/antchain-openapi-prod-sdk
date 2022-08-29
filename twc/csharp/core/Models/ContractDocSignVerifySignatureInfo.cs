// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文件验签签名数据
    public class ContractDocSignVerifySignatureInfo : TeaModel {
        // 是否篡改
        [NameInMap("is_modify")]
        [Validation(Required=false)]
        public bool? IsModify { get; set; }

        // 签署时间来源
        [NameInMap("time_from")]
        [Validation(Required=false)]
        public string TimeFrom { get; set; }

        // 签署时间
        [NameInMap("sign_date")]
        [Validation(Required=false)]
        public string SignDate { get; set; }

    }

}
