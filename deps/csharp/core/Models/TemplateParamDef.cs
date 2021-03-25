// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用参数配置管理-模板参数定义
    public class TemplateParamDef : TeaModel {
        // 数据保密级别，L1,L2,L3
        [NameInMap("data_level")]
        [Validation(Required=false)]
        public string DataLevel { get; set; }

        // 默认值，表达式解析结果为空时使用
        [NameInMap("default_val")]
        [Validation(Required=false)]
        public string DefaultVal { get; set; }

        // 是否已删除
        [NameInMap("deleted")]
        [Validation(Required=false)]
        public bool? Deleted { get; set; }

        // 参数描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 参数id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 参数名
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 版本
        [NameInMap("param_version")]
        [Validation(Required=false)]
        public long? ParamVersion { get; set; }

        // 参数值类型，CONST/EXPR
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 参数值，可能是一个常量或者表达式
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreatedTime { get; set; }

        // 修改时间
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModifiedTime { get; set; }

    }

}
