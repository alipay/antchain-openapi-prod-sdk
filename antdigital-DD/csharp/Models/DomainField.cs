// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计量项模型
    public class DomainField : TeaModel {
        // 计量项code
        /// <summary>
        /// <b>Example:</b>
        /// <para>request_num</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 计量项英文名
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("english_name")]
        [Validation(Required=false)]
        public string EnglishName { get; set; }

        // 计量字段中文名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>调用量</para>
        /// </summary>
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        //    枚举，可选
        //       配置型
        //      消耗型
        //      *其他
        /// <summary>
        /// <b>Example:</b>
        /// <para>config</para>
        /// </summary>
        [NameInMap("field_type")]
        [Validation(Required=false)]
        public string FieldType { get; set; }

        // 字段构成索引时的格式化长度<br>
        /// <summary>
        /// <b>Example:</b>
        /// <para>-1</para>
        /// </summary>
        [NameInMap("format_length")]
        [Validation(Required=false)]
        public string FormatLength { get; set; }

        // 默认值,可选
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        // 是否必填，默认必填写
        /// <summary>
        /// <b>Example:</b>
        /// <para>Y</para>
        /// </summary>
        [NameInMap("if_null")]
        [Validation(Required=false)]
        public string IfNull { get; set; }

        // 是否增量推送
        /// <summary>
        /// <b>Example:</b>
        /// <para>N</para>
        /// </summary>
        [NameInMap("if_increment")]
        [Validation(Required=false)]
        public string IfIncrement { get; set; }

        // 单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>元</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 计量项说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>计量项说明</para>
        /// </summary>
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 关联字段排序
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("column")]
        [Validation(Required=false)]
        public string Column { get; set; }

        // 计量项值约束
        [NameInMap("field_value_limit")]
        [Validation(Required=false)]
        public FieldValueLimit FieldValueLimit { get; set; }

        // 聚合方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUM</para>
        /// </summary>
        [NameInMap("aggregation_type")]
        [Validation(Required=false)]
        public string AggregationType { get; set; }

    }

}
