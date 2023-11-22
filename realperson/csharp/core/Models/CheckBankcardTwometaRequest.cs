// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CheckBankcardTwometaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 	外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 要素入参模式： 1：银行卡号+姓名 2：银行卡号+证件号 3：银行卡号+手机号
        [NameInMap("meta_mode")]
        [Validation(Required=true)]
        public string MetaMode { get; set; }

        // 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 银行卡号
        [NameInMap("bank_card")]
        [Validation(Required=true)]
        public string BankCard { get; set; }

        // 手机号码
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 姓名
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 扩展信息，预留字段
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
