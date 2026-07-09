// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTechintegrationSkugrantstockinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品型号
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

        // 产品形式，取值范围：
        // SOFTWARE_HARDWARE：软硬一体（SE方案）,
        // SOFTWARE：纯软（非SE方案）
        [NameInMap("product_form")]
        [Validation(Required=false)]
        public string ProductForm { get; set; }

        // 凭证种类列表，取值范围：
        // ["PAYMENT"]：支付码，
        // ["PAYMENT","TRANSIT"]：支付码+乘车码
        [NameInMap("features")]
        [Validation(Required=false)]
        public List<string> Features { get; set; }

    }

}
