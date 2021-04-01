// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryTraceabilityTxCheckRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接入业务标识，一接入方有条链或者必须区分统计业务类型情况下必填。
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 溯源信息内容校验码用sha256hex(内容) 计算出其正确性。
        [NameInMap("payload_hash")]
        [Validation(Required=false)]
        public string PayloadHash { get; set; }

        // 区块链接入来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 区块查证信息透传
        [NameInMap("sub_title")]
        [Validation(Required=false)]
        public string SubTitle { get; set; }

        // 透传到查证结果的标题信息
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 要查询的区块链交易信息。
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
