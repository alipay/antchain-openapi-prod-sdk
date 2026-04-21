// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class QueryPromotionCouponRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 活动ID
        [NameInMap("activity_id")]
        [Validation(Required=true)]
        public string ActivityId { get; set; }

        // openId
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 开始日期
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public string StartDate { get; set; }

        // 结束日期
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

        // 页码，默认 1，最小值 1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页数量，默认 20，范围 1~100
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
