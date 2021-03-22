// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 接口白名单信息
    public class APIWhiteListInfo : TeaModel {
        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 权限级别，暂时不用
        [NameInMap("level")]
        [Validation(Required=true)]
        public long? Level { get; set; }

        // 更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

        // 扩展字段
        [NameInMap("extension")]
        [Validation(Required=true)]
        public string Extension { get; set; }

    }

}
