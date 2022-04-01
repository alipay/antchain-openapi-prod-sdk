// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 产品线SPU
    public class ProductSpu : TeaModel {
        // SPU编码
        [NameInMap("spu_code")]
        [Validation(Required=true)]
        public string SpuCode { get; set; }

        // SPU名称
        [NameInMap("spu_name")]
        [Validation(Required=true)]
        public string SpuName { get; set; }

        // spu描述
        [NameInMap("spu_desc")]
        [Validation(Required=true)]
        public string SpuDesc { get; set; }

        // 交付模式，ONLINE/OFFLINE
        [NameInMap("delivery_mode")]
        [Validation(Required=true)]
        public string DeliveryMode { get; set; }

        // 归属产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 是否涉及一方化 
        [NameInMap("involved_one_party")]
        [Validation(Required=true)]
        public bool? InvolvedOneParty { get; set; }

        // technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
        [NameInMap("segment")]
        [Validation(Required=true)]
        public string Segment { get; set; }

        // sku数据
        [NameInMap("offer_master")]
        [Validation(Required=true)]
        public List<OfferMaster> OfferMaster { get; set; }

    }

}
