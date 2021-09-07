// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class CreateLeagueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 酒证:WINE_ASSET,茶证:TEA_ASSET,艺术物证:ARTISTIC_ASSET
        [NameInMap("scene_type")]
        [Validation(Required=true)]
        public string SceneType { get; set; }

        // 联盟名称
        [NameInMap("league_name")]
        [Validation(Required=true)]
        public string LeagueName { get; set; }

        // 黄酒集市
        [NameInMap("scene_desc")]
        [Validation(Required=false)]
        public string SceneDesc { get; set; }

    }

}
