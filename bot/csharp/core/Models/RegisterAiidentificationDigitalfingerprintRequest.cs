// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class RegisterAiidentificationDigitalfingerprintRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户身份标识
        [NameInMap("app_key")]
        [Validation(Required=true)]
        public string AppKey { get; set; }

        // 商品数字指纹信息
        [NameInMap("goods_info")]
        [Validation(Required=true)]
        public GoodsDigitalFingerprintInfo GoodsInfo { get; set; }

    }

}
