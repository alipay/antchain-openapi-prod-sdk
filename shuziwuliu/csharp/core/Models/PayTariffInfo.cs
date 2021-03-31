// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 应付资费项
    public class PayTariffInfo : TeaModel {
        // 托运单号 [业务必填]
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 应付资费项code [业务必填]
        // 
        // 
        [NameInMap("pay_tariff_code")]
        [Validation(Required=false)]
        public string PayTariffCode { get; set; }

        // 应付资费项项目 [业务必填]
        // 
        // 
        [NameInMap("pay_tariff_project")]
        [Validation(Required=false)]
        public string PayTariffProject { get; set; }

        // 资费项中文描述 [业务必填]
        // 
        // 
        [NameInMap("pay_tariff_desc")]
        [Validation(Required=false)]
        public string PayTariffDesc { get; set; }

        // 币种 [业务必填]
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 资费项含税价 [业务必填]
        // 
        // 
        [NameInMap("price_including_tax")]
        [Validation(Required=false)]
        public string PriceIncludingTax { get; set; }

        // 订舱单唯一性标识 [业务必填]
        [NameInMap("booking_no")]
        [Validation(Required=false)]
        public string BookingNo { get; set; }

        // 订舱单 [业务必填]
        [NameInMap("bkg_no")]
        [Validation(Required=false)]
        public string BkgNo { get; set; }

    }

}
