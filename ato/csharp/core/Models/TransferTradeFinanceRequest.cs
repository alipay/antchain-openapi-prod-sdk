// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class TransferTradeFinanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 公司社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 待预审资方列表
        [NameInMap("fund_id_list")]
        [Validation(Required=true)]
        public List<string> FundIdList { get; set; }

        // 融资签署模式
        [NameInMap("fund_sign_mode")]
        [Validation(Required=true)]
        public string FundSignMode { get; set; }

        // 商户分账起始期数
        [NameInMap("divide_start_term_index")]
        [Validation(Required=true)]
        public long? DivideStartTermIndex { get; set; }

        // 融资模式
        [NameInMap("fund_mode")]
        [Validation(Required=false)]
        public string FundMode { get; set; }

    }

}
