// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class UpdateAntchainAtoTradeUserpromiseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=49)]
        public string OrderId { get; set; }

        // 商家社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=199)]
        public string MerchantId { get; set; }

        // 修改的用户履约期数
        [NameInMap("term_idx")]
        [Validation(Required=true)]
        public long? TermIdx { get; set; }

        // 更新后的租金，单位为分
        // 1234=12.34元
        [NameInMap("updated_rental_money")]
        [Validation(Required=true)]
        public long? UpdatedRentalMoney { get; set; }

        // 调整原因，枚举
        // ● A01 : 违章罚金
        // ● A02 : 水电煤费用
        [NameInMap("reason")]
        [Validation(Required=true, MaxLength=10)]
        public string Reason { get; set; }

        // 调整说明，本说明同步到支付宝账户备注中，需准确填写
        [NameInMap("desc")]
        [Validation(Required=true, MaxLength=64)]
        public string Desc { get; set; }

    }

}
