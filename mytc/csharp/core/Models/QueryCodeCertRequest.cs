// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class QueryCodeCertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型，客户自定义标签，做code数据隔离使用
        [NameInMap("biz_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizType { get; set; }

        // 区块链上交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true, MaxLength=64)]
        public string TxHash { get; set; }

        // 是否展示交易具体内容，默认false
        [NameInMap("content_flag")]
        [Validation(Required=false)]
        public bool? ContentFlag { get; set; }

    }

}
