// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 资源包模板模型
    public class ResPackageTemplateNewMeta : TeaModel {
        // 资源包code
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_deadline</para>
        /// </summary>
        [NameInMap("template_name")]
        [Validation(Required=true)]
        public string TemplateName { get; set; }

        // 资源包模板类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>single</para>
        /// </summary>
        [NameInMap("template_type")]
        [Validation(Required=true)]
        public string TemplateType { get; set; }

        // 抵扣类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>deadline</para>
        /// </summary>
        [NameInMap("deduct_type")]
        [Validation(Required=true)]
        public string DeductType { get; set; }

        // 资源包l5code
        /// <summary>
        /// <b>Example:</b>
        /// <para>testcode</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 资源包serviceCode
        /// <summary>
        /// <b>Example:</b>
        /// <para>serviceCode</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 资源包模板名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试资源包模板</para>
        /// </summary>
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 可抵扣的l5code
        /// <summary>
        /// <b>Example:</b>
        /// <para>testcode</para>
        /// </summary>
        [NameInMap("applicable_product_name")]
        [Validation(Required=true)]
        public string ApplicableProductName { get; set; }

        // 收费事件码
        /// <summary>
        /// <b>Example:</b>
        /// <para>eventcode</para>
        /// </summary>
        [NameInMap("prod_event_code")]
        [Validation(Required=false)]
        public string ProdEventCode { get; set; }

        // 抵扣优先级
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("priority")]
        [Validation(Required=false)]
        public string Priority { get; set; }

        // 是否可续费
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("renewable")]
        [Validation(Required=false)]
        public bool? Renewable { get; set; }

        // 是否可升级
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("upgradable")]
        [Validation(Required=false)]
        public bool? Upgradable { get; set; }

        // 单位转换关系
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;ratio&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;次&quot;,&quot;roundMode&quot;:7,&quot;scale&quot;:0},{&quot;ratio&quot;:&quot;10000&quot;,&quot;unit&quot;:&quot;万次&quot;,&quot;roundMode&quot;:4,&quot;scale&quot;:4}]</para>
        /// </summary>
        [NameInMap("unit_key")]
        [Validation(Required=true)]
        public string UnitKey { get; set; }

        // 是否计算金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("calc_amount")]
        [Validation(Required=true)]
        public bool? CalcAmount { get; set; }

        // 是否使用子包
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("sub_pack")]
        [Validation(Required=true)]
        public bool? SubPack { get; set; }

        // 子包切分规则
        /// <summary>
        /// <b>Example:</b>
        /// <para>None</para>
        /// </summary>
        [NameInMap("sub_pack_split_type")]
        [Validation(Required=false)]
        public string SubPackSplitType { get; set; }

        // 关联子包模版
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_deadline</para>
        /// </summary>
        [NameInMap("rel_template")]
        [Validation(Required=false)]
        public string RelTemplate { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>effect</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 资源包约束元数据列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("resource_package_constraint_metas")]
        [Validation(Required=false)]
        public List<ResourcePackageConstraintMeta> ResourcePackageConstraintMetas { get; set; }

    }

}
