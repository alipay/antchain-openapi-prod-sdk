// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCompanyRiskinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户access key
        [NameInMap("ak")]
        [Validation(Required=true)]
        public string Ak { get; set; }

        // 业务场景 ""
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 预留字段
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 区域中文名称
        [NameInMap("place_name")]
        [Validation(Required=true)]
        public string PlaceName { get; set; }

        // 区域类型
        [NameInMap("place_type")]
        [Validation(Required=true)]
        public string PlaceType { get; set; }

        // 租户seceret key
        [NameInMap("sk")]
        [Validation(Required=true)]
        public string Sk { get; set; }

    }

}
