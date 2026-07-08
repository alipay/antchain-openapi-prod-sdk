// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DescribeAcarActivityResponse : TeaModel {
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

        // 活动主办方名称
        [NameInMap("sponsor")]
        [Validation(Required=false)]
        public string Sponsor { get; set; }

        // 大型活动名称
        [NameInMap("activity_name")]
        [Validation(Required=false)]
        public string ActivityName { get; set; }

        // 当前开展的活动主体名称
        [NameInMap("enterprise_name")]
        [Validation(Required=false)]
        public string EnterpriseName { get; set; }

        // 当前活动主体编码
        [NameInMap("enterprise_no")]
        [Validation(Required=false)]
        public string EnterpriseNo { get; set; }

        // 当前主体活动开始日期
        [NameInMap("enterprise_start_date")]
        [Validation(Required=false)]
        public string EnterpriseStartDate { get; set; }

        // 当前主体活动结束日期
        [NameInMap("enterprise_end_date")]
        [Validation(Required=false)]
        public string EnterpriseEndDate { get; set; }

        // 当前活动是否已经经过碳排放认证
        [NameInMap("authed")]
        [Validation(Required=false)]
        public bool? Authed { get; set; }

    }

}
