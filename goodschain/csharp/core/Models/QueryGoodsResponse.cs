// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class QueryGoodsResponse : TeaModel {
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

        // 商品信息
        [NameInMap("goods")]
        [Validation(Required=false)]
        public GoodsDTO Goods { get; set; }

        // 溯源信息列表
        [NameInMap("trace_info_list")]
        [Validation(Required=false)]
        public List<TraceInfoDTO> TraceInfoList { get; set; }

        // 流转信息列表
        [NameInMap("roam_trace_list")]
        [Validation(Required=false)]
        public List<TraceInfoDTO> RoamTraceList { get; set; }

    }

}
