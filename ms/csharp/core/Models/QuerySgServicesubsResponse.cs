// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class QuerySgServicesubsResponse : TeaModel {
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

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 起始索引
        [NameInMap("start_index")]
        [Validation(Required=false)]
        public long? StartIndex { get; set; }

        // [
        //         {
        //             "gmtModified":"2019-12-12T20:58:22+08:00",
        //             "instanceId":"0SGTOGOOLRD8",
        //             "alive":true,
        //             "dataId":"com.antfin.demo.endpoint.facade.SampleRestFacade:1.0@DEFAULT",
        //             "hostIp":"10.15.228.102",
        //             "processId":"10.15.228.102:64588",
        //             "zone":"DEFAULT_ZONE",
        //             "appName":"consumer-demo",
        //             "scope":"global",
        //             "checkSum":"86f4f564ef778386998b4b19098f5c77",
        //             "id":7977,
        //             "gmtCreate":"2019-12-12T20:58:22+08:00"
        //         }
        //     ]
        [NameInMap("subscribers")]
        [Validation(Required=false)]
        public List<Subscriber> Subscribers { get; set; }

        // 总条数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

    }

}
