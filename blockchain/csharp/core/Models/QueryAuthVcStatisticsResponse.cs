// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthVcStatisticsResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 业务场景值，与入参相同
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 指定业务场景的数据量，在核酸检测场景，就是整体核酸检测数据的数量
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 分布曲线描绘的一个点，day为单位的分布数据汇总情况。
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<Curve> List { get; set; }

    }

}
