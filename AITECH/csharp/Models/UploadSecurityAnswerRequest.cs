// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UploadSecurityAnswerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // txt和pdf 文件
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 须 answer 前缀，否则兜底 LLM_OUTPUT_DETECTION_LITE
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 租户标识
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 企业标识
        [NameInMap("enterprise")]
        [Validation(Required=false)]
        public string Enterprise { get; set; }

        // 访问控制维度
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 消息 ID
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 流式消息 ID
        [NameInMap("flow_msg_id")]
        [Validation(Required=false)]
        public string FlowMsgId { get; set; }

        // 流式检测开关
        [NameInMap("flow_detect")]
        [Validation(Required=false)]
        public string FlowDetect { get; set; }

        // 流结束标记
        [NameInMap("flow_end")]
        [Validation(Required=false)]
        public string FlowEnd { get; set; }

    }

}
