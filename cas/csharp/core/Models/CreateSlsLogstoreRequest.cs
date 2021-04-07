// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateSlsLogstoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 日志库名称，在Project下必须唯一
        [NameInMap("logstore_name")]
        [Validation(Required=true)]
        public string LogstoreName { get; set; }

        // 日志项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 区域id
        [NameInMap("sls_region_id")]
        [Validation(Required=false)]
        public string SlsRegionId { get; set; }

        // Shard个数，单位为个，范围为1~100
        [NameInMap("shard_count")]
        [Validation(Required=true)]
        public long? ShardCount { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 数据的保存时间，单位为天，范围1~3600。
        [NameInMap("ttl")]
        [Validation(Required=true)]
        public long? Ttl { get; set; }

        // 是否添加索引
        [NameInMap("add_index")]
        [Validation(Required=false)]
        public bool? AddIndex { get; set; }

    }

}
