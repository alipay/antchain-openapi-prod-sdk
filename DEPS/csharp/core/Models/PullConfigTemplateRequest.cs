// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class PullConfigTemplateRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // RELEAES：获取最新的、已经发布的参数模板；
        // DRAFT：获取最新的参数模板草稿；
        // 不指定：获取已存在的最新的参数模板，不区分已发布或者草稿态；
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

    }

}
