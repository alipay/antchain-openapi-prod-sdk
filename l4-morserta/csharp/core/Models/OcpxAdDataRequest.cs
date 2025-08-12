// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    public class OcpxAdDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 见对接文档中【Industry行业枚举】部分
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 归因渠道编码，见对接文档中的【渠道枚举】部分
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 归因广告账号id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 见对接文档中【转化事件event_code枚举】部分
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // unix时间戳
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public long? EventTime { get; set; }

        // 转化用户/设备标识
        [NameInMap("user_info")]
        [Validation(Required=false)]
        public UserInfo UserInfo { get; set; }

        // 如有去重需求，可传递业务事件id， 唯一标识当前事件。如下单事件中的订单id
        [NameInMap("out_event_id")]
        [Validation(Required=false)]
        public string OutEventId { get; set; }

        // android/ios/web
        [NameInMap("os_type")]
        [Validation(Required=true)]
        public string OsType { get; set; }

        // 点击id和user_info二者至少传一个
        [NameInMap("click_id")]
        [Validation(Required=false)]
        public string ClickId { get; set; }

    }

}
