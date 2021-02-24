// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCrowdriskDetailRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业ID
        [NameInMap("company_id")]
        [Validation(Required=false)]
        public string CompanyId { get; set; }

        // 所在地的名称
        [NameInMap("place_name")]
        [Validation(Required=false)]
        public string PlaceName { get; set; }

        // 地区类型
        [NameInMap("place_type")]
        [Validation(Required=false)]
        public string PlaceType { get; set; }

    }

}
