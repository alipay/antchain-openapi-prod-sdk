// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 案件基础信息
    public class CaseBaseInfo : TeaModel {
        // caseID
        [NameInMap("case_id")]
        [Validation(Required=true)]
        public string CaseId { get; set; }

        // PENDING_RIGHTS_PROTECTION(1, "待发起维权"),
        // TO_BE_SUBMITTED(2, "待提交"),
        // ACCEPTED_AND_PROCESSED(3, "收案处理中"),
        // RESULTS_TO_BE_CONFIRMED(4, "结果待确认"),
        // CLOSED(5, "已关闭"),
        [NameInMap("case_phase")]
        [Validation(Required=true)]
        public string CasePhase { get; set; }

        // 维权ID
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public string RecordId { get; set; }

        // MEDIATION(1, "调解"),
        // LITIGATION(2, "诉讼"),
        // ARBITRATION(3, "仲裁"),
        // CARRIED_OUT(4, "执行"),
        [NameInMap("record_type")]
        [Validation(Required=true)]
        public string RecordType { get; set; }

        // MATERIAL_PREPARATION(1, "材料准备中"),
        // SUBMITTED(2, "已提交"),
        // FILED(3, "已立案"),
        // CLOSED(4, "已结案"),
        // WITHDRAW_THE_CASE(5, "撤案"),
        // REVOKE(6, "撤销"),
        // INADMISSIBLE(7, "不予受理"),
        // SUBMITTING(8, "提交中"),
        // SUBMISSION_FAILED(9, "提交失败"),
        // FINAL_RULING(10, "裁定终本"),
        // CARRIED_OUT_FINISHED(11, "执行完毕"),
        // TO_BE_SIGNED(12, "签署中"),
        // SIGNING_TIMED_OUT(13, "签署超时"),
        // SIGN_REJECTED(14, "签署被拒绝"),
        // SIGN_REVOCATION(15, "签署撤销"),
        // WITHDRAW_THE_CASE_ING(16, "撤案处理中"),
        // WITHDRAW_SIGNING_TIMED_OUT(17, "撤案签署超时"),
        // WITHDRAW_SIGN_REJECTED(18, "撤案签署被拒绝"),
        // WITHDRAW_SIGN_REVOCATION(19, "撤案签署撤销"),
        // SIGNED(20, "签署完成"),
        // WITHDRAW_SIGNED(21, "撤案签署完成"),
        [NameInMap("case_status")]
        [Validation(Required=true)]
        public string CaseStatus { get; set; }

        // 案件提交时间
        [NameInMap("submit_time")]
        [Validation(Required=true)]
        public string SubmitTime { get; set; }

        // 维权机构
        [NameInMap("arbitral_body")]
        [Validation(Required=true)]
        public string ArbitralBody { get; set; }

        // 结案时间 如没有则为""
        [NameInMap("close_time")]
        [Validation(Required=false)]
        public string CloseTime { get; set; }

        // 案号 如没有则为""
        [NameInMap("acceptance_number")]
        [Validation(Required=false)]
        public string AcceptanceNumber { get; set; }

        // 案件回款金额,两位小数 单位(元) 如没有则为""
        [NameInMap("case_payment_actual_amount")]
        [Validation(Required=false)]
        public string CasePaymentActualAmount { get; set; }

        // 是否能够下载 true可以下载 false没有可下载文件
        [NameInMap("can_download")]
        [Validation(Required=true)]
        public string CanDownload { get; set; }

    }

}
