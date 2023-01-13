// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class ListChaininsightStatisticRequest : TeaModel {
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

        // 统计类型，ContractStatistic：合约性能检测指标
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 合约地址
        [NameInMap("hex_address")]
        [Validation(Required=false)]
        public string HexAddress { get; set; }

    }

}
