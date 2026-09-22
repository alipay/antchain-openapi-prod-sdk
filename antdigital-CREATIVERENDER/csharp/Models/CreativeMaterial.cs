// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 素材
    public class CreativeMaterial : TeaModel {
        // Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
        /// <summary>
        /// <b>Example:</b>
        /// <para>RETAIL</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 素材ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>d55ad74641ce8895ad1321e8b36c4d70</para>
        /// </summary>
        [NameInMap("material_id")]
        [Validation(Required=false)]
        public string MaterialId { get; set; }

        // 素材类型，如 IMAGE / ANIMATION / FONT
        /// <summary>
        /// <b>Example:</b>
        /// <para>IMAGE</para>
        /// </summary>
        [NameInMap("material_type")]
        [Validation(Required=false)]
        public string MaterialType { get; set; }

        // 素材形式（SINGLE/PACKAGE）
        /// <summary>
        /// <b>Example:</b>
        /// <para>SINGLE</para>
        /// </summary>
        [NameInMap("material_form")]
        [Validation(Required=false)]
        public string MaterialForm { get; set; }

        // 父素材ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>c96a7673a96a4178809f6c0f4da40558</para>
        /// </summary>
        [NameInMap("parent_material_id")]
        [Validation(Required=false)]
        public string ParentMaterialId { get; set; }

        // 是否为封面
        /// <summary>
        /// <b>Example:</b>
        /// <para>false</para>
        /// </summary>
        [NameInMap("cover")]
        [Validation(Required=false)]
        public bool? Cover { get; set; }

        // 素材名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>海报</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 素材文件URL
        /// <summary>
        /// <b>Example:</b>
        /// <para>creative/20260909/sample.jpg</para>
        /// </summary>
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 宽度（像素）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1080</para>
        /// </summary>
        [NameInMap("width")]
        [Validation(Required=false)]
        public long? Width { get; set; }

        // 高度（像素）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1920</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 字体族名（仅 FONT 类型）
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEMO_FONT</para>
        /// </summary>
        [NameInMap("font_family")]
        [Validation(Required=false)]
        public string FontFamily { get; set; }

        // 使用场景
        /// <summary>
        /// <b>Example:</b>
        /// <para>BANNER</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
        /// <summary>
        /// <b>Example:</b>
        /// <para>REFERENCE_STYLE</para>
        /// </summary>
        [NameInMap("material_usage")]
        [Validation(Required=false)]
        public string MaterialUsage { get; set; }

        // RETAIL
        /// <summary>
        /// <b>Example:</b>
        /// <para>行业</para>
        /// </summary>
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

        // 投放平台，多个值使用英文逗号分隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>ALIPAY</para>
        /// </summary>
        [NameInMap("publish_platforms")]
        [Validation(Required=false)]
        public string PublishPlatforms { get; set; }

        // 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
        /// <summary>
        /// <b>Example:</b>
        /// <para>9:16</para>
        /// </summary>
        [NameInMap("material_size_type")]
        [Validation(Required=false)]
        public string MaterialSizeType { get; set; }

        // 空间类型：PERSONAL / ENTERPRISE
        /// <summary>
        /// <b>Example:</b>
        /// <para>ENTERPRISE</para>
        /// </summary>
        [NameInMap("space_type")]
        [Validation(Required=false)]
        public string SpaceType { get; set; }

        // 所有者名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 创建时间，格式 yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-09-21 12:00:00</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

    }

}
