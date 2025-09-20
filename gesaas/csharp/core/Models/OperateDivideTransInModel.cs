// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 经营分账收入方列表
    public class OperateDivideTransInModel : TeaModel {
        // 分账收入方支付宝用户id, 支付宝2088id
        [NameInMap("trans_in_user_id")]
        [Validation(Required=true)]
        public string TransInUserId { get; set; }

        // 分账金额，单位为分 大于0
        [NameInMap("divide_amount")]
        [Validation(Required=true)]
        public long? DivideAmount { get; set; }

    }

}
