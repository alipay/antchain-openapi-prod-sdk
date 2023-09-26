// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class QueryChaininsightAddresshistogramrxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 地址
        [NameInMap("hex_address")]
        [Validation(Required=true)]
        public string HexAddress { get; set; }

        // 开始时间戳，毫秒
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 结束时间戳，毫秒
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
