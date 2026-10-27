// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class RegisterHealthDeviceResponse : TeaModel {
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

        // 品牌方渠道标识
        [NameInMap("channel_id")]
        [Validation(Required=false)]
        public string ChannelId { get; set; }

        // 设备唯一id
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 设备sn号
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // 绑定状态
        [NameInMap("bind_status")]
        [Validation(Required=false)]
        public string BindStatus { get; set; }

        // 设备类型 WATCH-手表
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 预留可扩展字段json
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
