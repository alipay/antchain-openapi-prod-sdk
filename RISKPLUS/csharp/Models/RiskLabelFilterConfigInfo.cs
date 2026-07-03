// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 标签过滤配置
    public class RiskLabelFilterConfigInfo : TeaModel {
        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 是否为基本筛选标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("is_base")]
        [Validation(Required=true)]
        public long? IsBase { get; set; }

        // 标记删除
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("is_delete")]
        [Validation(Required=true)]
        public long? IsDelete { get; set; }

        // 操作人员ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 地区名
        /// <summary>
        /// <b>Example:</b>
        /// <para>place_name</para>
        /// </summary>
        [NameInMap("place_name")]
        [Validation(Required=true)]
        public string PlaceName { get; set; }

        // 地区类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>place_type</para>
        /// </summary>
        [NameInMap("place_type")]
        [Validation(Required=true)]
        public string PlaceType { get; set; }

        // 标签ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("tag_id")]
        [Validation(Required=true)]
        public string TagId { get; set; }

    }

}
