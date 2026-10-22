// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityAnswerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用标示
        [NameInMap("enterprise")]
        [Validation(Required=false)]
        public string Enterprise { get; set; }

        // 细分调用方标识
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 当前回答内容，最大长度40000个字符
        [NameInMap("content")]
        [Validation(Required=true, MaxLength=40000)]
        public string Content { get; set; }

        // 场景code
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 是否开启流式检测功能。默认值：N：不开启，Y：开启
        [NameInMap("flow_detect")]
        [Validation(Required=false)]
        public string FlowDetect { get; set; }

        // 会话id
        [NameInMap("flow_msg_id")]
        [Validation(Required=false)]
        public string FlowMsgId { get; set; }

        // 流失内容结束标示
        [NameInMap("flow_end")]
        [Validation(Required=false)]
        public string FlowEnd { get; set; }

        // 表示是同一个Q&A
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启，Y：开启
        [NameInMap("privacy_data_obfuscation")]
        [Validation(Required=false)]
        public string PrivacyDataObfuscation { get; set; }

        // 是否开启隐私数据泄露的专项检测（新字段，老privacy废弃）
        [NameInMap("privacy_data_detection")]
        [Validation(Required=false)]
        public string PrivacyDataDetection { get; set; }

    }

}
