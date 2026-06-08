// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
{
    public class PushRightsprodVoucherRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 权益编码
        [NameInMap("rights_code")]
        [Validation(Required=true)]
        public string RightsCode { get; set; }

        // 权益凭证编码/券码
        [NameInMap("voucher_code")]
        [Validation(Required=true)]
        public string VoucherCode { get; set; }

        // 业务类型
        // GRANT：发放 
        // VERIFY：核销 GRANT_CANCEL：发放撤销 VERIFY_CANCEL：核销撤销 FREEZE：冻结
        // UNFREEZE：解冻  
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // GRANT_SUCCESS：发放成功
        // GRANT_FAIL：发放失败 
        // VERIFY_FAIL：核销失败 
        // VERIFY_SUCCESS：核销成功 
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 外部订单号
        [NameInMap("out_trade_order_no")]
        [Validation(Required=false)]
        public string OutTradeOrderNo { get; set; }

        // 失败信息
        [NameInMap("fail_msg")]
        [Validation(Required=false)]
        public string FailMsg { get; set; }

        // 外部发放调用时传入信息
        [NameInMap("grant_info")]
        [Validation(Required=false)]
        public string GrantInfo { get; set; }

    }

}
