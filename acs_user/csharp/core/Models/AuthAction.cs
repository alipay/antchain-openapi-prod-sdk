// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_USER.Models
{
    // 功能点信息
    public class AuthAction : TeaModel {
        // 权限点编码
        [NameInMap("action_code")]
        [Validation(Required=true)]
        public string ActionCode { get; set; }

        // 权限点名称
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // 归属产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 权限点级别
        [NameInMap("action_level")]
        [Validation(Required=true)]
        public long? ActionLevel { get; set; }

        // 是否展示
        [NameInMap("is_show")]
        [Validation(Required=true)]
        public bool? IsShow { get; set; }

        // 权限点描述信息
        [NameInMap("action_description")]
        [Validation(Required=false)]
        public string ActionDescription { get; set; }

        // 父权限点编码
        [NameInMap("parent_action_code")]
        [Validation(Required=false)]
        public string ParentActionCode { get; set; }

    }

}
