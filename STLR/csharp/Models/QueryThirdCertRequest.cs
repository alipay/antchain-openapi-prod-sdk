// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryThirdCertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 三方平台的产品ID
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // GreenProductCertification ：绿色产品认证证书
        // GarbonNeutrality ： 碳中和证书
        // GreenhouseGasInventory 温室气体核查证书
        [NameInMap("certification_type")]
        [Validation(Required=false)]
        public string CertificationType { get; set; }

        // 证书文件中的产品名称
        [NameInMap("cproduct_name")]
        [Validation(Required=false)]
        public string CproductName { get; set; }

        // 证书文件中的产品型号
        [NameInMap("cproduct_model")]
        [Validation(Required=false)]
        public string CproductModel { get; set; }

        // 证书文件中的生产商名称
        [NameInMap("cproduct_firm")]
        [Validation(Required=false)]
        public string CproductFirm { get; set; }

        // 三方平台的企业ID
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

    }

}
