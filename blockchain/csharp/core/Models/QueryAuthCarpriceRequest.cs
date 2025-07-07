// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthCarpriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 车型id
        [NameInMap("car_id")]
        [Validation(Required=false)]
        public string CarId { get; set; }

        // 车系id
        [NameInMap("series_id")]
        [Validation(Required=false)]
        public string SeriesId { get; set; }

        // 城市code
        [NameInMap("city_code")]
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
