// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用分组概要信息列表
    public class AppGroupSimpleViewList : TeaModel {
        // 应用分组列表
        [NameInMap("app_group_list")]
        [Validation(Required=true)]
        public List<AppGroupSimpleView> AppGroupList { get; set; }

    }

}
