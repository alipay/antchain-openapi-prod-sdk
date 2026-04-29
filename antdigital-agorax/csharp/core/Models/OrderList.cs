// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 发券记录列表
    public class OrderList : TeaModel {
        // 活动ID
        [NameInMap("activity_id")]
        [Validation(Required=false)]
        public string ActivityId { get; set; }

        // 记录ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 业务ID
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 奖品id
        [NameInMap("prize_id")]
        [Validation(Required=false)]
        public string PrizeId { get; set; }

        // 触发时间
        [NameInMap("send_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SendTime { get; set; }

        // 发券结果
        [NameInMap("send_status")]
        [Validation(Required=false)]
        public string SendStatus { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误描述
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

    }

}
