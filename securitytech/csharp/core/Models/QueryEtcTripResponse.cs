// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryEtcTripResponse : TeaModel {
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

        // 总页数
        [NameInMap("total_page")]
        [Validation(Required=false)]
        public long? TotalPage { get; set; }

        // 总记录数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

        // 当前页码
        // 
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 是否还有下一页
        [NameInMap("has_next")]
        [Validation(Required=false)]
        public bool? HasNext { get; set; }

        // 请求方租户所关联的行程单据列表
        [NameInMap("trip_list")]
        [Validation(Required=false)]
        public List<EtcTripInfo> TripList { get; set; }

        // json格式字符串扩展信息，预留字段。
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

    }

}
