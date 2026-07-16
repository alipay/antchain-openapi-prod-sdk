// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class RedeemInnerFundmngmerchantperformanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 融资单的资方社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 订单所属商户的社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 赎回方式
        // 
        // ONLINE("ONLINE", "线上"),
        // OFFLINE("OFFLINE", "线下"),;
        [NameInMap("redeem_way")]
        [Validation(Required=true)]
        public string RedeemWay { get; set; }

        // 赎回原因
        // ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
        // RENTING_OUT_REDEEM("RENTING_OUT_REDEEM", "退租赎回"),
        // RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
        //                                                                            "租转售赎回");
        [NameInMap("redeem_reason")]
        [Validation(Required=true)]
        public string RedeemReason { get; set; }

        // 赎回金额,单位为分,取消并赎回时必填
        [NameInMap("redeem_amount")]
        [Validation(Required=false)]
        public long? RedeemAmount { get; set; }

        // 赎回类型，为空默认为 TRANSFER 
        // 转账代偿：TRANSFER 
        // 代扣代偿：WITHHOLD
        [NameInMap("redeem_type")]
        [Validation(Required=false)]
        public string RedeemType { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

    }

}
