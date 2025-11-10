// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryTdisaasairSecurityPolicyResponse : TeaModel {
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

        // 场景分
        [NameInMap("model_details")]
        [Validation(Required=false)]
        public List<ModelDetails> ModelDetails { get; set; }

        // 安全请求id
        // 
        [NameInMap("security_id")]
        [Validation(Required=false)]
        public string SecurityId { get; set; }

        // 策略结果
        // 
        [NameInMap("security_result")]
        [Validation(Required=false)]
        public string SecurityResult { get; set; }

        // 策略结果详情
        // 
        [NameInMap("strategy_details")]
        [Validation(Required=false)]
        public List<StrategyDetails> StrategyDetails { get; set; }

        // 决策流信息
        // 
        [NameInMap("df_scene_infos")]
        [Validation(Required=false)]
        public List<DfSceneInfos> DfSceneInfos { get; set; }

    }

}
