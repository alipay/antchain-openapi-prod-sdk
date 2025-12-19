// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 券咨询业务上下文
    public class VoucherConsultBusinessContext : TeaModel {
        // 指定资产编码列表
        [NameInMap("asset_type_code_list")]
        [Validation(Required=true)]
        public List<string> AssetTypeCodeList { get; set; }

        // 订单金额
        [NameInMap("order_amount")]
        [Validation(Required=true)]
        public string OrderAmount { get; set; }

        // 收款账号
        [NameInMap("payee_user_id")]
        [Validation(Required=true)]
        public string PayeeUserId { get; set; }

        // 业务上下文信息
        [NameInMap("biz_context")]
        [Validation(Required=true)]
        public string BizContext { get; set; }

    }

}
