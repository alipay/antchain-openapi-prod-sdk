// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models
{
    public class CreateBaasUnionUnionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟描述
        [NameInMap("consortium_description")]
        [Validation(Required=false)]
        public string ConsortiumDescription { get; set; }

        // 联盟名称
        [NameInMap("consortium_name")]
        [Validation(Required=true)]
        public string ConsortiumName { get; set; }

        // 区域信息
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

    }

}
