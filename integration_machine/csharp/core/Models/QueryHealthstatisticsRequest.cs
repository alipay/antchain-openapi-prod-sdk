// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    public class QueryHealthstatisticsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 开始日期
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 结束日期(为空或等于开始日期时为查询当天,时间范围最大可查询100天)
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

        // 统计类型(通行人数统计：PERSON，通行次数统计：NUMBER)
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
