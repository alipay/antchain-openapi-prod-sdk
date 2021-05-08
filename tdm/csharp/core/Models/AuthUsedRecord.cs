// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 授权使用记录
    // 
    // 
    public class AuthUsedRecord : TeaModel {
        // 被授权租户名称：
        // 
        // 身份证号/统一社会组织机构信用码
        // 
        // 
        [NameInMap("authorized_name")]
        [Validation(Required=true)]
        public string AuthorizedName { get; set; }

        // 授权码
        // 
        // 
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

        // 链的信息
        [NameInMap("chain_info")]
        [Validation(Required=true)]
        public ChainInfo ChainInfo { get; set; }

        // 扩展字段
        [NameInMap("extend_params")]
        [Validation(Required=true)]
        public string ExtendParams { get; set; }

        // 标的物,产品码名称
        // 
        // 
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // 授权可信内容
        [NameInMap("tee_data")]
        [Validation(Required=false)]
        public string TeeData { get; set; }

        // 数据使用时间
        // 
        // 
        [NameInMap("use_date")]
        [Validation(Required=true)]
        public string UseDate { get; set; }

    }

}
