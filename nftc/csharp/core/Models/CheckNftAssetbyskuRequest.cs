// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class CheckNftAssetbyskuRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 鲸探用户ID标识，OpenApi场景使用的加密格式
        [NameInMap("open_user_id")]
        [Validation(Required=true)]
        public string OpenUserId { get; set; }

        // 数字藏品类标识ID
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public long? SkuId { get; set; }

    }

}
