// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyDubbridgeRepaymentLxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 还款请求流水号/账单号
        [NameInMap("bill_id")]
        [Validation(Required=true)]
        public string BillId { get; set; }

        // 贷款申请编号
        [NameInMap("apply_id")]
        [Validation(Required=true)]
        public string ApplyId { get; set; }

        // 是否本次还款最后一次通知，
        // 1-是
        // 2-否
        // 用户一次还多期时，该笔还款按期多次通知，最后一次通知为是。为否时没有还款计划列表。
        [NameInMap("last_notify")]
        [Validation(Required=true)]
        public long? LastNotify { get; set; }

        // 代扣请求流水号
        [NameInMap("withhold_serial_no")]
        [Validation(Required=false)]
        public string WithholdSerialNo { get; set; }

        // 合作方代码
        [NameInMap("partner_code")]
        [Validation(Required=false)]
        public string PartnerCode { get; set; }

        // 还款类型，
        // 不同还款类型分开通知：
        // 10-正常还款,
        // 20-部分提前还,
        // 30-提前结清,
        // 40-逾期还款
        // 50-代偿
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public long? RepayType { get; set; }

        // 还款路径，
        // 1-清分 2-代扣
        [NameInMap("repay_channel")]
        [Validation(Required=true)]
        public string RepayChannel { get; set; }

        // 还款期数
        [NameInMap("repay_term")]
        [Validation(Required=true)]
        public string RepayTerm { get; set; }

        // 还款日期
        [NameInMap("repay_date")]
        [Validation(Required=true)]
        public string RepayDate { get; set; }

        // 还款总额,保留两位有效数字(单位:元)
        [NameInMap("repay_amount")]
        [Validation(Required=true)]
        public string RepayAmount { get; set; }

        // 实还本金,保留两位有效数字(单位:元)
        [NameInMap("repay_principal")]
        [Validation(Required=true)]
        public string RepayPrincipal { get; set; }

        // 实还利息,保留两位有效数字(单位:元)
        [NameInMap("repay_interest")]
        [Validation(Required=true)]
        public string RepayInterest { get; set; }

        // 实还罚息,保留两位有效数字(单位:元)
        [NameInMap("repay_muclt")]
        [Validation(Required=false)]
        public string RepayMuclt { get; set; }

        // 实还担保费,保留两位有效数字(单位:元)
        [NameInMap("repay_guarantee")]
        [Validation(Required=false)]
        public string RepayGuarantee { get; set; }

        // 当期结清状态：
        // 0-当期未结清
        // 1-当期已结清
        [NameInMap("repayment_mode")]
        [Validation(Required=true)]
        public string RepaymentMode { get; set; }

        // 还款计划列表，随借随还业务更新后的还款计划列表
        [NameInMap("rpy_details")]
        [Validation(Required=false)]
        public List<BillDetail> RpyDetails { get; set; }

    }

}
