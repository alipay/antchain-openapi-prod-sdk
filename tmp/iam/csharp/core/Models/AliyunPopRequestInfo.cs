// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 阿里云POP透传参数
    public class AliyunPopRequestInfo : TeaModel {
        // AccessKey
        [NameInMap("access_key_id")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        // 是否开启MFA
        [NameInMap("ak_mfa_present")]
        [Validation(Required=false)]
        public bool? AkMfaPresent { get; set; }

        // Ak系统中记录的客户端代理信息，比如来源于Ecs控制台的请求取之就是EcsConsole
        [NameInMap("ak_proxy")]
        [Validation(Required=false)]
        public string AkProxy { get; set; }

        // API名称
        [NameInMap("api_name")]
        [Validation(Required=false)]
        public string ApiName { get; set; }

        // 调用者IP
        // 
        [NameInMap("app_ip")]
        [Validation(Required=false)]
        public string AppIp { get; set; }

        // 调用者BID
        [NameInMap("caller_bid")]
        [Validation(Required=false)]
        public string CallerBid { get; set; }

        // 调用者主账号ID
        [NameInMap("caller_parent_id")]
        [Validation(Required=false)]
        public string CallerParentId { get; set; }

        // 调用者类型，支持partner, customer, sub, AssumedRoleUser
        [NameInMap("caller_type")]
        [Validation(Required=true)]
        public string CallerType { get; set; }

        // 调用者ID
        [NameInMap("caller_uid")]
        [Validation(Required=false)]
        public string CallerUid { get; set; }

        // 用户原始请求是否使用https
        [NameInMap("proxy_original_security_transport")]
        [Validation(Required=false)]
        public bool? ProxyOriginalSecurityTransport { get; set; }

        // 用户原始IP
        // 
        [NameInMap("proxy_original_source_ip")]
        [Validation(Required=false)]
        public string ProxyOriginalSourceIp { get; set; }

        // 提交给网关的原始IP等信息是否可信
        [NameInMap("proxy_trust_transport_info")]
        [Validation(Required=false)]
        public bool? ProxyTrustTransportInfo { get; set; }

        // request_id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // STS token
        [NameInMap("security_token")]
        [Validation(Required=false)]
        public string SecurityToken { get; set; }

        // security_transport
        [NameInMap("security_transport")]
        [Validation(Required=false)]
        public bool? SecurityTransport { get; set; }

        // 来源IP
        [NameInMap("source_ip")]
        [Validation(Required=false)]
        public string SourceIp { get; set; }

        // StsTokenAccountBID，创建子账号的主账号 的BID。使用StsToken调用POP时才有此参数
        [NameInMap("sts_token_caller_bid")]
        [Validation(Required=false)]
        public string StsTokenCallerBid { get; set; }

        // STS token调用者ID
        [NameInMap("sts_token_caller_uid")]
        [Validation(Required=false)]
        public string StsTokenCallerUid { get; set; }

        // 子账号id:sessioname。调用者阿里云principalId，使用StsToken调用POP时才有此参数
        [NameInMap("sts_token_principal_id")]
        [Validation(Required=false)]
        public string StsTokenPrincipalId { get; set; }

        // 调用者阿里云roleId，使用StsToken调用POP时才有此参数
        // 
        [NameInMap("sts_token_role_id")]
        [Validation(Required=false)]
        public string StsTokenRoleId { get; set; }

        // STS token绑定用户ID
        [NameInMap("sts_token_user_id")]
        [Validation(Required=false)]
        public string StsTokenUserId { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
