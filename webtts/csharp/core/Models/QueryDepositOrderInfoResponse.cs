// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    // 查询deposit订单响应体
    public class QueryDepositOrderInfoResponse : TeaModel {
        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单类型
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // 区块链名称
        [NameInMap("blockchain")]
        [Validation(Required=true)]
        public string Blockchain { get; set; }

        // 代币名称
        [NameInMap("token_symbol")]
        [Validation(Required=true)]
        public string TokenSymbol { get; set; }

        // deposit数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // deposit交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 交易发起地址，为白名单地址
        [NameInMap("from_address")]
        [Validation(Required=true)]
        public string FromAddress { get; set; }

        // 交易接收地址，为托管钱包地址
        [NameInMap("to_address")]
        [Validation(Required=true)]
        public string ToAddress { get; set; }

        // 订单创建时间
        [NameInMap("create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // 订单状态
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 订单备注
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

    }

}
