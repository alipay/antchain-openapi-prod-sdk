// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveTrailerTransportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 企业统一社会信用代码
        [NameInMap("social_credit_code")]
        [Validation(Required=true)]
        public string SocialCreditCode { get; set; }

        // 运营数据.月份
        [NameInMap("transport_month")]
        [Validation(Required=true)]
        public string TransportMonth { get; set; }

        // 运营数据.运输箱量
        [NameInMap("transport_container_quantity")]
        [Validation(Required=false)]
        public long? TransportContainerQuantity { get; set; }

        // 运营数据.运费总额
        [NameInMap("freight_total_amount")]
        [Validation(Required=true)]
        public string FreightTotalAmount { get; set; }

        // 运营数据.运输司机量
        [NameInMap("transport_driver_quantity")]
        [Validation(Required=false)]
        public long? TransportDriverQuantity { get; set; }

    }

}
