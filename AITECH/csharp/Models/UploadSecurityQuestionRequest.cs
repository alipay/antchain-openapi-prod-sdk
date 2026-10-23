// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UploadSecurityQuestionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // txt/pdf 文件，解析为文本（FileParseUtil），空内容报「文件内容为空」
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 归一化后须 question 前缀，否则兜底 LLM_INPUT_DETECTION
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 租户标识（老值兼容替换）
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

        // 多轮会话 ID
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 多轮检测开关
        [NameInMap("multi_session_detect")]
        [Validation(Required=false)]
        public string MultiSessionDetect { get; set; }

        // 安全改写开关
        [NameInMap("prompt_reword")]
        [Validation(Required=false)]
        public string PromptReword { get; set; }

        // 安全代答开关
        [NameInMap("security_answer")]
        [Validation(Required=false)]
        public string SecurityAnswer { get; set; }

        // 领域识别开关
        [NameInMap("field_identify")]
        [Validation(Required=false)]
        public string FieldIdentify { get; set; }

    }

}
