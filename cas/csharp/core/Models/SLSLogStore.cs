// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 阿里云日志服务(SLS)-日志库
    public class SLSLogStore : TeaModel {
        // 日志库名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // Shard个数，单位为个，范围为1~100。
        [NameInMap("shard_count")]
        [Validation(Required=true)]
        public long? ShardCount { get; set; }

        // 数据的保存时间，单位为天，范围1~3600。
        [NameInMap("ttl")]
        [Validation(Required=true)]
        public long? Ttl { get; set; }

    }

}
