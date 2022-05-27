// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ApplyIpCodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // IP商家的链上账户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 套餐交易/授权交易的订单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 申请数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 占用预申请的起始编码--仅使用码池时有效
        [NameInMap("start_index")]
        [Validation(Required=false)]
        public long? StartIndex { get; set; }

        // 占用预申请的截止编码--仅使用码池时有效
        [NameInMap("end_index")]
        [Validation(Required=false)]
        public long? EndIndex { get; set; }

    }

}
