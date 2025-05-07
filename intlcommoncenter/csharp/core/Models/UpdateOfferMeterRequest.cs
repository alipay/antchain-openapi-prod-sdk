// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTLCOMMONCENTER.Models
{
    public class UpdateOfferMeterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 国际商品内部编码
        [NameInMap("offer_code")]
        [Validation(Required=true)]
        public string OfferCode { get; set; }

        // 计量对接状态，FINISH标识以完成计量对接
        [NameInMap("meter_access_status")]
        [Validation(Required=true)]
        public string MeterAccessStatus { get; set; }

    }

}
