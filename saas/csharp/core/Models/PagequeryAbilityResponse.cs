// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    public class PagequeryAbilityResponse : TeaModel {
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

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=false)]
        public long? Current { get; set; }

        // 当前页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 总数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 能力信息列表
        [NameInMap("ability_info_list")]
        [Validation(Required=false)]
        public List<AbilityInfo> AbilityInfoList { get; set; }

    }

}
