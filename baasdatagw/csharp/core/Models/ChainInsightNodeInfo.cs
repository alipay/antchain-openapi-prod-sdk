// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 区块链节点信息
    public class ChainInsightNodeInfo : TeaModel {
        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 节点名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 节点IP
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 节点当前区块高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 节点状态，ok, fail
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
