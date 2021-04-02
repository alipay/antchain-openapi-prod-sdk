// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateDistributedeviceByperipheralidResponse : TeaModel {
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

        // 发行设备Id
        // 
        [NameInMap("distribute_device_id")]
        [Validation(Required=false)]
        public string DistributeDeviceId { get; set; }

        // 链上外围设备Id
        // 
        [NameInMap("chain_peripheral_id")]
        [Validation(Required=false)]
        public string ChainPeripheralId { get; set; }

    }

}
