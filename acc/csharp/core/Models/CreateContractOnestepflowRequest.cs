// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
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
        // 
        [NameInMap("auto_archive")]
        [Validation(Required=false)]
        public bool? AutoArchive { get; set; }

        // 是否自动开启，默认false。
        // 
        [NameInMap("auto_initiate")]
        [Validation(Required=false)]
        public bool? AutoInitiate { get; set; }

        // 文件主题
        // 
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 流程备注
        // 
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 流程配置
        [NameInMap("contract_sign_flow_config")]
        [Validation(Required=true)]
        public Contractsignflowconfig ContractSignFlowConfig { get; set; }

        // 合同文件
        [NameInMap("docs")]
        [Validation(Required=true)]
        public List<ContractDocument> Docs { get; set; }

        // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
        // 
        [NameInMap("initiator_account_id")]
        [Validation(Required=false)]
        public string InitiatorAccountId { get; set; }

        // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
        // 
        [NameInMap("initiator_authorized_account_id")]
        [Validation(Required=false)]
        public string InitiatorAuthorizedAccountId { get; set; }

        // 签署操作人个人账号标识，即操作本次签署的个人
        // 
        [NameInMap("sign_fields")]
        [Validation(Required=true)]
        public List<OneStepSignField> SignFields { get; set; }

        // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
        // 
        [NameInMap("sign_platform")]
        [Validation(Required=false)]
        public string SignPlatform { get; set; }

        // 签署有效截止日期，毫秒，默认3天失效
        // 
        [NameInMap("sign_validity")]
        [Validation(Required=true)]
        public long? SignValidity { get; set; }

    }

}
