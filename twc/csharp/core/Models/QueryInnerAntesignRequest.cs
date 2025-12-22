// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryInnerAntesignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户信息
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 业务线
        [NameInMap("business_line_code")]
        [Validation(Required=false)]
        public string BusinessLineCode { get; set; }

        // 场景值
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // 签署合同id 传值默认查询签署流程下全部任务状态
        [NameInMap("sign_flow_id")]
        [Validation(Required=true)]
        public string SignFlowId { get; set; }

        // 签署任务创建id 默认查signTaskId 单任务状态
        [NameInMap("sign_task_id")]
        [Validation(Required=false)]
        public string SignTaskId { get; set; }

        // 应用方来源信息
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 业务流水号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

    }

}
