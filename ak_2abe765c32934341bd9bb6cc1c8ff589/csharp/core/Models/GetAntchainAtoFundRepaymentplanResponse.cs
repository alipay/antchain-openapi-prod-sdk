// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class GetAntchainAtoFundRepaymentplanResponse : TeaModel {
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

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 租赁公司支付宝UID
        [NameInMap("lease_alipay_uid")]
        [Validation(Required=false)]
        public string LeaseAlipayUid { get; set; }

        // 宽限期，天
        [NameInMap("grace_period_days")]
        [Validation(Required=false)]
        public long? GracePeriodDays { get; set; }

        // 还款策略列表
        [NameInMap("repay_strategy_list")]
        [Validation(Required=false)]
        public string RepayStrategyList { get; set; }

        // 处罚策略
        //  NONE : 没有处罚
        //  PENALTY_FEE： 罚息
        [NameInMap("punishment_type")]
        [Validation(Required=false)]
        public string PunishmentType { get; set; }

        // 租期
        [NameInMap("pay_period")]
        [Validation(Required=false)]
        public long? PayPeriod { get; set; }

    }

}
