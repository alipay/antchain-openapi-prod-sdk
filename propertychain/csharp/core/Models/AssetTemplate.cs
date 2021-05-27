// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 数据字典
    public class AssetTemplate : TeaModel {
        // 模板类型id
        [NameInMap("category_id")]
        [Validation(Required=false)]
        public string CategoryId { get; set; }

        // 模板内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 模板id
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 模板名称
        [NameInMap("template_name")]
        [Validation(Required=false)]
        public string TemplateName { get; set; }

        // 是否生效
        [NameInMap("valid")]
        [Validation(Required=false)]
        public bool? Valid { get; set; }

        // 是否使用
        [NameInMap("used")]
        [Validation(Required=false)]
        public bool? Used { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 联盟Id
        [NameInMap("league_uid")]
        [Validation(Required=false)]
        public string LeagueUid { get; set; }

        // 标准数据字典
        [NameInMap("standard")]
        [Validation(Required=false)]
        public bool? Standard { get; set; }

    }

}
