// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 正版码流转信息
    public class IPCodeFlowInfo : TeaModel {
        // 拥有用户名称，收藏人
        [NameInMap("code_owner_name")]
        [Validation(Required=false)]
        public string CodeOwnerName { get; set; }

        // 收藏时间
        [NameInMap("code_collect_time")]
        [Validation(Required=false)]
        public long? CodeCollectTime { get; set; }

        // 收藏交易哈希
        [NameInMap("code_trans_hash")]
        [Validation(Required=false)]
        public string CodeTransHash { get; set; }

    }

}
