// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 签约请求
    public class SignRequest : TeaModel {
        // 合同类型
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public string ContractType { get; set; }

        // 签约模式
        [NameInMap("seal_mode")]
        [Validation(Required=true)]
        public string SealMode { get; set; }

    }

}
