// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class ExecAuthenticationCustomerFaceabilityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // extract(提取特征)、sex(检测性别)、rect(人脸矩形框识别)
        [NameInMap("ability")]
        [Validation(Required=true)]
        public string Ability { get; set; }

        // 算法版本
        [NameInMap("alg_ver")]
        [Validation(Required=true)]
        public string AlgVer { get; set; }

        // 图片encode base64 String
        [NameInMap("auth_img")]
        [Validation(Required=true)]
        public string AuthImg { get; set; }

        // 业务接入方生成，唯一ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
