// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class ApplyGuardImagebaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 场景，固定填写：BASE_IMAGE_SEC
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 数据Id，调用方入审数据的唯一Id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 标识上游应用来源，字符串长度不能超过 128
        [NameInMap("app_code")]
        [Validation(Required=false)]
        public string AppCode { get; set; }

        // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        [NameInMap("business_id")]
        [Validation(Required=false)]
        public string BusinessId { get; set; }

    }

}
