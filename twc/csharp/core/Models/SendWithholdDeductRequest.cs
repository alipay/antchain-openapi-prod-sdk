// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SendWithholdDeductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 委托支付订单总金额，单位为元，精确到小数点后两位
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // JSON格式，传递业务扩展参数
        [NameInMap("business_params")]
        [Validation(Required=false)]
        public string BusinessParams { get; set; }

        // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
        [NameInMap("external_agreement_no")]
        [Validation(Required=true)]
        public string ExternalAgreementNo { get; set; }

        // 订单标题信息
        [NameInMap("order_title")]
        [Validation(Required=false)]
        public string OrderTitle { get; set; }

        // 外部订单号,请求方保证唯一性
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 第三方的用户id
        [NameInMap("third_party_id")]
        [Validation(Required=true)]
        public string ThirdPartyId { get; set; }

    }

}
