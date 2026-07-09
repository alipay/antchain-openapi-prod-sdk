// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateAcsDeviceResponse : TeaModel {
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

        // 链上设备Id
        [NameInMap("chain_deviceid")]
        [Validation(Required=false)]
        public string ChainDeviceid { get; set; }

        // 发行设备ID
        [NameInMap("distribute_device_id")]
        [Validation(Required=false)]
        public string DistributeDeviceId { get; set; }

        // 设备激活文本-设备直连上链方式使用
        [NameInMap("active_data")]
        [Validation(Required=false)]
        public string ActiveData { get; set; }

    }

}
