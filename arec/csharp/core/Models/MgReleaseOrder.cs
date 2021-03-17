// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 解抵押单
    public class MgReleaseOrder : TeaModel {
        // 解抵押单号
        [NameInMap("mg_release_order_no")]
        [Validation(Required=false)]
        public string MgReleaseOrderNo { get; set; }

        // 不动产中心解抵押单号
        [NameInMap("rtc_mg_release_order_no")]
        [Validation(Required=false)]
        public string RtcMgReleaseOrderNo { get; set; }

        // 机构侧业务单号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 抵押登记权证号(他项权证号)
        [NameInMap("other_right_cert_no")]
        [Validation(Required=false)]
        public string OtherRightCertNo { get; set; }

        // 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
        [NameInMap("wipe_mortgage_reason")]
        [Validation(Required=false)]
        public string WipeMortgageReason { get; set; }

        // 解抵押状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 房产链内部银行编号
        [NameInMap("bank_no")]
        [Validation(Required=false)]
        public string BankNo { get; set; }

        // 银行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 房产链内部不动产中心编号
        [NameInMap("rtc_no")]
        [Validation(Required=false)]
        public string RtcNo { get; set; }

        // 不动产中心名称
        [NameInMap("rtc_name")]
        [Validation(Required=false)]
        public string RtcName { get; set; }

        // 办理业务分支行
        [NameInMap("branch_bank")]
        [Validation(Required=false)]
        public Bank BranchBank { get; set; }

        // 解抵押的房产信息
        [NameInMap("house")]
        [Validation(Required=false)]
        public House House { get; set; }

        // 解抵押的合同列表
        [NameInMap("agreements")]
        [Validation(Required=false)]
        public List<Agreement> Agreements { get; set; }

        // 解抵押相关的附件材料
        [NameInMap("archives")]
        [Validation(Required=false)]
        public List<Archive> Archives { get; set; }

        // 解抵押单据生成时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 解抵押单据结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 解抵押失败code,MGR_AR_SIGN_FAIL=解抵押合同签署失败
        [NameInMap("fail_code")]
        [Validation(Required=false)]
        public string FailCode { get; set; }

        // 解抵押失败原因描述
        [NameInMap("fail_desc")]
        [Validation(Required=false)]
        public string FailDesc { get; set; }

        // 助贷平台
        [NameInMap("loan_assist_platform")]
        [Validation(Required=false)]
        public string LoanAssistPlatform { get; set; }

    }

}
