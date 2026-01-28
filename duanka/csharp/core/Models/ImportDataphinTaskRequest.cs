// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class ImportDataphinTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // projectTaskPath项目任务地址
        [NameInMap("project_task_path")]
        [Validation(Required=true)]
        public string ProjectTaskPath { get; set; }

        // tenantId租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // dt=20240226
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // sql
        [NameInMap("sql")]
        [Validation(Required=true)]
        public string Sql { get; set; }

    }

}
