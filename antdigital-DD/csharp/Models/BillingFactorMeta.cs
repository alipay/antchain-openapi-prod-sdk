// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计费因子
    public class BillingFactorMeta : TeaModel {
        // 费用code
        /// <summary>
        /// <b>Example:</b>
        /// <para>费用code</para>
        /// </summary>
        [NameInMap("fee_code")]
        [Validation(Required=false)]
        public string FeeCode { get; set; }

        // 因子code
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("factor_code")]
        [Validation(Required=false)]
        public string FactorCode { get; set; }

        // 因子名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>因子名称</para>
        /// </summary>
        [NameInMap("factor_name")]
        [Validation(Required=false)]
        public string FactorName { get; set; }

        // 因子类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>计费，规格</para>
        /// </summary>
        [NameInMap("factor_type")]
        [Validation(Required=false)]
        public string FactorType { get; set; }

        // 因子单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>元</para>
        /// </summary>
        [NameInMap("factor_unit")]
        [Validation(Required=false)]
        public string FactorUnit { get; set; }

        // 计量项code
        /// <summary>
        /// <b>Example:</b>
        /// <para>计量项code</para>
        /// </summary>
        [NameInMap("meter_feild_code")]
        [Validation(Required=false)]
        public string MeterFeildCode { get; set; }

        // 转换比率，用于展示转换
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("factor_ratio")]
        [Validation(Required=false)]
        public string FactorRatio { get; set; }

        // 是否抵扣资源包
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("deduct_respackage")]
        [Validation(Required=false)]
        public bool? DeductRespackage { get; set; }

        // 是否累计
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_cumulative")]
        [Validation(Required=false)]
        public bool? IsCumulative { get; set; }

        // 数据来源，配置，计量数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>use_data</para>
        /// </summary>
        [NameInMap("val_original")]
        [Validation(Required=false)]
        public string ValOriginal { get; set; }

        // 默认值
        /// <summary>
        /// <b>Example:</b>
        /// <para>默认值</para>
        /// </summary>
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        // 拓展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>拓展信息</para>
        /// </summary>
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 订购模型，价格模型
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("factor_model_type")]
        [Validation(Required=false)]
        public string FactorModelType { get; set; }

    }

}
