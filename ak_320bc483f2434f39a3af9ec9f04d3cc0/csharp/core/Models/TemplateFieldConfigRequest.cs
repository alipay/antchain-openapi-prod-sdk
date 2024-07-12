// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 模板填充字段实体
    public class TemplateFieldConfigRequest : TeaModel {
        // 字段拥有者（1个人，2客户，3人资服务商）
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 字段名称（英文：identityName、identityNumber、phoneNumber、positionName、salary、salaryNumber、examineStandard、projectDesc）
        [NameInMap("field_name")]
        [Validation(Required=true)]
        public string FieldName { get; set; }

        // 字段名称描述（中文名：姓名、身份证号、手机号、职位、薪资、薪数、考核标准、项目描述）
        [NameInMap("field_name_desc")]
        [Validation(Required=true)]
        public string FieldNameDesc { get; set; }

        // 字段值
        [NameInMap("field_value")]
        [Validation(Required=true)]
        public string FieldValue { get; set; }

    }

}
