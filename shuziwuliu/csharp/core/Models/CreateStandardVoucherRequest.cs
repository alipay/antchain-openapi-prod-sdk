// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateStandardVoucherRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据标识
        [NameInMap("business_code")]
        [Validation(Required=true, MaxLength=10)]
        public string BusinessCode { get; set; }

        // 资产类型
        [NameInMap("asset_type")]
        [Validation(Required=true, MaxLength=10)]
        public string AssetType { get; set; }

        // 发行金额_Integer
        [NameInMap("amount_int")]
        [Validation(Required=true)]
        public long? AmountInt { get; set; }

        // 发行金额_Long
        [NameInMap("amount_long")]
        [Validation(Required=true)]
        public long? AmountLong { get; set; }

        // 账户是否存在
        [NameInMap("exist")]
        [Validation(Required=true)]
        public bool? Exist { get; set; }

        // 发行时间
        [NameInMap("issue_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string IssueTime { get; set; }

        // 签署方
        [NameInMap("api_test")]
        [Validation(Required=true)]
        public ApiTest ApiTest { get; set; }

        // 凭证列表_voucherArray
        [NameInMap("voucher_array")]
        [Validation(Required=true)]
        public List<long?> VoucherArray { get; set; }

        // 凭证列表_voucherList
        [NameInMap("voucher_list")]
        [Validation(Required=true)]
        public List<string> VoucherList { get; set; }

        // 凭证列表_apiTestList
        [NameInMap("api_test_list")]
        [Validation(Required=true)]
        public List<ApiTest> ApiTestList { get; set; }

        // 凭证列表_booleanList
        [NameInMap("boolean_list")]
        [Validation(Required=true)]
        public List<bool?> BooleanList { get; set; }

        // 凭证列表_dateList
        [NameInMap("date_list")]
        [Validation(Required=true)]
        public List<string> DateList { get; set; }

    }

}
