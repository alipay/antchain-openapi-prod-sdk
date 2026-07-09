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

        // trust_product_key
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // product_key
        [NameInMap("product_key")]
        [Validation(Required=false)]
        public string ProductKey { get; set; }

        // trust_device_id
        [NameInMap("trust_device_id")]
        [Validation(Required=false)]
        public string TrustDeviceId { get; set; }

        // device_name
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // nick_name
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // device_status
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // device_register_time
        [NameInMap("device_register_time")]
        [Validation(Required=false)]
        public string DeviceRegisterTime { get; set; }

        // device_active_time
        [NameInMap("device_active_time")]
        [Validation(Required=false)]
        public string DeviceActiveTime { get; set; }

        // last_online_time
        [NameInMap("last_online_time")]
        [Validation(Required=false)]
        public string LastOnlineTime { get; set; }

        // last_offline_time
        [NameInMap("last_offline_time")]
        [Validation(Required=false)]
        public string LastOfflineTime { get; set; }

        // last_communication_time
        [NameInMap("last_communication_time")]
        [Validation(Required=false)]
        public string LastCommunicationTime { get; set; }

        // device_ota_version
        [NameInMap("device_ota_version")]
        [Validation(Required=false)]
        public string DeviceOtaVersion { get; set; }

    }

}
