// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgeRepaywithholdLxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 代扣请求流水号
        [NameInMap("withhold_serial_no")]
        [Validation(Required=true)]
        public string WithholdSerialNo { get; set; }

        // 合作方代码
        [NameInMap("partner_code")]
        [Validation(Required=false)]
        public string PartnerCode { get; set; }

        // 用户绑卡信息 ，包含用户四要素：手机号、卡号、用户名、身份证等
        [NameInMap("bind_card_info")]
        [Validation(Required=true)]
        public string BindCardInfo { get; set; }

        // 通联需要的银行编码
        [NameInMap("bank_id")]
        [Validation(Required=false)]
        public string BankId { get; set; }

        // 代扣总金额=用户代扣金额+补差金额（单位：分）
        [NameInMap("withhold_amt")]
        [Validation(Required=true)]
        public long? WithholdAmt { get; set; }

        // 签约协议号，客户在支付机构的签约协议号(通联以身份证号唯一，宝付以四要素唯一)
        [NameInMap("sign_num")]
        [Validation(Required=true)]
        public string SignNum { get; set; }

        // 支付模式，
        // 0:银行卡支付（默认）
        // 1:余额支付
        // 2:份额支付
        [NameInMap("pay_mode")]
        [Validation(Required=true)]
        public long? PayMode { get; set; }

        // 在支付机构的商户号
        [NameInMap("sub_merchant_id")]
        [Validation(Required=true)]
        public string SubMerchantId { get; set; }

        // 出账信息
        [NameInMap("sep_out_info")]
        [Validation(Required=true)]
        public string SepOutInfo { get; set; }

        // 分账信息，分账信息条数大于等于一条，当担保费为0时，担保费分账信息不会透传给资方，产品需提示资方做好适配
        // 
        [NameInMap("sep_in_info")]
        [Validation(Required=true)]
        public string SepInInfo { get; set; }

        // 加密报文，流量方对出入账信息加密报文，需资方透传给支付机构，与资方申请一致方可扣款成功
        [NameInMap("encrpyt_content")]
        [Validation(Required=false)]
        public string EncrpytContent { get; set; }

        // 代扣明细
        [NameInMap("withhold_detail")]
        [Validation(Required=true)]
        public List<WithholdDetailItem> WithholdDetail { get; set; }

    }

}
