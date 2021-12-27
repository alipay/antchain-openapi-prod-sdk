// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCrowdriskSumRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 指定的企业ID列表，企业ID数量不超过100个。
        [NameInMap("company_ids")]
        [Validation(Required=true)]
        public List<string> CompanyIds { get; set; }

        // 指定的地区名称，例如温州市、鹿城区等
        [NameInMap("place_name")]
        [Validation(Required=true)]
        public string PlaceName { get; set; }

        // 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
        [NameInMap("place_type")]
        [Validation(Required=true)]
        public string PlaceType { get; set; }

    }

}
