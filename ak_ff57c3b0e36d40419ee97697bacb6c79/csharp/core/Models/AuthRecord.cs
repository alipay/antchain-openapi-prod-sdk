// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ff57c3b0e36d40419ee97697bacb6c79.Models
{
    // 授权记录
    public class AuthRecord : TeaModel {
        // 被授权租户名称：
        // 身份证号/统一社会组织机构信用码
        [NameInMap("authorized_name")]
        [Validation(Required=true)]
        public string AuthorizedName { get; set; }

        // 授权协议规则
        [NameInMap("auth_agreement")]
        [Validation(Required=true)]
        public AuthAgreement AuthAgreement { get; set; }

        // 授权码
        // 
        // 
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

        // 授权时间	
        // 
        [NameInMap("auth_date")]
        [Validation(Required=true)]
        public string AuthDate { get; set; }

        // 授权有效状态：
        // 1、生效中、
        // 0、失效
        // 
        // 
        [NameInMap("auth_status")]
        [Validation(Required=true)]
        public string AuthStatus { get; set; }

        // 链的信息
        [NameInMap("chain_info")]
        [Validation(Required=true)]
        public ChainInfo ChainInfo { get; set; }

        // 授权租户身份ID：
        // 身份证号/统一社会组织机构信用码
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 授权用户名称
        [NameInMap("data_owner_name")]
        [Validation(Required=true)]
        public string DataOwnerName { get; set; }

        // 扩展字段，与target_name拼成可见的授权详情name
        // 
        // 
        [NameInMap("extend_params")]
        [Validation(Required=true)]
        public string ExtendParams { get; set; }

        // 标的物名称
        // 
        // 
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // 授权可信数据
        [NameInMap("tee_data")]
        [Validation(Required=false)]
        public string TeeData { get; set; }

    }

}
