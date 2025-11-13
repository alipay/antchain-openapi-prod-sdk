// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 赎回结果信息
    public class MerchantPerformanceRedeemResultInfo : TeaModel {
        // 回购支付方式	
        // ONLINE-线上
        // OFFLINE-线下
        [NameInMap("redeem_way")]
        [Validation(Required=false)]
        public string RedeemWay { get; set; }

        // 回购时间
        [NameInMap("redeem_time")]
        [Validation(Required=false)]
        public string RedeemTime { get; set; }

        // 回购原因
        // ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
        // RENTING_OUT_REDEEM("RENTING_OUT_REDEEM",
        //                                                                           "退租赎回"),
        // RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
        //                                                                                  "租转售赎回");
        [NameInMap("redeem_reason")]
        [Validation(Required=false)]
        public string RedeemReason { get; set; }

        // 回购类型
        // TRANSFER，转账代偿
        // WITHHOLD，代扣代偿
        [NameInMap("redeem_type")]
        [Validation(Required=false)]
        public string RedeemType { get; set; }

        // 回购金额（分）
        [NameInMap("redeem_amount")]
        [Validation(Required=false)]
        public long? RedeemAmount { get; set; }

        // 回购状态
        // PAYING 回购中
        // SUCCESS 成功
        // FAILED 失败
        [NameInMap("redeem_status")]
        [Validation(Required=false)]
        public string RedeemStatus { get; set; }

    }

}
