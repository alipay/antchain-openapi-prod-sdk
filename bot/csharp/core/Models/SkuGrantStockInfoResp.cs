// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 证书授权信息查询结果
    public class SkuGrantStockInfoResp : TeaModel {
        // 产品型号
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

        // 产品形式，取值范围： SOFTWARE_HARDWARE：软硬一体（SE方案）, SOFTWARE：纯软（非SE方案）
        [NameInMap("product_form")]
        [Validation(Required=false)]
        public string ProductForm { get; set; }

        // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
        [NameInMap("features")]
        [Validation(Required=false)]
        public List<string> Features { get; set; }

        // 授权数量(指当前证书凭证种类下未消耗的证书数量)
        [NameInMap("cert_num")]
        [Validation(Required=false)]
        public long? CertNum { get; set; }

    }

}
