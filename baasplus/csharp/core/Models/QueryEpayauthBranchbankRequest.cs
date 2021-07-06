// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryEpayauthBranchbankRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 银行名称，支持全称，或部分名称
        // bank_name和district_code至少有一个不为空
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 行政地区编码
        // bank_name和district_code至少有一个不为空
        [NameInMap("district_code")]
        [Validation(Required=false)]
        public string DistrictCode { get; set; }

        // 总行联行号
        [NameInMap("root_bank_code")]
        [Validation(Required=true)]
        public string RootBankCode { get; set; }

    }

}
