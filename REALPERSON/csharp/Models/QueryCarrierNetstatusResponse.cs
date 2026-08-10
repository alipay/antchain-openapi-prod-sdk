// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryCarrierNetstatusResponse : TeaModel {
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

        // 在网状态结果值
        [NameInMap("tel_network_status")]
        [Validation(Required=false)]
        public string TelNetworkStatus { get; set; }

        // 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 扩展信息，为JSONObject。
        // 包含携号转网状态，字段名telNumberTransStatus，字段类型为字符串，字段值示例"1"，描述：1-携号转网 0-未携号转网 2-未知
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

    }

}
