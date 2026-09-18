// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryGuardAskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 会话ID，用于匹配多轮对话上下文
        [NameInMap("session_id")]
        [Validation(Required=true, MaxLength=128)]
        public string SessionId { get; set; }

        // 数据唯一标识，能够根据该值定位到该条数据
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=64)]
        public string RequestId { get; set; }

        // serviceCode
        [NameInMap("service_code")]
        [Validation(Required=true)]
        public string ServiceCode { get; set; }

        // 当前提问内容，最大长度10000个字符。
        [NameInMap("question")]
        [Validation(Required=true, MaxLength=10000)]
        public string Question { get; set; }

        // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
        [NameInMap("question_format")]
        [Validation(Required=false, MaxLength=32)]
        public string QuestionFormat { get; set; }

        // scene_code
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // app_code
        [NameInMap("app_code")]
        [Validation(Required=false)]
        public string AppCode { get; set; }

        // raas_products
        [NameInMap("raas_products")]
        [Validation(Required=false)]
        public string RaasProducts { get; set; }

    }

}
