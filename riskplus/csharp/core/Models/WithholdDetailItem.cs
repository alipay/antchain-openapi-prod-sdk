// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 代扣明细
    public class WithholdDetailItem : TeaModel {
        // 贷款申请编号
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 放款编号/借据号
        [NameInMap("capital_loan_no")]
        [Validation(Required=true)]
        public string CapitalLoanNo { get; set; }

        // 订单维度的实还总额,保留两位有效数字
        // 单笔订单代扣的总额(单位:分)
        [NameInMap("rpy_total_amt")]
        [Validation(Required=true)]
        public long? RpyTotalAmt { get; set; }

        // 还款类型，0-待还、1-正常还款、2-部分提前还、 3-逾期还款 、4-全部提前还 、5-坏账代偿、 6-回购
        [NameInMap("rpy_tpe")]
        [Validation(Required=true)]
        public long? RpyTpe { get; set; }

        // 代扣日期，用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
        [NameInMap("rpy_date")]
        [Validation(Required=true)]
        public string RpyDate { get; set; }

        // 还款账单明细,如果是提前结清,会有多条
        [NameInMap("bill_details")]
        [Validation(Required=true)]
        public List<BillDetail> BillDetails { get; set; }

    }

}
