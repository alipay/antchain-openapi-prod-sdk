// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETINGAGENT.Models
{
    public class GetComsumeJdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 券ID
        [NameInMap("coupon_id")]
        [Validation(Required=true)]
        public string CouponId { get; set; }

        // 券状态
        // UNUSED_=未使用
        // _USED_ 已使用
        // _EXPIRED_ 过期
        [NameInMap("prize_status")]
        [Validation(Required=true)]
        public string PrizeStatus { get; set; }

        // 使用时间
        // 时间格式“yyyy-mm-dd
        // hh:mm:ss”
        [NameInMap("consume_time")]
        [Validation(Required=false)]
        public string ConsumeTime { get; set; }

        // 回传类型
        // _1_-实时 ‘_2_-批量
        [NameInMap("write_off_type")]
        [Validation(Required=true)]
        public long? WriteOffType { get; set; }

        // 银行流水号
        [NameInMap("bank_flow_no")]
        [Validation(Required=false)]
        public string BankFlowNo { get; set; }

        // 交易订单号
        [NameInMap("transaction_id")]
        [Validation(Required=false)]
        public string TransactionId { get; set; }

        // 交易金额(分)
        [NameInMap("trade_amount")]
        [Validation(Required=false)]
        public long? TradeAmount { get; set; }

        // 消耗商户号（本期不传）
        [NameInMap("merchant_no")]
        [Validation(Required=false)]
        public string MerchantNo { get; set; }

    }

}
