// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用分组视图
    public class AppDomainView : TeaModel {
        // ownerName
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // fatherDomainName
        [NameInMap("father_domain_name")]
        [Validation(Required=false)]
        public string FatherDomainName { get; set; }

        // 应用列表
        [NameInMap("apps")]
        [Validation(Required=false)]
        public List<AppView> Apps { get; set; }

        // AppDomainView 的父类 AppDomain
        [NameInMap("base_app_domain")]
        [Validation(Required=false)]
        public List<AppDomain> BaseAppDomain { get; set; }

    }

}
