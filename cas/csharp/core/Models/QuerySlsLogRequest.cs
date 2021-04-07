// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QuerySlsLogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 查询开始时间点（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
        [NameInMap("from")]
        [Validation(Required=true)]
        public long? From { get; set; }

        // 请求返回的最大日志条数。取值范围为 0~100，默认值为 100。
        [NameInMap("line")]
        [Validation(Required=false)]
        public long? Line { get; set; }

        // 需要查询日志的 Logstore 名称。
        [NameInMap("logstore_name")]
        [Validation(Required=true)]
        public string LogstoreName { get; set; }

        // 请求返回日志的起始点。取值范围为 0 或正整数，默认值为 0。
        [NameInMap("offset")]
        [Validation(Required=false)]
        public long? Offset { get; set; }

        // 日志项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 查询表达式。关于查询表达式的详细语法，请参见 。
        [NameInMap("query")]
        [Validation(Required=false)]
        public string Query { get; set; }

        // 区域id
        [NameInMap("sls_region_id")]
        [Validation(Required=false)]
        public string SlsRegionId { get; set; }

        // 是否按日志时间戳逆序返回日志，精确到分钟级别。true 表示逆序，false 表示顺序，默认值为 false。
        [NameInMap("reverse")]
        [Validation(Required=false)]
        public bool? Reverse { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 查询结束时间点（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
        [NameInMap("to")]
        [Validation(Required=true)]
        public long? To { get; set; }

        // 查询日志主题。
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // 查询 Logstore 数据的类型。在 GetLogs 接口中该参数必须为 log。
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
