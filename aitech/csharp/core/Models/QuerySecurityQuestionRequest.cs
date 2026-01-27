// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityQuestionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方唯一标示
        [NameInMap("enterprise")]
        [Validation(Required=false)]
        public string Enterprise { get; set; }

        // 提问内容
        [NameInMap("question")]
        [Validation(Required=true, MaxLength=10000)]
        public string Question { get; set; }

        // 调用方标示
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 场景code
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 标示是否是同一个Q&A
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 是否开启流式检测功能。默认值：N：不开启，Y：开启
        [NameInMap("multi_session_detect")]
        [Validation(Required=false)]
        public string MultiSessionDetect { get; set; }

        // 是否开启针对大模型输入文本的的安全改写和增强功能。默认值：N：不开启，Y：开启
        [NameInMap("prompt_reword")]
        [Validation(Required=false)]
        public string PromptReword { get; set; }

        // 是否需要针对提问内容的进行金融合规检测。默认值：N：不开启，Y：开启
        [NameInMap("finance_compliance_detection")]
        [Validation(Required=false)]
        public string FinanceComplianceDetection { get; set; }

        // 是否需要针对提问内容的进行领域识别
        [NameInMap("field_identify")]
        [Validation(Required=true)]
        public string FieldIdentify { get; set; }

        // 是否开启提示词攻击防御功能
        [NameInMap("prompt_attack_defense")]
        [Validation(Required=false)]
        public string PromptAttackDefense { get; set; }

        // 是否开启隐私数据泄露的专项检测
        [NameInMap("privacy_data_detection")]
        [Validation(Required=false)]
        public string PrivacyDataDetection { get; set; }

    }

}
