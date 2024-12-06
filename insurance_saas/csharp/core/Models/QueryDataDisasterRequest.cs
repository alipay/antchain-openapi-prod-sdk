// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryDataDisasterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 行政区域代码
        [NameInMap("area_code")]
        [Validation(Required=true)]
        public string AreaCode { get; set; }

        // 灾害类型：df:⼤⻛，by:暴⾬，xz:雪灾
        [NameInMap("disaster_type")]
        [Validation(Required=true)]
        public string DisasterType { get; set; }

        // 查询起始日期
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 查询截止日期
        [NameInMap("end_date")]
        [Validation(Required=true)]
        public string EndDate { get; set; }

    }

}
