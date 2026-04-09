// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ListDigitalkeyRentaltripRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备TUID
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 时间维度：DAY（日）、WEEK（周）、MONTH（月）
        [NameInMap("time_dimension")]
        [Validation(Required=true)]
        public string TimeDimension { get; set; }

        // 时间值（格式根据维度）
        [NameInMap("time_value")]
        [Validation(Required=true)]
        public string TimeValue { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
