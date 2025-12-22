// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarTripstatisticsResponse : TeaModel {
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

        // [{总里程、总用时、总次数、 时期码}，{总里程、总用时、总次数、 时期码}，......] 
        // 备注：返回前八个加上当前共九个的统计数据（按时间正排）
        // 时期码说明：
        // 月维度：
        // eg1: 12，11，10，9... 
        // eg2: 3, 2, 1, 12（去年12月）, 11...
        // 周维度：
        // eg1: 52，51，50，49...
        // eg2: 3，2，1，52（去年最后一周）， 51...
        // 日维度：
        // eg1: 30，29，28，27...
        // eg2: 3，2，1，30（上个月最后一天），29...
        [NameInMap("trip_statistics")]
        [Validation(Required=false)]
        public List<TripStatistics> TripStatistics { get; set; }

    }

}
