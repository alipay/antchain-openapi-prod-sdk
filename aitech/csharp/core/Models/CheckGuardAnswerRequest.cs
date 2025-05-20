// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class CheckGuardAnswerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方标识
        [NameInMap("app_code")]
        [Validation(Required=true)]
        public string AppCode { get; set; }

        // 细分调用方标识，可与 appCode 传相同值
        [NameInMap("business_id")]
        [Validation(Required=false)]
        public string BusinessId { get; set; }

        // 文本内容，最大5000字符长度
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 场景code：
        // ● llm_output_detection：大模型输出通用场景
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 是否开启流式检测功能。默认值：N：不开启
        // Y：开启
        // N：不开启
        [NameInMap("flow_detect")]
        [Validation(Required=false)]
        public string FlowDetect { get; set; }

        // 会话ID，标记本次请求内容属于同一段流式内容，文本审核引擎会自动拼接后进行审核，拼接文字片段后不超过10000字的部分
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 是否要针对大模型输出的CoT、回答进行代答/改写。默认值：N：不开启
        // Y：开启
        // N：不开启
        [NameInMap("reply_proxy")]
        [Validation(Required=false)]
        public string ReplyProxy { get; set; }

        // 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启
        // Y：开启
        // N：不开启
        [NameInMap("privacy_data_obfuscation")]
        [Validation(Required=false)]
        public string PrivacyDataObfuscation { get; set; }

    }

}
