// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackMarketingEventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 调用方生成的唯一编码
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=128)]
        public string RequestId { get; set; }

        // 特征编码
        [NameInMap("click_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ClickId { get; set; }

        // 点击时间
        [NameInMap("click_time")]
        [Validation(Required=true, MaxLength=20)]
        public string ClickTime { get; set; }

        // 事件类型，枚举：
        // RESERVATION_CHECK（留资）；
        // FIRST_PICK_FREE（领增）；
        // LOW_INSURANCE（低价险）；
        // HIGH_INSURANCE（高价险）；
        [NameInMap("event_code")]
        [Validation(Required=true, MaxLength=20)]
        public string EventCode { get; set; }

        // 事件完成时间（yyyy-MM-dd  HH:mm:ss）
        [NameInMap("event_time")]
        [Validation(Required=true, MaxLength=20)]
        public string EventTime { get; set; }

        // 固定式，蚂蚁数科
        [NameInMap("first_channel")]
        [Validation(Required=true, MaxLength=64)]
        public string FirstChannel { get; set; }

        // 二级渠道编码
        [NameInMap("second_channel")]
        [Validation(Required=false, MaxLength=64)]
        public string SecondChannel { get; set; }

        // 三级渠道/广告版位
        [NameInMap("advertising_position")]
        [Validation(Required=false, MaxLength=64)]
        public string AdvertisingPosition { get; set; }

        // 业务字段，json格式
        [NameInMap("event_info")]
        [Validation(Required=true)]
        public string EventInfo { get; set; }

    }

}
