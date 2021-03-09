// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 一组具有依赖关系的 AppDomain，可以转换为一个树形结构
    public class AppDomainFlatten : TeaModel {
        // 一组具有依赖关系的 AppDomain
        [NameInMap("app_domains")]
        [Validation(Required=false)]
        public List<AppDomain> AppDomains { get; set; }

    }

}
