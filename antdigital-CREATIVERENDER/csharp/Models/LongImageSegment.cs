// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 基金长图分段当前快照，包含头图和正文段图及其版本信息。
    public class LongImageSegment : TeaModel {
        // 全局唯一的分段业务 ID。
        /// <summary>
        /// <b>Example:</b>
        /// <para>LS_xxx</para>
        /// </summary>
        [NameInMap("segment_id")]
        [Validation(Required=false)]
        public string SegmentId { get; set; }

        // 分段类型：BANNER 为长图头图；CONTENT 为正文段图。
        /// <summary>
        /// <b>Example:</b>
        /// <para>BANNER</para>
        /// </summary>
        [NameInMap("segment_type")]
        [Validation(Required=false)]
        public string SegmentType { get; set; }

        // 展示顺序，从 0 开始；头图固定为 0，正文从 1 开始，值越小越靠前。
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("sort_no")]
        [Validation(Required=false)]
        public long? SortNo { get; set; }

        // 首次生成该分段使用的原文，后续编辑或回滚不会修改。
        /// <summary>
        /// <b>Example:</b>
        /// <para>基金投资亮点</para>
        /// </summary>
        [NameInMap("source_text")]
        [Validation(Required=false)]
        public string SourceText { get; set; }

        // 当前分段版本 ID；仅在 current_status 为 SUCCESS 时可作为子图编辑来源。
        /// <summary>
        /// <b>Example:</b>
        /// <para>LV_xxx</para>
        /// </summary>
        [NameInMap("current_version_id")]
        [Validation(Required=false)]
        public string CurrentVersionId { get; set; }

        // 当前版本状态：PROCESSING、SUCCESS、FAILED、CONFLICT。
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("current_status")]
        [Validation(Required=false)]
        public string CurrentStatus { get; set; }

        // 当前版本的图片地址。
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://example.com/segment.png">https://example.com/segment.png</a></para>
        /// </summary>
        [NameInMap("current_image_url")]
        [Validation(Required=false)]
        public string CurrentImageUrl { get; set; }

        // 最近可用的成功版本 ID，可作为子图编辑来源；没有成功版本时为空。
        /// <summary>
        /// <b>Example:</b>
        /// <para>LV_xxx</para>
        /// </summary>
        [NameInMap("last_success_version_id")]
        [Validation(Required=false)]
        public string LastSuccessVersionId { get; set; }

        // last_success_version_id 对应的图片地址；没有成功成果时为空。
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://example.com/segment.png">https://example.com/segment.png</a></para>
        /// </summary>
        [NameInMap("last_success_image_url")]
        [Validation(Required=false)]
        public string LastSuccessImageUrl { get; set; }

    }

}
