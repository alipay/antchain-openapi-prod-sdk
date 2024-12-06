// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_f9cb6523d99f4d089e97d549f141e6e4.Models
{
    public class ExecBlockchainTaxIcmSyncgatheringResponse : TeaModel {
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

        // 返回的请求对象jsonString
        [NameInMap("biz_content")]
        [Validation(Required=false)]
        public string BizContent { get; set; }

        // unix秒时间戳,查询时间，用来对账使用
        [NameInMap("query_time")]
        [Validation(Required=false)]
        public string QueryTime { get; set; }

        // 返回模式
        [NameInMap("return_mode")]
        [Validation(Required=false)]
        public string ReturnMode { get; set; }

        // 返回结果
        [NameInMap("return_result")]
        [Validation(Required=false)]
        public List<ReturnDetail> ReturnResult { get; set; }

        // 是否查得
        [NameInMap("null_data_flag")]
        [Validation(Required=false)]
        public bool? NullDataFlag { get; set; }

        // 参考区块链给出的标准字段定义
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // 是否需要重新授权
        [NameInMap("reauth")]
        [Validation(Required=false)]
        public bool? Reauth { get; set; }

    }

}
