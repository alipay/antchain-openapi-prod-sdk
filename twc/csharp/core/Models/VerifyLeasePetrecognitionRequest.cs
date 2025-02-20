// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class VerifyLeasePetrecognitionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 算法服务
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 算法功能
        [NameInMap("uri")]
        [Validation(Required=true)]
        public string Uri { get; set; }

        // 来源系统
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 宠物图片url
        [NameInMap("image_url")]
        [Validation(Required=true)]
        public string ImageUrl { get; set; }

        // 额外参数
        [NameInMap("ext")]
        [Validation(Required=true)]
        public string Ext { get; set; }

    }

}
