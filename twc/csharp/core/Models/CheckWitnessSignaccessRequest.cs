// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CheckWitnessSignaccessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审批流程id
        [NameInMap("approval_flow_id")]
        [Validation(Required=false)]
        public string ApprovalFlowId { get; set; }

        // 审批结果通知
        [NameInMap("approval_notify_url")]
        [Validation(Required=false)]
        public string ApprovalNotifyUrl { get; set; }

        // 签署文档信息
        [NameInMap("docs")]
        [Validation(Required=true)]
        public List<WitnessDocs> Docs { get; set; }

        // 签署端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
        [NameInMap("endpoint")]
        [Validation(Required=true)]
        public string Endpoint { get; set; }

        // 是否发起审批，默认TRUE
        [NameInMap("launch_approval")]
        [Validation(Required=false)]
        public bool? LaunchApproval { get; set; }

        // 手机盾任务id，用于手机盾审批场景
        [NameInMap("mobile_shield_task_id")]
        [Validation(Required=false)]
        public string MobileShieldTaskId { get; set; }

        // 实名认证凭证
        [NameInMap("realname_auth_code")]
        [Validation(Required=false)]
        public string RealnameAuthCode { get; set; }

        // 印章id列表
        [NameInMap("seal_ids")]
        [Validation(Required=false)]
        public List<string> SealIds { get; set; }

        // 签署人账号id
        [NameInMap("signer_account_id")]
        [Validation(Required=true)]
        public string SignerAccountId { get; set; }

        // 签署人ip
        [NameInMap("signer_ip")]
        [Validation(Required=true)]
        public string SignerIp { get; set; }

        // 签署人类型，1-私有云用户，2-公有云用户，3-手机盾用户
        [NameInMap("signer_type")]
        [Validation(Required=true)]
        public long? SignerType { get; set; }

        // 签署预览地址
        [NameInMap("sign_preview_url")]
        [Validation(Required=false)]
        public string SignPreviewUrl { get; set; }

        // 意愿认证凭证
        [NameInMap("will_auth_code")]
        [Validation(Required=false)]
        public string WillAuthCode { get; set; }

        // 见证流程id
        [NameInMap("witness_flow_id")]
        [Validation(Required=true)]
        public string WitnessFlowId { get; set; }

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
