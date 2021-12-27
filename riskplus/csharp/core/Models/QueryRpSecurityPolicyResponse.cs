// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRpSecurityPolicyResponse : TeaModel {
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

        // 模型结果详情
        // 
        [NameInMap("model_details")]
        [Validation(Required=false)]
        public List<ModelDetails> ModelDetails { get; set; }

        // 反馈成功之后的id
        [NameInMap("security_id")]
        [Validation(Required=false)]
        public string SecurityId { get; set; }

        // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
        [NameInMap("security_result")]
        [Validation(Required=false)]
        public string SecurityResult { get; set; }

        // 策略结果详情
        // 
        [NameInMap("strategy_details")]
        [Validation(Required=false)]
        public List<StrategyDetails> StrategyDetails { get; set; }

        // 决策流信息
        [NameInMap("df_scene_infos")]
        [Validation(Required=false)]
        public DfSceneInfos DfSceneInfos { get; set; }

    }

}
