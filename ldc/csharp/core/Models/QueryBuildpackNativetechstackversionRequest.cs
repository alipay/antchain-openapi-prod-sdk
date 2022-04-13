// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryBuildpackNativetechstackversionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 技术栈名称。
        // 原则上允许用户定义同名自定义技术栈（e.g,用户创建和全局同名的技术栈SOFA），此时优先获取用户自定义技术栈下技术栈版本；
        [NameInMap("tech_stack")]
        [Validation(Required=true)]
        public string TechStack { get; set; }

        // 当前页码， 默认值为1
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 一页获取个数，默认值10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
