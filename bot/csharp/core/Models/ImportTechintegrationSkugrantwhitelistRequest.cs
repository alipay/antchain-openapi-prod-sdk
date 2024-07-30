// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportTechintegrationSkugrantwhitelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品型号
        [NameInMap("sku_model")]
        [Validation(Required=true)]
        public string SkuModel { get; set; }

        // 产品形态，取值范围：RTOS、TEE、Android
        [NameInMap("scheme_type")]
        [Validation(Required=true)]
        public string SchemeType { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // SN列表，单次最多100条
        [NameInMap("sn_list")]
        [Validation(Required=true)]
        public List<string> SnList { get; set; }

        // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
        [NameInMap("features")]
        [Validation(Required=false)]
        public List<string> Features { get; set; }

    }

}
