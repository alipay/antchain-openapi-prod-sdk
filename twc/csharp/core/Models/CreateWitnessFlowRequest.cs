// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateWitnessFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景，最大255长度
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 客户端名称，比如签章客户端，最长长度50
        [NameInMap("client_name")]
        [Validation(Required=false)]
        public string ClientName { get; set; }

        // 客户端版本
        [NameInMap("client_version")]
        [Validation(Required=false)]
        public string ClientVersion { get; set; }

        // 合同有效截止时间，时间戳
        [NameInMap("contract_validity")]
        [Validation(Required=false)]
        public string ContractValidity { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 发起方账号id
        [NameInMap("initiator_account_id")]
        [Validation(Required=false)]
        public string InitiatorAccountId { get; set; }

        // 发起端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
        [NameInMap("launch_endpoint")]
        [Validation(Required=true)]
        public string LaunchEndpoint { get; set; }

        // 发起ip
        [NameInMap("launch_ip")]
        [Validation(Required=true)]
        public string LaunchIp { get; set; }

        // 手机盾逻辑版本，0-不支持用印审批、需要扣费，1-支持用印审批、无需扣费，默认0
        [NameInMap("mobile_shield_version")]
        [Validation(Required=false)]
        public long? MobileShieldVersion { get; set; }

        // 扣费方账号id
        [NameInMap("payer_account_id")]
        [Validation(Required=false)]
        public string PayerAccountId { get; set; }

        // 签署截止时间，时间戳
        [NameInMap("sign_deadline")]
        [Validation(Required=false)]
        public string SignDeadline { get; set; }

        // 签署顺序，SIGN_SEQUENCE-顺序签署，SIGN_NON_SEQUENCE-无序签署
        [NameInMap("sign_order")]
        [Validation(Required=true)]
        public string SignOrder { get; set; }

        // 流程类型，0-签署流程，1-作废流程，默认0
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // 发起请求的实例应用ID
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 发起请求的鉴权token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

    }

}
