// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 资金操作明细查询结果
    public class FundItemQueryResult : TeaModel {
        // 会员所属业务平台在智能科技的会员ID
        [NameInMap("platform_member_id")]
        [Validation(Required=true)]
        public string PlatformMemberId { get; set; }

        // 外部业务平台原始交易号
        [NameInMap("out_order_id")]
        [Validation(Required=true)]
        public string OutOrderId { get; set; }

        // 外部请求ID
        // 
        [NameInMap("out_request_id")]
        [Validation(Required=false)]
        public string OutRequestId { get; set; }

        // 资金操作类型。CAPTURE(请款);CANCEL(撤销/退款);
        [NameInMap("fund_type")]
        [Validation(Required=true)]
        public string FundType { get; set; }

        // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 本次请求金额，单位为元。
        [NameInMap("request_amount")]
        [Validation(Required=false)]
        public long? RequestAmount { get; set; }

        // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
        [NameInMap("request_currency")]
        [Validation(Required=false)]
        public string RequestCurrency { get; set; }

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
