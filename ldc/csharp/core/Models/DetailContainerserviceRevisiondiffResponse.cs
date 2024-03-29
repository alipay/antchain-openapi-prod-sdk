// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class DetailContainerserviceRevisiondiffResponse : TeaModel {
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

        // 源版本配置详情
        [NameInMap("source_config")]
        [Validation(Required=false)]
        public ContainerServiceConfig SourceConfig { get; set; }

        // 源版本号
        [NameInMap("source_revision")]
        [Validation(Required=false)]
        public string SourceRevision { get; set; }

        // 目标版本配置详情
        [NameInMap("target_config")]
        [Validation(Required=false)]
        public ContainerServiceConfig TargetConfig { get; set; }

        // 目标版本号
        [NameInMap("target_revision")]
        [Validation(Required=false)]
        public string TargetRevision { get; set; }

        // 摘要信息
        [NameInMap("summary")]
        [Validation(Required=false)]
        public string Summary { get; set; }

        // diff详情，JSON数组字符串
        [NameInMap("diff_detail")]
        [Validation(Required=false)]
        public string DiffDetail { get; set; }

        // 风险等级: ORDINARY-一般、HIGH-高危	
        [NameInMap("risk_level")]
        [Validation(Required=false)]
        public string RiskLevel { get; set; }

    }

}
