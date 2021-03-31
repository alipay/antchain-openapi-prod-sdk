// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBizCustomsorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 订舱单号
        [NameInMap("booking_params")]
        [Validation(Required=false)]
        public List<CustomsOrderBookingParam> BookingParams { get; set; }

        // 报关代理
        [NameInMap("broker")]
        [Validation(Required=false)]
        public string Broker { get; set; }

        // 集装箱ID
        [NameInMap("container_id")]
        [Validation(Required=false)]
        public string ContainerId { get; set; }

        // 箱号
        [NameInMap("container_no")]
        [Validation(Required=false)]
        public string ContainerNo { get; set; }

        // 报关单号
        [NameInMap("customs_code")]
        [Validation(Required=true)]
        public string CustomsCode { get; set; }

        //  出口人
        [NameInMap("exporter")]
        [Validation(Required=false)]
        public string Exporter { get; set; }

        // 货代did
        // 
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 货物名称
        [NameInMap("goods")]
        [Validation(Required=false)]
        public string Goods { get; set; }

        // 毛重 
        [NameInMap("gross_weight")]
        [Validation(Required=false)]
        public string GrossWeight { get; set; }

        // 订单号
        // 
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 件数
        [NameInMap("packages_no")]
        [Validation(Required=false)]
        public string PackagesNo { get; set; }

        // 报关状态  APPROVED--通关，UNAPPROVED-未通关
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 航名 业务必填
        [NameInMap("vessel")]
        [Validation(Required=true)]
        public string Vessel { get; set; }

        // 航次 业务必填
        [NameInMap("voyage")]
        [Validation(Required=false)]
        public string Voyage { get; set; }

    }

}
