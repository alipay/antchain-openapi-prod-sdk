// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class ApplyGuardImagemultiplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景，固定填写：SCENE_MULTIPLY_IMAGE_SEC
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 数据Id，调用方入审数据的唯一Id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 鉴定图片内容链接，url 和 content 参数二选一
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 标识上游应用来源，字符串长度不能超过 128
        [NameInMap("app_code")]
        [Validation(Required=false)]
        public string AppCode { get; set; }

        // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线...
        [NameInMap("business_id")]
        [Validation(Required=false)]
        public string BusinessId { get; set; }

        // 鉴定图片 base64 地址，url 和 content 参数二选一
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
