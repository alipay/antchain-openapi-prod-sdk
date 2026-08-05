// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTrustiotMiniappResponse : TeaModel {
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

        // 携带 redirectToken 的跳转 URL
        [NameInMap("redirect_url")]
        [Validation(Required=false)]
        public string RedirectUrl { get; set; }

        // 有效期开始时间（时间戳）
        [NameInMap("valid_from")]
        [Validation(Required=false)]
        public long? ValidFrom { get; set; }

        // 有效期截止时间（时间戳）
        [NameInMap("valid_to")]
        [Validation(Required=false)]
        public long? ValidTo { get; set; }

        // 按 scene 聚合的未注册设备
        [NameInMap("invalid_devices")]
        [Validation(Required=false)]
        public List<DeviceScopeItem> InvalidDevices { get; set; }

        // 实际授权的有效设备数
        [NameInMap("valid_device_count")]
        [Validation(Required=false)]
        public long? ValidDeviceCount { get; set; }

    }

}
