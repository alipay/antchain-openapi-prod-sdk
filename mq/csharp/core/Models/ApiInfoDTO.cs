// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // Api接口信息
    public class ApiInfoDTO : TeaModel {
        // api详细描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // api名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 负责人
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // api路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // api简介
        [NameInMap("summary")]
        [Validation(Required=true)]
        public string Summary { get; set; }

        // 开关
        [NameInMap("switch_open")]
        [Validation(Required=true)]
        public bool? SwitchOpen { get; set; }

        // sofamq action 名称
        [NameInMap("sofamq_action")]
        [Validation(Required=false)]
        public string SofamqAction { get; set; }

        // 是否默认分配给普通用户
        [NameInMap("user_default_assign")]
        [Validation(Required=false)]
        public bool? UserDefaultAssign { get; set; }

        // 是否默认分配给 app owner
        [NameInMap("owner_default_assign")]
        [Validation(Required=false)]
        public bool? OwnerDefaultAssign { get; set; }

    }

}
