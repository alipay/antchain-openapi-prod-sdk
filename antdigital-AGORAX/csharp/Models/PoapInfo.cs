// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // POAP徽章的详细信息
    public class PoapInfo : TeaModel {
        // 徽章ID，具有唯一性
        /// <summary>
        /// <b>Example:</b>
        /// <para>ACconstellation_ADF</para>
        /// </summary>
        [NameInMap("poap_id")]
        [Validation(Required=true)]
        public string PoapId { get; set; }

        // 徽章名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>星座徽章</para>
        /// </summary>
        [NameInMap("poap_name")]
        [Validation(Required=true)]
        public string PoapName { get; set; }

        // 徽章HASH
        /// <summary>
        /// <b>Example:</b>
        /// <para>0fddf9087f7c5bd71c2fabb4b520bdec9fe7157c00807b26f9ddff9cd5d73d77</para>
        /// </summary>
        [NameInMap("uni_hash")]
        [Validation(Required=true)]
        public string UniHash { get; set; }

        // 状态，枚举值
        /// <summary>
        /// <b>Example:</b>
        /// <para>FINISHED</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 徽章资源 URL
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://xxxx.ff.png">http://xxxx.ff.png</a></para>
        /// </summary>
        [NameInMap("poap_url")]
        [Validation(Required=true)]
        public string PoapUrl { get; set; }

        // 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
        /// <summary>
        /// <b>Example:</b>
        /// <para>2D_IMAGE</para>
        /// </summary>
        [NameInMap("render_type")]
        [Validation(Required=true)]
        public string RenderType { get; set; }

        // 3D模型降级使用的资源URL
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://xxx.png">http://xxx.png</a></para>
        /// </summary>
        [NameInMap("fault_tolerance_url")]
        [Validation(Required=false)]
        public string FaultToleranceUrl { get; set; }

        // 小程序详情跳转URL。临时链接，过期时间为 detail_alipays_url_expire_time 字段的值
        /// <summary>
        /// <b>Example:</b>
        /// <para>alipays://platformapi/startapp?</para>
        /// </summary>
        [NameInMap("detail_alipays_url")]
        [Validation(Required=false)]
        public string DetailAlipaysUrl { get; set; }

        // 详情页跳转URL过期时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-12-31 23:59:59</para>
        /// </summary>
        [NameInMap("detail_alipays_url_expire_time")]
        [Validation(Required=false)]
        public string DetailAlipaysUrlExpireTime { get; set; }

    }

}
