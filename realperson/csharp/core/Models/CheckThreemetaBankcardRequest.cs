// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CheckThreemetaBankcardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 银行卡号
        [NameInMap("bank_card")]
        [Validation(Required=true)]
        public string BankCard { get; set; }

        // 扩展信息，Map的json格式
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
