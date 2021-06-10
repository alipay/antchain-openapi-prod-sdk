// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    // 二级商户进件申请单
    public class MerchantOrderInfo : TeaModel {
        // 申请单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 平台方的用户id, 保持唯一
        [NameInMap("merchant_user_id")]
        [Validation(Required=true)]
        public string MerchantUserId { get; set; }

        // 申请状态 99-已完结;-1-失败;031-审核中
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 风控审批状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
        [NameInMap("fk_audit")]
        [Validation(Required=false)]
        public string FkAudit { get; set; }

        // 风控审批备注
        [NameInMap("fk_audit_memo")]
        [Validation(Required=false)]
        public string FkAuditMemo { get; set; }

        // 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
        [NameInMap("kz_audit")]
        [Validation(Required=false)]
        public string KzAudit { get; set; }

        // 客资审批备注
        [NameInMap("kz_audit_memo")]
        [Validation(Required=false)]
        public string KzAuditMemo { get; set; }

        // 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
        [NameInMap("sub_confirm")]
        [Validation(Required=false)]
        public string SubConfirm { get; set; }

        // 进件备注, 主要用于保存审核拒绝原因
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
