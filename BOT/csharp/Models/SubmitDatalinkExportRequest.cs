// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SubmitDatalinkExportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源类型
        [NameInMap("config_type")]
        [Validation(Required=true)]
        public string ConfigType { get; set; }

        // 数据源别称
        [NameInMap("alias")]
        [Validation(Required=true)]
        public string Alias { get; set; }

        // 执行SQL
        [NameInMap("sql")]
        [Validation(Required=true)]
        public string Sql { get; set; }

        // 执行任务Id
        [NameInMap("export_job_id")]
        [Validation(Required=true)]
        public string ExportJobId { get; set; }

        // 返回最大条数
        [NameInMap("row_limit")]
        [Validation(Required=true)]
        public long? RowLimit { get; set; }

        // 请求调用方原始租户ID
        [NameInMap("source_tenant_id")]
        [Validation(Required=true)]
        public string SourceTenantId { get; set; }

    }

}
