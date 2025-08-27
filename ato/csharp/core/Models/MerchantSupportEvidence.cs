// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商家举证材料
    public class MerchantSupportEvidence : TeaModel {
        // 商家操作(拒绝)时间
        [NameInMap("merchant_operate_time")]
        [Validation(Required=false)]
        public string MerchantOperateTime { get; set; }

        // 商家拒绝原因
        [NameInMap("merchant_refuse_reason")]
        [Validation(Required=false)]
        public string MerchantRefuseReason { get; set; }

        // 商家拒绝举证材料
        [NameInMap("merchant_refuse_evidences")]
        [Validation(Required=false)]
        public List<string> MerchantRefuseEvidences { get; set; }

    }

}
