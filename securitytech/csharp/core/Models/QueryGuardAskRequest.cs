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

        // 大模型提问护栏服务, 用于区分提供的服务类别，当前支持：TJ_QUESTION_BASIC、TJ_ANSWER_BASIC 两种
        [NameInMap("service_name")]
        [Validation(Required=true, MaxLength=128)]
        public string ServiceName { get; set; }

        // 当前提问内容，最大长度10000个字符。
        [NameInMap("question")]
        [Validation(Required=true, MaxLength=10000)]
        public string Question { get; set; }

        // 用户ID，用于主体风险判断，如果是2088开头的阿里体系用户，请传入2088开头的用户ID
        [NameInMap("user_id")]
        [Validation(Required=true, MaxLength=32)]
        public string UserId { get; set; }

        // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
        [NameInMap("question_format")]
        [Validation(Required=false, MaxLength=32)]
        public string QuestionFormat { get; set; }

        // 大模型ID，表示大模型版本
        [NameInMap("model_code")]
        [Validation(Required=false, MaxLength=128)]
        public string ModelCode { get; set; }

        // 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为： aigcType： ● 文生文：text_text ● 文生图：text_pic ● 图生文：pic_text ● 图生图：pic_pic serviceScene: 根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 比如领域： serviceScene = insurance 表示保险 serviceScene = medical 表示医疗 serviceScene = government 表示政务 比如业务活动应用： serviceScene = xiacu 表示夏促 serviceScene = qixi 表示七夕 triggerSource: 不同的来源，比如移动端、web端、API
        [NameInMap("business_properties")]
        [Validation(Required=false)]
        public KeyValueMap BusinessProperties { get; set; }

        // scene_code
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // serviceCode
        [NameInMap("service_code")]
        [Validation(Required=false)]
        public string ServiceCode { get; set; }

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
