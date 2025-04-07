// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarTravelResponse : TeaModel {
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

        // 接口调用结果
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 概览信息,
        // bean 定义：
        // 行程统计：TripStatisticsView
        // 行程列表：-
        // 行程详情：TripTraceView
        [NameInMap("over_view")]
        [Validation(Required=false)]
        public string OverView { get; set; }

        // 详情列表
        // bean 定义：
        // 行程统计：TripStatistics
        // 行程列表：TripView
        // 行程详情：TripTrace
        [NameInMap("detail_list")]
        [Validation(Required=false)]
        public List<string> DetailList { get; set; }

    }

}
