// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 创建交易前检查结果
    public class PaymentCreateCheckResult : TeaModel {
        // 检查是否通过。PASS(检查通过);NOT_PASS(检查不通过)
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 业务错误码(为空表示成功，否则为业务错误码)
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 业务错误描述
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
