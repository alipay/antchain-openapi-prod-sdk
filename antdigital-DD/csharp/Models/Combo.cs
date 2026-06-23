// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 套餐结构
    public class Combo : TeaModel {
        // 套餐名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试套餐</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 套餐编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>KKAASP00001001</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 套餐版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>SPV202105192651</para>
        /// </summary>
        [NameInMap("vid")]
        [Validation(Required=true)]
        public string Vid { get; set; }

        // 套餐描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是一个套餐</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 扩展信息，JSON结构，包含标签、个性化配置等数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;key&quot;:&quot;name&quot;}</para>
        /// </summary>
        [NameInMap("extends_config")]
        [Validation(Required=true)]
        public string ExtendsConfig { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ONLINE</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 套餐内商品列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[] </para>
        /// </summary>
        [NameInMap("commodities")]
        [Validation(Required=true)]
        public List<ComboCommodity> Commodities { get; set; }

    }

}
