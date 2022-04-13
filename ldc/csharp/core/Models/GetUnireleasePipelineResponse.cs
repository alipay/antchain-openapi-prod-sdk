// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetUnireleasePipelineResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // pipeline ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 解决方案ID
        [NameInMap("solution_id")]
        [Validation(Required=false)]
        public string SolutionId { get; set; }

        // 发布单状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 应用发布状态
        [NameInMap("tenant_pipelines")]
        [Validation(Required=false)]
        public List<TenantAppReleasePipeline> TenantPipelines { get; set; }

    }

}
