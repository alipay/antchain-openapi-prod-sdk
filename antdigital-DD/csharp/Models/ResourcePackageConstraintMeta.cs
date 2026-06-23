// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 资源包约束
    public class ResourcePackageConstraintMeta : TeaModel {
        // 模板code
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_deadline</para>
        /// </summary>
        [NameInMap("template_name")]
        [Validation(Required=true)]
        public string TemplateName { get; set; }

        // 约束码
        /// <summary>
        /// <b>Example:</b>
        /// <para>productCode</para>
        /// </summary>
        [NameInMap("constraint_code")]
        [Validation(Required=true)]
        public string ConstraintCode { get; set; }

        // 约束名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>抵扣约束</para>
        /// </summary>
        [NameInMap("constraint_name")]
        [Validation(Required=true)]
        public string ConstraintName { get; set; }

        // 约束表达式
        /// <summary>
        /// <b>Example:</b>
        /// <para>ql表达式</para>
        /// </summary>
        [NameInMap("constraint_expression")]
        [Validation(Required=true)]
        public string ConstraintExpression { get; set; }

        // 约束类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEDUCT</para>
        /// </summary>
        [NameInMap("constraint_type")]
        [Validation(Required=true)]
        public string ConstraintType { get; set; }

    }

}
