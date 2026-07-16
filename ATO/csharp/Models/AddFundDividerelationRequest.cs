// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class AddFundDividerelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被分账方社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 分账方信息，最多支持10组
        [NameInMap("divide_binding_trans_in_info_list")]
        [Validation(Required=true)]
        public List<DivideBindingTransInInfo> DivideBindingTransInInfoList { get; set; }

        // 分账比例上限
        [NameInMap("divide_radio")]
        [Validation(Required=false)]
        public string DivideRadio { get; set; }

    }

}
