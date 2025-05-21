// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateElectrocarApplycarkeycertificateResponse : TeaModel {
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

        // sn 
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // deviceDid
        [NameInMap("device_did")]
        [Validation(Required=false)]
        public string DeviceDid { get; set; }

        // 三元组+连接实例id
        [NameInMap("mqtt_content")]
        [Validation(Required=false)]
        public string MqttContent { get; set; }

        // 凭证接口返回参数
        [NameInMap("car_key_init_data")]
        [Validation(Required=false)]
        public string CarKeyInitData { get; set; }

        // 成功/失败
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
