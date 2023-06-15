// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class QueryResourceImageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // access_token
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

        // 素材的类型（AIGC/NFT）
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 资源ID
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // type为NFT必填
        [NameInMap("nft_id")]
        [Validation(Required=false)]
        public string NftId { get; set; }

        // 是否需要高清图
        [NameInMap("need_hd_img")]
        [Validation(Required=true)]
        public bool? NeedHdImg { get; set; }

    }

}
