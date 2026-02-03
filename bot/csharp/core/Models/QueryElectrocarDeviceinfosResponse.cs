// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarDeviceinfosResponse : TeaModel {
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

        // key
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 产品key
        [NameInMap("product_key")]
        [Validation(Required=false)]
        public string ProductKey { get; set; }

        // 设备唯一id
        [NameInMap("trust_device_id")]
        [Validation(Required=false)]
        public string TrustDeviceId { get; set; }

        // 设备tuid
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 设备名称
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 设备在线状态
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 设备注册时间
        [NameInMap("device_register_time")]
        [Validation(Required=false)]
        public string DeviceRegisterTime { get; set; }

        // 设备激活时间
        [NameInMap("device_active_time")]
        [Validation(Required=false)]
        public string DeviceActiveTime { get; set; }

        // 最后在线时间
        [NameInMap("last_online_time")]
        [Validation(Required=false)]
        public string LastOnlineTime { get; set; }

        // 最后离线时间
        [NameInMap("last_offline_time")]
        [Validation(Required=false)]
        public string LastOfflineTime { get; set; }

        // 最后通讯时间
        [NameInMap("last_communication_time")]
        [Validation(Required=false)]
        public string LastCommunicationTime { get; set; }

        // ota版本
        [NameInMap("device_ota_version")]
        [Validation(Required=false)]
        public string DeviceOtaVersion { get; set; }

    }

}
