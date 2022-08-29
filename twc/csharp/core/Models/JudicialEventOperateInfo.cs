// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 司法纠纷平台案件维权事件响应信息
    public class JudicialEventOperateInfo : TeaModel {
        // 响应类型:
        // 司法调解
        //   延期确认: DELAY_CONFIRM
        //   回款确认: CASH_CONFIRM
        // 
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

        // 响应内容
        // 延期确认
        //   确认-CONFIRM
        //   否认-DENY
        // 回款确认:
        //   确认-CONFIRM
        //   有异议-DISSENT
        [NameInMap("operate_opinion")]
        [Validation(Required=true)]
        public string OperateOpinion { get; set; }

        // 当延期申请不同意,回款确认有异议时填写原因
        [NameInMap("operate_reason")]
        [Validation(Required=false)]
        public string OperateReason { get; set; }

        // 回款记录编号,回款确认时必填
        [NameInMap("req_biz_no")]
        [Validation(Required=false)]
        public string ReqBizNo { get; set; }

    }

}
