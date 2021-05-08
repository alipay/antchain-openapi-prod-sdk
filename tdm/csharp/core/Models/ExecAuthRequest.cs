// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class ExecAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被授权租户身份ID：
        // 
        // 身份证号/统一社会组织机构信用码
        [NameInMap("authorized_identity")]
        [Validation(Required=true)]
        public string AuthorizedIdentity { get; set; }

        // 分配code
        // 
        // 
        [NameInMap("authorized_platform_identity")]
        [Validation(Required=true)]
        public string AuthorizedPlatformIdentity { get; set; }

        // 授权协议
        [NameInMap("auth_agreement")]
        [Validation(Required=true)]
        public AuthAgreement AuthAgreement { get; set; }

        // 扩展字段,目前是一个json串，传入相关附加信息，如果对应的附加信息key不需要，可以不传，
        // 
        // key对应的value数据字典由平台提供
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 授权租户身份ID：
        // 身份证号/统一社会组织机构信用码
        // 
        // 
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 请求流水号(64位 由平台方定义)_
        // 幂等标示
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 标的物
        // 
        // 
        [NameInMap("target_code")]
        [Validation(Required=true)]
        public string TargetCode { get; set; }

        // 核身产品类型
        [NameInMap("certification_type")]
        [Validation(Required=false)]
        public string CertificationType { get; set; }

        // 核身信息
        // 
        // 
        [NameInMap("certification_info")]
        [Validation(Required=false)]
        public string CertificationInfo { get; set; }

    }

}
