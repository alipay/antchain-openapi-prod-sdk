// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRepayResultResponse : TeaModel {
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

        // 还款编号
        [NameInMap("repay_no")]
        [Validation(Required=false)]
        public string RepayNo { get; set; }

        // 借据编号
        [NameInMap("receipt_no")]
        [Validation(Required=false)]
        public string ReceiptNo { get; set; }

        // 客户编号
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

        // 还款类型
        // 1: 全部结清，
        // 2：正常还款
        // 3：当期结清
        // 4：逾期还款
        // 
        [NameInMap("repay_type")]
        [Validation(Required=false)]
        public string RepayType { get; set; }

        // 还款标志
        // 1 线下还款 
        // 2 用户主动还款
        // 3 系统代扣
        // 
        [NameInMap("repay_sign")]
        [Validation(Required=false)]
        public string RepaySign { get; set; }

        // 还款账户
        [NameInMap("repay_account")]
        [Validation(Required=false)]
        public string RepayAccount { get; set; }

        // 还款状态
        [NameInMap("repay_status")]
        [Validation(Required=false)]
        public string RepayStatus { get; set; }

        // 失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

        // 还款信息列表
        [NameInMap("repay_infos")]
        [Validation(Required=false)]
        public RepayInfos RepayInfos { get; set; }

    }

}
