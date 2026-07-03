// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CountDubbridgeRepayTrialResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 还款本金
        [NameInMap("real_principal")]
        [Validation(Required=false)]
        public long? RealPrincipal { get; set; }

        // 还款利息
        [NameInMap("real_interest")]
        [Validation(Required=false)]
        public long? RealInterest { get; set; }

        // 还款费用
        [NameInMap("real_over_amt")]
        [Validation(Required=false)]
        public long? RealOverAmt { get; set; }

        // 服务费
        [NameInMap("service_charge")]
        [Validation(Required=false)]
        public long? ServiceCharge { get; set; }

        // 担保费
        [NameInMap("real_guarantee_fee")]
        [Validation(Required=false)]
        public long? RealGuaranteeFee { get; set; }

        // 违约金
        [NameInMap("real_liquidated_damages")]
        [Validation(Required=false)]
        public long? RealLiquidatedDamages { get; set; }

        // 试算期次还款计划结果
        [NameInMap("repay_result_list")]
        [Validation(Required=false)]
        public List<RepayResult> RepayResultList { get; set; }

    }

}
