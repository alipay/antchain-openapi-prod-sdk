// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractOnestepflowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 是否自动归档，默认false。
        [NameInMap("auto_archive")]
        [Validation(Required=false)]
        public bool? AutoArchive { get; set; }

        // 是否自动开启，默认false。
        [NameInMap("auto_initiate")]
        [Validation(Required=false)]
        public bool? AutoInitiate { get; set; }

        // 文件主题
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 流程备注
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 任务配置信息
        [NameInMap("contract_sign_flow_config")]
        [Validation(Required=false)]
        public ContractSignFlowConfig ContractSignFlowConfig { get; set; }

        // 待签文档信息
        [NameInMap("docs")]
        [Validation(Required=false)]
        public List<ContractDoc> Docs { get; set; }

        // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
        [NameInMap("initiator_account_id")]
        [Validation(Required=false)]
        public string InitiatorAccountId { get; set; }

        // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
        [NameInMap("initiator_authorized_account_id")]
        [Validation(Required=false)]
        public string InitiatorAuthorizedAccountId { get; set; }

        // 流程中的签署区信息
        [NameInMap("sign_fields")]
        [Validation(Required=false)]
        public List<OneStepSignField> SignFields { get; set; }

        // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
        [NameInMap("sign_platform")]
        [Validation(Required=false)]
        public string SignPlatform { get; set; }

        // 签署有效截止日期，毫秒，默认3天失效
        [NameInMap("sign_validity")]
        [Validation(Required=false)]
        public long? SignValidity { get; set; }

        // 是否强制代扣
        [NameInMap("auto_deduction_force")]
        [Validation(Required=false)]
        public bool? AutoDeductionForce { get; set; }

        // 代扣规则详情
        [NameInMap("repayment_order_info")]
        [Validation(Required=false)]
        public List<RepaymentOrderRequest> RepaymentOrderInfo { get; set; }

        // 付款方ID（个人）
        [NameInMap("payer_tuid")]
        [Validation(Required=false)]
        public string PayerTuid { get; set; }

        // 收款方ID(机构)
        [NameInMap("payee_tuid")]
        [Validation(Required=false)]
        public string PayeeTuid { get; set; }

        // 租赁订单Id
        [NameInMap("bcl_order_id")]
        [Validation(Required=false, MaxLength=32)]
        public string BclOrderId { get; set; }

        // 代理客户时，实际用户的租户ID
        [NameInMap("sub_tenant_id")]
        [Validation(Required=false)]
        public string SubTenantId { get; set; }

    }

}
