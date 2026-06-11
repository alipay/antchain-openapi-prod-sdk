// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class CallbackRightsprodOperationdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通知ID(幂等)
        [NameInMap("notify_id")]
        [Validation(Required=true)]
        public string NotifyId { get; set; }

        // 权益编号
        [NameInMap("rights_code")]
        [Validation(Required=true)]
        public string RightsCode { get; set; }

        // 凭证编号
        [NameInMap("voucher_code")]
        [Validation(Required=true)]
        public string VoucherCode { get; set; }

        // 业务类型 V_REFUND（退款） V_EXPIRE（过期） V_INVALID（作废） V_USE（核销） V_PUBLISH（发放）
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 支付订单号（使用和退款 时用于判断是否为重复核销、退款通知）
        [NameInMap("pay_order_no")]
        [Validation(Required=false)]
        public string PayOrderNo { get; set; }

        // 券面额
        [NameInMap("face_amount")]
        [Validation(Required=false)]
        public string FaceAmount { get; set; }

        // 流通金额（核销、退款时 金额）
        [NameInMap("flux_amount")]
        [Validation(Required=false)]
        public string FluxAmount { get; set; }

        // 业务发生时间
        [NameInMap("biz_time")]
        [Validation(Required=true)]
        public string BizTime { get; set; }

    }

}
