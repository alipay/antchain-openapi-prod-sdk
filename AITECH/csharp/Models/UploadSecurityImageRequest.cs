// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UploadSecurityImageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 直传或 PDF 逐页转图片
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 归一化后须 image 前缀，否则拒绝
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

    }

}
