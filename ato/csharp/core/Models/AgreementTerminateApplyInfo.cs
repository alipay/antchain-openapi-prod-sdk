// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // (异步)解约申请信息对象
    public class AgreementTerminateApplyInfo : TeaModel {
        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 解约申请号
        [NameInMap("terminate_apply_id")]
        [Validation(Required=false)]
        public string TerminateApplyId { get; set; }

        // 订单创建时间
        [NameInMap("order_gmt_create")]
        [Validation(Required=false)]
        public string OrderGmtCreate { get; set; }

        // 解约申请时间
        [NameInMap("gmt_terminate_apply")]
        [Validation(Required=false)]
        public string GmtTerminateApply { get; set; }

        // 处理状态
        [NameInMap("handle_status")]
        [Validation(Required=false)]
        public string HandleStatus { get; set; }

    }

}
