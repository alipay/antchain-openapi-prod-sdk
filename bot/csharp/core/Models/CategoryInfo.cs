// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic项目品类信息
    public class CategoryInfo : TeaModel {
        // 品类名称
        [NameInMap("category_name")]
        [Validation(Required=true)]
        public string CategoryName { get; set; }

        // 品类编码
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 描述内容
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
