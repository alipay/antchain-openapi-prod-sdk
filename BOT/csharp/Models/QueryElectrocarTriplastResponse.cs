// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarTriplastResponse : TeaModel {
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

        // 状态
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // {
        // "startTime":1733841600000,
        // "tripId":"T20251210140000001",
        // "endTime":1733845200000,
        // "mileage":36.8,
        // "duration":{
        // "value":"79",
        // "unit":"h"
        // },
        // "maxSpeed":85.5,
        // "avgSpeed":36.8,
        // "firstAddress":"上海市浦东新区张江高科技园区博云路",
        // "lastAddress":"上海市徐汇区漕河泾开发区桂平路",
        // "firstLocationTime":1733841605000,
        // "lastLocationTime":1733845195000
        // }
        [NameInMap("last_trip_detail")]
        [Validation(Required=false)]
        public TripDetail LastTripDetail { get; set; }

    }

}
