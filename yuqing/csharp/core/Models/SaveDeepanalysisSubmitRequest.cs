// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class SaveDeepanalysisSubmitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 深度分析类型
        [NameInMap("tool_type")]
        [Validation(Required=true)]
        public string ToolType { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 深度分析配置
        [NameInMap("config")]
        [Validation(Required=true)]
        public AnalysisConfig Config { get; set; }

    }

}
