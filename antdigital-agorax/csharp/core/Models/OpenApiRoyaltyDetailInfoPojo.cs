// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 分账信息
    public class OpenApiRoyaltyDetailInfoPojo : TeaModel {
        // 分账比例
        [NameInMap("percentage")]
        [Validation(Required=false)]
        public string Percentage { get; set; }

        // 分账金额
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 分账类型
        [NameInMap("royalty_type")]
        [Validation(Required=false)]
        public string RoyaltyType { get; set; }

        // 支出方账户类型
        [NameInMap("trans_out_type")]
        [Validation(Required=false)]
        public string TransOutType { get; set; }

        // 支出方账户
        [NameInMap("trans_out")]
        [Validation(Required=false)]
        public string TransOut { get; set; }

        // 收入方账户类型
        [NameInMap("trans_in_type")]
        [Validation(Required=false)]
        public string TransInType { get; set; }

        // 收入方账户
        [NameInMap("trans_in")]
        [Validation(Required=false)]
        public string TransIn { get; set; }

        // 分账描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
