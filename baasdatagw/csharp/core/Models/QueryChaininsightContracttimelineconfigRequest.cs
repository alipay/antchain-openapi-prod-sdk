// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class QueryChaininsightContracttimelineconfigRequest : TeaModel {
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

        // 链上地址：合约 / 存证账户
        [NameInMap("hex_address")]
        [Validation(Required=true)]
        public string HexAddress { get; set; }

        // 需要更新的区块高度（会更新生效区间包含该高度的时间轴配置）
        [NameInMap("ver")]
        [Validation(Required=true)]
        public string Ver { get; set; }

    }

}
