// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 应收资费项
    public class ReceiptTariffInfo : TeaModel {
        // 托运单号 [业务必填]
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 应收资费项code [业务必填]
        // 
        // 
        [NameInMap("receipt_tariff_code")]
        [Validation(Required=false)]
        public string ReceiptTariffCode { get; set; }

        // 应收资费项项目 [业务必填]
        [NameInMap("receipt_tariff_project")]
        [Validation(Required=false)]
        public string ReceiptTariffProject { get; set; }

        // 资费项中文描述 [业务必填]
        // 
        // 
        [NameInMap("receipt_tariff_desc")]
        [Validation(Required=false)]
        public string ReceiptTariffDesc { get; set; }

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

        // 订舱单唯一标识 [业务必填]
        [NameInMap("booking_no")]
        [Validation(Required=false)]
        public string BookingNo { get; set; }

        // 订舱号 [业务必填]
        [NameInMap("bkg_no")]
        [Validation(Required=false)]
        public string BkgNo { get; set; }

    }

}
