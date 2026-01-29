// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商户已进件支付渠道信息
    public class MerchantPayChannelInfo : TeaModel {
        // ALIPAY 支付宝
        // JDPAY京东支付
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

        // 绑定企业支付宝账号
        [NameInMap("bind_alipay_no")]
        [Validation(Required=false)]
        public string BindAlipayNo { get; set; }

        // 结算企业支付宝账号
        [NameInMap("settle_alipay_no")]
        [Validation(Required=false)]
        public string SettleAlipayNo { get; set; }

        // 绑定支付宝uid
        [NameInMap("bind_alipay_uid")]
        [Validation(Required=false)]
        public string BindAlipayUid { get; set; }

        // 结算银行卡账号
        [NameInMap("bank_num")]
        [Validation(Required=false)]
        public string BankNum { get; set; }

        // 联行号
        [NameInMap("bank_cnap")]
        [Validation(Required=false)]
        public string BankCnap { get; set; }

        // 结算账户类型 
        // merchant_type=01企业时：ENTERPRISE
        // 03:民办非企业：ENTERPRISE
        // 07个体工商户时：PERSON或 ENTERPRISE
        [NameInMap("bank_account_type")]
        [Validation(Required=false)]
        public string BankAccountType { get; set; }

        // 二级商户id
        [NameInMap("sub_merchant_id")]
        [Validation(Required=false)]
        public string SubMerchantId { get; set; }

        // 进件流水号
        [NameInMap("pay_expand_id")]
        [Validation(Required=false)]
        public string PayExpandId { get; set; }

    }

}
