// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 图像排黑排白检测结果
    public class ImageBlackWhiteResult : TeaModel {
        // 是否命中（任一维度命中即 true）
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("matched")]
        [Validation(Required=false)]
        public bool? Matched { get; set; }

        // 命中名单类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>WHITE</para>
        /// </summary>
        [NameInMap("match_type")]
        [Validation(Required=false)]
        public string MatchType { get; set; }

        // 命中向量来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>FULL_IMAGE</para>
        /// </summary>
        [NameInMap("match_source")]
        [Validation(Required=false)]
        public string MatchSource { get; set; }

        // 命中得分（ES 返回 score 经归一化后值）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.1</para>
        /// </summary>
        [NameInMap("match_score")]
        [Validation(Required=false)]
        public long? MatchScore { get; set; }

        // 命中所用阈值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.1</para>
        /// </summary>
        [NameInMap("match_threshold")]
        [Validation(Required=false)]
        public long? MatchThreshold { get; set; }

        // 命中图片 id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("matched_image_id")]
        [Validation(Required=false)]
        public string MatchedImageId { get; set; }

        // 命中图库名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("matched_library_name")]
        [Validation(Required=false)]
        public string MatchedLibraryName { get; set; }

        // 是否执行了全图维度（存在启用的全图库）
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("executed_full_image")]
        [Validation(Required=false)]
        public bool? ExecutedFullImage { get; set; }

        // 是否执行了人脸维度（存在启用的人脸库）
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("executed_face")]
        [Validation(Required=false)]
        public bool? ExecutedFace { get; set; }

        // 人脸检测结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("face_detected")]
        [Validation(Required=false)]
        public bool? FaceDetected { get; set; }

        // 全图向量化状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("full_image_embed_status")]
        [Validation(Required=false)]
        public string FullImageEmbedStatus { get; set; }

        // 人脸向量化状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("face_embed_status")]
        [Validation(Required=false)]
        public string FaceEmbedStatus { get; set; }

        // 全图维度 ES 最高分
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.2</para>
        /// </summary>
        [NameInMap("full_image_top_score")]
        [Validation(Required=false)]
        public long? FullImageTopScore { get; set; }

        // 全图维度阈值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.2</para>
        /// </summary>
        [NameInMap("full_image_threshold")]
        [Validation(Required=false)]
        public long? FullImageThreshold { get; set; }

        // 人脸维度 ES 最高分
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.2</para>
        /// </summary>
        [NameInMap("face_top_score")]
        [Validation(Required=false)]
        public long? FaceTopScore { get; set; }

        // 人脸维度阈值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("face_threshold")]
        [Validation(Required=false)]
        public long? FaceThreshold { get; set; }

        // 是否降级
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("degraded")]
        [Validation(Required=false)]
        public bool? Degraded { get; set; }

        // 降级或短路原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>参数缺失</para>
        /// </summary>
        [NameInMap("degrade_reason")]
        [Validation(Required=false)]
        public string DegradeReason { get; set; }

    }

}
