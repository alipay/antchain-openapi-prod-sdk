// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryDeviceRegisterresultResponse : TeaModel {
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

        // 操作是否成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 设备did
        [NameInMap("device_did")]
        [Validation(Required=false)]
        public string DeviceDid { get; set; }

        // 设备秘钥
        [NameInMap("private_key")]
        [Validation(Required=false)]
        public string PrivateKey { get; set; }

        // 设备sn
        [NameInMap("device_sn")]
        [Validation(Required=false)]
        public string DeviceSn { get; set; }

        // 设备认证密钥密文，需要下发安全认证SDK完成设备激活
        [NameInMap("sec_key")]
        [Validation(Required=false)]
        public string SecKey { get; set; }

        // 设备认证密钥状态
        [NameInMap("service_status")]
        [Validation(Required=false)]
        public string ServiceStatus { get; set; }

    }

}
