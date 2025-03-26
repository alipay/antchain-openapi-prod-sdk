// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class ApplyGuardTextbaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        [NameInMap("data_id1")]
        [Validation(Required=true)]
        public string DataId1 { get; set; }

        // 	
        // 标识上游应用来源，字符串长度不能超过 128
        [NameInMap("app_code")]
        [Validation(Required=false)]
        public string AppCode { get; set; }

        // 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        [NameInMap("business_id")]
        [Validation(Required=false)]
        public string BusinessId { get; set; }

    }

}
