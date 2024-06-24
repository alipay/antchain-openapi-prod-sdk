// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class UploadAntchainAtoMerchantexpandFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件名称 包含后缀
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账 
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

    }

}
