// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class ListAntcloudMarketingPartnerCoupontemplateResponse : TeaModel {
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

        // 分页查询的页码
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // 分页查询每页展示的数量
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 查询出来的总模板数量
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 优惠券模板信息
        [NameInMap("templates")]
        [Validation(Required=false)]
        public List<ChannelTemplateInfo> Templates { get; set; }

    }

}
