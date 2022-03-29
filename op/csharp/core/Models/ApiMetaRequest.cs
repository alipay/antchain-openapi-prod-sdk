// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // Api基础数据
    public class ApiMetaRequest : TeaModel {
        // 产品码
        [NameInMap("provider_name")]
        [Validation(Required=true)]
        public string ProviderName { get; set; }

        // 套件版本号
        [NameInMap("suite_version")]
        [Validation(Required=true)]
        public string SuiteVersion { get; set; }

        // api分组名称
        [NameInMap("group_name")]
        [Validation(Required=true)]
        public string GroupName { get; set; }

        // api名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 新名字
        [NameInMap("new_name")]
        [Validation(Required=false)]
        public string NewName { get; set; }

        // api拥有者
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // api简介
        [NameInMap("summary")]
        [Validation(Required=true)]
        public string Summary { get; set; }

        // 是否是内部api
        [NameInMap("internal")]
        [Validation(Required=true)]
        public bool? Internal { get; set; }

        // api版本
        [NameInMap("api_version")]
        [Validation(Required=true)]
        public string ApiVersion { get; set; }

        // api描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 是否是第三方代理
        [NameInMap("third_part_auth")]
        [Validation(Required=false)]
        public bool? ThirdPartAuth { get; set; }

        // api状态
        [NameInMap("status_enum")]
        [Validation(Required=true)]
        public StatusEnum StatusEnum { get; set; }

        // 扩展参数
        [NameInMap("ext_attribute")]
        [Validation(Required=false)]
        public string ExtAttribute { get; set; }

    }

}
