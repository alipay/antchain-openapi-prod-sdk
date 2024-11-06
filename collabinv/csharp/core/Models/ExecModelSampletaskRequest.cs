// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class ExecModelSampletaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 样本批次号，唯一，建议：租户code+时间戳
        [NameInMap("sample_code")]
        [Validation(Required=true)]
        public string SampleCode { get; set; }

        // 特征集编码或模型编码，依据类型使用
        [NameInMap("task_code")]
        [Validation(Required=true)]
        public string TaskCode { get; set; }

        // 任务类型：特征集 FEATURESET、模型分 MODEL
        [NameInMap("task_type")]
        [Validation(Required=true)]
        public string TaskType { get; set; }

        // 本次事件序号编码
        [NameInMap("sample_task_code")]
        [Validation(Required=true)]
        public string SampleTaskCode { get; set; }

    }

}
