// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 人保扩展信息
    public class RenbaoExtInfo : TeaModel {
        // 银行区域代码，可网上查询各银行最新对应的区域代码，比如杭州的区域代码为：3301
        [NameInMap("rec_bank_area_code")]
        [Validation(Required=true, MaxLength=8)]
        public string RecBankAreaCode { get; set; }

        // 投保人收款账号
        [NameInMap("account_no")]
        [Validation(Required=true, MaxLength=32)]
        public string AccountNo { get; set; }

        // 完整银行名称，不需要具体到分行
        [NameInMap("bank_name")]
        [Validation(Required=true, MaxLength=32)]
        public string BankName { get; set; }

        // 投保人户名
        [NameInMap("account_name")]
        [Validation(Required=true, MaxLength=64)]
        public string AccountName { get; set; }

        // 联行号
        [NameInMap("cnaps")]
        [Validation(Required=true, MaxLength=16)]
        public string Cnaps { get; set; }

        // 统一社会信用代码
        [NameInMap("identify_no")]
        [Validation(Required=true, MaxLength=32)]
        public string IdentifyNo { get; set; }

    }

}
