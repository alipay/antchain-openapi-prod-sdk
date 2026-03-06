// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 银行卡代扣一键绑卡账户信息
    public class AccInfo : TeaModel {
        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 持卡人姓名
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 银行卡号
        [NameInMap("bank_card")]
        [Validation(Required=false)]
        public string BankCard { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 银行卡类型，
        // 0：借记卡
        // 1：信用卡
        [NameInMap("card_type")]
        [Validation(Required=false)]
        public string CardType { get; set; }

    }

}
