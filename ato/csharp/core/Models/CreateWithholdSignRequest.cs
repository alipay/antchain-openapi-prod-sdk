// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateWithholdSignRequest : TeaModel {
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

        // 支付宝uid，非必填
        [NameInMap("alipay_user_id")]
        [Validation(Required=false, MaxLength=128)]
        public string AlipayUserId { get; set; }

        // 签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
        [NameInMap("return_url")]
        [Validation(Required=false, MaxLength=256)]
        public string ReturnUrl { get; set; }

        // 支付宝用户 open_id，非必填
        [NameInMap("user_open_id")]
        [Validation(Required=false, MaxLength=128)]
        public string UserOpenId { get; set; }

        // 商户支付宝应用 id
        [NameInMap("merchant_app_id")]
        [Validation(Required=false, MaxLength=32)]
        public string MerchantAppId { get; set; }

    }

}
