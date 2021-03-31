// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBiznewCustomsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 托运订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 报关单号
        // 
        // 
        [NameInMap("customs_code")]
        [Validation(Required=true)]
        public string CustomsCode { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 报关代理
        // 
        // 
        [NameInMap("broker")]
        [Validation(Required=false)]
        public string Broker { get; set; }

        // 出口人
        [NameInMap("exporter")]
        [Validation(Required=false)]
        public string Exporter { get; set; }

        // 船名 [业务必填]
        [NameInMap("vessel")]
        [Validation(Required=false)]
        public string Vessel { get; set; }

        // 航次 [业务必填]
        [NameInMap("voyage")]
        [Validation(Required=false)]
        public string Voyage { get; set; }

        // 报关状态
        // APPROVED--通关，UNAPPROVED-未通关
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 集装箱唯一标识
        [NameInMap("container_id")]
        [Validation(Required=false)]
        public string ContainerId { get; set; }

        // 箱号
        [NameInMap("container_no")]
        [Validation(Required=false)]
        public string ContainerNo { get; set; }

        // 货物名称
        [NameInMap("goods")]
        [Validation(Required=false)]
        public string Goods { get; set; }

        // 毛重
        [NameInMap("gross_weight")]
        [Validation(Required=false)]
        public string GrossWeight { get; set; }

        // 件数
        [NameInMap("packages_no")]
        [Validation(Required=false)]
        public string PackagesNo { get; set; }

        // 报关总金额 [业务必填]
        [NameInMap("customs_total_amount")]
        [Validation(Required=false)]
        public string CustomsTotalAmount { get; set; }

        // 报关运费金额 [业务必填]
        [NameInMap("customs_amount")]
        [Validation(Required=false)]
        public string CustomsAmount { get; set; }

        // 报关杂费金额 [业务必填]
        [NameInMap("customs_charges")]
        [Validation(Required=false)]
        public string CustomsCharges { get; set; }

        // 币种 [业务必填]
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 订舱单号列表 [业务必填]
        [NameInMap("booking_info_list")]
        [Validation(Required=false)]
        public List<BookingNoInfo> BookingInfoList { get; set; }

    }

}
