// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class QueryNftAssetbyskuRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 具体用户Id标识，支持不同类型的id标识，根据toIdType不同而不同
        [NameInMap("id_no")]
        [Validation(Required=true)]
        public string IdNo { get; set; }

        // 参照idType枚举，支持手机号/openUserId
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 数字藏品类标识ID
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

        // 页码，从1开始
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 分页大小-上限10
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
