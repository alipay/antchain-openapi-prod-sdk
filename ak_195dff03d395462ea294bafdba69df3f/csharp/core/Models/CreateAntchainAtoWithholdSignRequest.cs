// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class CreateAntchainAtoWithholdSignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 支付宝商户id，使用签约能力前时候进行向平台申请
        [NameInMap("alipay_merchant_id")]
        [Validation(Required=false, MaxLength=20)]
        public string AlipayMerchantId { get; set; }

        // 支付宝商户名称，会展示在支付并签约界面
        [NameInMap("alipay_merchant_name")]
        [Validation(Required=false, MaxLength=50)]
        public string AlipayMerchantName { get; set; }

        // 支付宝商户服务名称，会展示在支付并签约界面
        [NameInMap("alipay_merchant_service_name")]
        [Validation(Required=false, MaxLength=50)]
        public string AlipayMerchantServiceName { get; set; }

        // 支付宝商户服务描述，会展示在支付并签约界面
        [NameInMap("alipay_merchant_service_description")]
        [Validation(Required=false, MaxLength=150)]
        public string AlipayMerchantServiceDescription { get; set; }

    }

}
