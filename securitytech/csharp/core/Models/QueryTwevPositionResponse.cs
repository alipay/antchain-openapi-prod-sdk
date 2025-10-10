// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryTwevPositionResponse : TeaModel {
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

        // 经度
        [NameInMap("lng")]
        [Validation(Required=false)]
        public string Lng { get; set; }

        // 纬度
        [NameInMap("lat")]
        [Validation(Required=false)]
        public string Lat { get; set; }

        // 定位时间
        [NameInMap("gps_time")]
        [Validation(Required=false)]
        public string GpsTime { get; set; }

        // json，扩展预留
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
