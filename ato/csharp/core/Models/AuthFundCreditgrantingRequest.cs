// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class AuthFundCreditgrantingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 授权id
        [NameInMap("auth_id")]
        [Validation(Required=true)]
        public string AuthId { get; set; }

        // 授权开始时间，格式为yyyy-MM-dd
        [NameInMap("auth_begin_time")]
        [Validation(Required=true)]
        public string AuthBeginTime { get; set; }

        // 授权结束时间，格式为yyyy-MM-dd
        [NameInMap("auth_end_time")]
        [Validation(Required=true)]
        public string AuthEndTime { get; set; }

        // 订单查询开始时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_begin_time之后。
        [NameInMap("order_query_begin")]
        [Validation(Required=true)]
        public string OrderQueryBegin { get; set; }

        // 订单查询结束时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_end_time之前
        [NameInMap("order_query_end")]
        [Validation(Required=true)]
        public string OrderQueryEnd { get; set; }

    }

}
