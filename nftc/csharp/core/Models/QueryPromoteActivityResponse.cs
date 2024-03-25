// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class QueryPromoteActivityResponse : TeaModel {
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

        // 助力活动的活动规则编码
        [NameInMap("promote_id")]
        [Validation(Required=false)]
        public string PromoteId { get; set; }

        // 活动状态：
        // ENABLE（进行中）
        // END（活动结束）
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 助力活动类型
        // ONCE（生命周期内一次）
        // DAILY（每日一次）
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 活动开始时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 活动结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 最大助力人数
        [NameInMap("max_num")]
        [Validation(Required=false)]
        public long? MaxNum { get; set; }

        // 当前助力成功人数
        [NameInMap("cur_num")]
        [Validation(Required=false)]
        public long? CurNum { get; set; }

        // 参与助力的唯一编码，供三方幂等记录并唯一发奖
        [NameInMap("promote_list")]
        [Validation(Required=false)]
        public List<string> PromoteList { get; set; }

    }

}
