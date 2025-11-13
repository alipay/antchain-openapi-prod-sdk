// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商户履约赎回信息
    public class MerchantPerformanceRedeemInfo : TeaModel {
        // 是否展示“剩余账期提前回购”
        [NameInMap("support_redeem")]
        [Validation(Required=false)]
        public bool? SupportRedeem { get; set; }

        // 可选回购类型
        // TRANSFER("TRANSFER", "转账代偿"),
        // WITHHOLD("WITHHOLD", "代扣代偿"),
        [NameInMap("support_redeem_type_list")]
        [Validation(Required=false)]
        public List<string> SupportRedeemTypeList { get; set; }

        // 商户履约赎回结果信息
        [NameInMap("merchant_performance_redeem_result_info")]
        [Validation(Required=false)]
        public MerchantPerformanceRedeemResultInfo MerchantPerformanceRedeemResultInfo { get; set; }

    }

}
