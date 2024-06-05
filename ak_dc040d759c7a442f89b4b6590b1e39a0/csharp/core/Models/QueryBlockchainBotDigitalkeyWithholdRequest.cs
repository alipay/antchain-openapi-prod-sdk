// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    public class QueryBlockchainBotDigitalkeyWithholdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
        [NameInMap("alipay_user_id")]
        [Validation(Required=true)]
        public string AlipayUserId { get; set; }

        // 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
        [NameInMap("personal_product_code")]
        [Validation(Required=true)]
        public string PersonalProductCode { get; set; }

        // 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
        [NameInMap("sign_scene")]
        [Validation(Required=true)]
        public string SignScene { get; set; }

        // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
        [NameInMap("external_agreement_no")]
        [Validation(Required=true)]
        public string ExternalAgreementNo { get; set; }

    }

}
