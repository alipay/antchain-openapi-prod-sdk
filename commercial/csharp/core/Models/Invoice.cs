// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 发票信息
    public class Invoice : TeaModel {
        // 主键id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 纳税人类型
        [NameInMap("taxpayer_type")]
        [Validation(Required=true)]
        public string TaxpayerType { get; set; }

        // 纳税人名称
        [NameInMap("taxpayer_name")]
        [Validation(Required=false)]
        public string TaxpayerName { get; set; }

        // 纳税人识别号
        [NameInMap("taxpayer_no")]
        [Validation(Required=false)]
        public string TaxpayerNo { get; set; }

        // 开户行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 开户行账号
        [NameInMap("bank_account")]
        [Validation(Required=false)]
        public string BankAccount { get; set; }

        // 开户行地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 开户行电话
        [NameInMap("telephone")]
        [Validation(Required=false)]
        public string Telephone { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 唯一id
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

    }

}
