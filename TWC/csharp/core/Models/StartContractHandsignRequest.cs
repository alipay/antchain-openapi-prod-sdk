// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class StartContractHandsignRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 代理商户账户
        [NameInMap("agent_account_id")]
        [Validation(Required=false)]
        public string AgentAccountId { get; set; }

        // 是否自动归档，默认为true
        [NameInMap("auto_archive")]
        [Validation(Required=false)]
        public bool? AutoArchive { get; set; }

        // 合同文件主题
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 文件到期前，提前多少小时回调提醒续签，小时（时间区间：1小时——15天），默认不提醒
        [NameInMap("contract_remind")]
        [Validation(Required=false)]
        public long? ContractRemind { get; set; }

        // 签署流程任务配置信息
        [NameInMap("contract_sign_flow_config")]
        [Validation(Required=false)]
        public ContractSignFlowConfig ContractSignFlowConfig { get; set; }

        // 文件有效截止日期,毫秒，默认不失效
        [NameInMap("contract_validity")]
        [Validation(Required=false)]
        public long? ContractValidity { get; set; }

        // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
        [NameInMap("initiator_account_id")]
        [Validation(Required=false)]
        public string InitiatorAccountId { get; set; }

        // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
        // 
        // 
        [NameInMap("initiator_authorized_account_id")]
        [Validation(Required=false)]
        public string InitiatorAuthorizedAccountId { get; set; }

        // 代扣规则详情，不可为空
        [NameInMap("repayment_order_info")]
        [Validation(Required=false)]
        public List<RepaymentOrderRequest> RepaymentOrderInfo { get; set; }

        // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
        [NameInMap("sign_platform")]
        [Validation(Required=false)]
        public string SignPlatform { get; set; }

        // 签署有效截止日期,毫秒，默认不失效
        [NameInMap("sign_validity")]
        [Validation(Required=false)]
        public string SignValidity { get; set; }

        // 输入项填充内容，以key:value传入
        [NameInMap("simple_form_fields")]
        [Validation(Required=true)]
        public string SimpleFormFields { get; set; }

        // 待签署的智能合同模板ID
        [NameInMap("template")]
        [Validation(Required=true)]
        public string Template { get; set; }

        // 待签署客户的账户ID
        [NameInMap("user_account")]
        [Validation(Required=true)]
        public string UserAccount { get; set; }

        // 是否需要短网址
        [NameInMap("short_url")]
        [Validation(Required=false)]
        public bool? ShortUrl { get; set; }

    }

}
