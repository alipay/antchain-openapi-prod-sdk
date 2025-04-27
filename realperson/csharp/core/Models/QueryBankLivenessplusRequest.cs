// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryBankLivenessplusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 加密方式
        [NameInMap("encrypt_type")]
        [Validation(Required=true)]
        public string EncryptType { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 银行编码
        [NameInMap("bank_code")]
        [Validation(Required=true)]
        public string BankCode { get; set; }

        // 1=借记卡+贷记卡（默认）；2=借记卡
        [NameInMap("bank_card_type")]
        [Validation(Required=false)]
        public string BankCardType { get; set; }

        // 姓名
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 手机号码
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 扩展信息，预留字段
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
