// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用扩展信息
    public class AppExtraInfo : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 模板ID
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 模板类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 最近修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // 应用扩展信息ID
        [NameInMap("app_extrainfo_id")]
        [Validation(Required=false)]
        public string AppExtrainfoId { get; set; }

        // 应用ID
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 模板数据ID
        [NameInMap("template_data_id")]
        [Validation(Required=false)]
        public string TemplateDataId { get; set; }

    }

}
