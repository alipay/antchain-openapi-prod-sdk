// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    public class ConversionAdDataAttributedRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 广告账户id，如9471147
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 转化归因到的媒体渠道
        [NameInMap("media_type")]
        [Validation(Required=true)]
        public string MediaType { get; set; }

        // 转化发生的unix事件戳，单位秒
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public long? EventTime { get; set; }

        // 事件类型编码
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // 转化所属用户在客户系统中的用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 转化对应的产品id，如用户购买保险对应的保险产品id，没有可不填
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 唯一标识当前转化事件的一个业务id，如保险下单的订单id，没有可不填
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // json字段，包含转化归因到的点击的完整必要信息，如用户设备信息等
        [NameInMap("click_data")]
        [Validation(Required=true)]
        public string ClickData { get; set; }

        // 投放项目
        [NameInMap("project")]
        [Validation(Required=true)]
        public string Project { get; set; }

    }

}
