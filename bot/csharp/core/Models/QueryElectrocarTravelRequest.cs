// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarTravelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // iffaa 硬件唯一ID
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 行程数据查询模式
        [NameInMap("trip_data_model")]
        [Validation(Required=true)]
        public long? TripDataModel { get; set; }

        // 注：trip_data_model = 3 必传
        [NameInMap("trip_id")]
        [Validation(Required=false)]
        public string TripId { get; set; }

        // 时间范围
        // 注：trip_data_model = 3 不需要传
        [NameInMap("time_range")]
        [Validation(Required=false)]
        public string TimeRange { get; set; }

    }

}
