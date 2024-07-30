// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PagequeryIotlinkAppmanagerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名称
        [NameInMap("apk_name")]
        [Validation(Required=false)]
        public string ApkName { get; set; }

        // 应用版本号
        [NameInMap("apk_version")]
        [Validation(Required=false)]
        public string ApkVersion { get; set; }

        // 当前页
        // 默认第一页
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页数量
        // 默认20条，最大100条
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 品类code
        [NameInMap("category_code")]
        [Validation(Required=false)]
        public string CategoryCode { get; set; }

        // 应用模块名称，由查询应用类型列表获取
        [NameInMap("module_name")]
        [Validation(Required=false)]
        public string ModuleName { get; set; }

    }

}
