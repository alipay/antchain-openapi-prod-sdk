// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class SubmitAntchainAtoFundFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 商户id
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商家签署tag
        [NameInMap("merchant_sign_tag")]
        [Validation(Required=true)]
        public string MerchantSignTag { get; set; }

        // 资方id
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 资方签署tag
        [NameInMap("fund_sign_tag")]
        [Validation(Required=true)]
        public string FundSignTag { get; set; }

        // 资方是否自动签署，true则会在商户签署完成后自动归档，false则需要资方调用auth接口后完成归档
        [NameInMap("fund_auto_sign")]
        [Validation(Required=true)]
        public bool? FundAutoSign { get; set; }

        // 模板参数列表，需要传入模板id和对应的渲染参数，如果有多个文件则传入多个值
        [NameInMap("template_list")]
        [Validation(Required=true)]
        public List<TemplateArgs> TemplateList { get; set; }

    }

}
