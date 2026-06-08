// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    public class PushAntdigitalGesaasspiRightsprodGrantrightsResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 发放状态：
        // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
        [NameInMap("grant_status")]
        [Validation(Required=false)]
        public string GrantStatus { get; set; }

        // 过期时间
        [NameInMap("expire_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpireTime { get; set; }

        // 生效时间
        [NameInMap("effect_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EffectTime { get; set; }

        // 发放订单明细数据
        [NameInMap("order_details")]
        [Validation(Required=false)]
        public List<GrantOrderDetail> OrderDetails { get; set; }

    }

}
