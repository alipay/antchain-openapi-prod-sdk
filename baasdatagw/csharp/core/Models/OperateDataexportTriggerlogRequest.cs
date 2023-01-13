// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class OperateDataexportTriggerlogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // biz_id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 导出任务ID
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 操作
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 导出任务日志ID列表
        [NameInMap("logs")]
        [Validation(Required=true)]
        public List<string> Logs { get; set; }

    }

}
