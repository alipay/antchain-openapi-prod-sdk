// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractSignflowRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
        [NameInMap("auto_archive")]
        [Validation(Required=false)]
        public bool? AutoArchive { get; set; }

        // 是否强制代扣
        [NameInMap("auto_deduction_force")]
        [Validation(Required=false)]
        public bool? AutoDeductionForce { get; set; }

        // 文件主题
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 任务配置信息
        [NameInMap("contract_sign_flow_config")]
        [Validation(Required=false)]
        public ContractSignFlowConfig ContractSignFlowConfig { get; set; }

        // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
        [NameInMap("initiator_account_id")]
        [Validation(Required=false)]
        public string InitiatorAccountId { get; set; }

        // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
        [NameInMap("initiator_authorized_account_id")]
        [Validation(Required=false)]
        public string InitiatorAuthorizedAccountId { get; set; }

        // 代扣规则详情
        [NameInMap("repayment_order_info")]
        [Validation(Required=false)]
        public List<RepaymentOrderRequest> RepaymentOrderInfo { get; set; }

        // 签署平台，ALIPAY（支付宝小程序）或H5
        [NameInMap("sign_platform")]
        [Validation(Required=false)]
        public string SignPlatform { get; set; }

        // 签署有效截止日期，毫秒，默认3天失效
        [NameInMap("sign_validity")]
        [Validation(Required=false)]
        public long? SignValidity { get; set; }

        //  付款方ID（个人）
        [NameInMap("payer_tuid")]
        [Validation(Required=false)]
        public string PayerTuid { get; set; }

        // 收款方ID(机构)
        [NameInMap("payee_tuid")]
        [Validation(Required=false)]
        public string PayeeTuid { get; set; }

    }

}
