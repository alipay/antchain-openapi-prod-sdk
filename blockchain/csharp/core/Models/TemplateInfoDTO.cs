// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 证书模板详情类
    public class TemplateInfoDTO : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 模板类别：马拉松类、滑雪类
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 模板内容， json格式文本
        [NameInMap("claim_template")]
        [Validation(Required=true)]
        public string ClaimTemplate { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

    }

}
