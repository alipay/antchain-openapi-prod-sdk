// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateInternalContractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署结束信息，phase为FINISH时必选
        [NameInMap("finish_info")]
        [Validation(Required=false)]
        public ContractNotaryFinishInfo FinishInfo { get; set; }

        // 签署流程ID
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 签署发起信息，phase为INIT时必选
        [NameInMap("init_info")]
        [Validation(Required=false)]
        public ContractNotaryInitInfo InitInfo { get; set; }

        // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)，DOCUMENT(正式合同文件)，DEDUCT_CANCEL(代扣计划取消)，DEDUCT_EXECUTION(代扣计划执行)，DEDUCT_PLAN(代扣计划保存)，DEDUCT_REFUND(代扣计划退款)
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 签署过程信息，phase为SIGN时必选
        [NameInMap("sign_info")]
        [Validation(Required=false)]
        public ContractNotarySignInfo SignInfo { get; set; }

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 签署文件存档阶段存证核验信息
        [NameInMap("document_info")]
        [Validation(Required=false)]
        public ContractNotaryDocumentInfo DocumentInfo { get; set; }

        // 电子合同代扣计划取消操作信息
        [NameInMap("cancel_info")]
        [Validation(Required=false)]
        public ContractNotaryDeductCancelInfo CancelInfo { get; set; }

        // 电子合同存证代扣计划执行操作信息
        [NameInMap("execution_info")]
        [Validation(Required=false)]
        public ContractNotaryDeductExecutionInfo ExecutionInfo { get; set; }

        // 电子合同存证代扣计划信息
        [NameInMap("plan_info")]
        [Validation(Required=false)]
        public ContractNotaryDeductPlanInfo PlanInfo { get; set; }

        // 电子合同存证代扣计划退款信息
        [NameInMap("refund_info")]
        [Validation(Required=false)]
        public ContractNotaryDeductRefundInfo RefundInfo { get; set; }

    }

}
