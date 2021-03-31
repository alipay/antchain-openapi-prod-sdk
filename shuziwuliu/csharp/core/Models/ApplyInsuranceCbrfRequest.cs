// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceCbrfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 物流公司业务线的简称
        [NameInMap("business_id")]
        [Validation(Required=false, MaxLength=30)]
        public string BusinessId { get; set; }

        // 保司编码
        [NameInMap("insurance_code")]
        [Validation(Required=true, MaxLength=8)]
        public string InsuranceCode { get; set; }

        // 险种编码
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ProductCode { get; set; }

        // 起保时间
        [NameInMap("insurance_start")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InsuranceStart { get; set; }

        // 交付航司确认时间
        [NameInMap("delivery_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeliveryTime { get; set; }

        // 客户订单编号
        [NameInMap("related_oder_no")]
        [Validation(Required=true, MaxLength=256)]
        public string RelatedOderNo { get; set; }

        // 目的国，2位iso缩写
        [NameInMap("dest_country")]
        [Validation(Required=true, MaxLength=256)]
        public string DestCountry { get; set; }

        // 商家唯一脱敏的编码
        [NameInMap("business_merchant_id")]
        [Validation(Required=false, MaxLength=256)]
        public string BusinessMerchantId { get; set; }

        // 货物的揽收时间
        [NameInMap("collection_time")]
        [Validation(Required=false, MaxLength=50)]
        public string CollectionTime { get; set; }

        // 货物名称
        [NameInMap("good_name")]
        [Validation(Required=false, MaxLength=200)]
        public string GoodName { get; set; }

        // 货值(美金)，货物的美金商品价值
        [NameInMap("good_value")]
        [Validation(Required=false, MaxLength=50)]
        public string GoodValue { get; set; }

    }

}
