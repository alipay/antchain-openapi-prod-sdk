// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // drm 推送配置地址
    public class SiteWithDrm : TeaModel {
        // 站点名称
        [NameInMap("site_name")]
        [Validation(Required=true)]
        public string SiteName { get; set; }

        // 端点
        [NameInMap("endpoint")]
        [Validation(Required=true)]
        public string Endpoint { get; set; }

        // ldc
        [NameInMap("ldcs")]
        [Validation(Required=true)]
        public List<string> Ldcs { get; set; }

    }

}
