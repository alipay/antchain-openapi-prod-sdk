// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic项目品类信息
    public class CategoryInfo : TeaModel {
        // 品类名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>电力仪表</para>
        /// </summary>
        [NameInMap("category_name")]
        [Validation(Required=true)]
        public string CategoryName { get; set; }

        // 品类编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_power_meter</para>
        /// </summary>
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 描述内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是描述</para>
        /// </summary>
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 行业
        /// <summary>
        /// <b>Example:</b>
        /// <para>工业</para>
        /// </summary>
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 场景
        /// <summary>
        /// <b>Example:</b>
        /// <para>智能工业</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

    }

}
