// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class ExecFaceauthAlgorithmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 渠道
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // base64图片
        [NameInMap("img_str")]
        [Validation(Required=true)]
        public string ImgStr { get; set; }

        // Pano类型
        [NameInMap("img_type")]
        [Validation(Required=true)]
        public string ImgType { get; set; }

        // 场景
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

    }

}
