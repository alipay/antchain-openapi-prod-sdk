// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 营销场景
    public class PromotionScene : TeaModel {
        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>VBVKBCHQ</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 场景码
        /// <summary>
        /// <b>Example:</b>
        /// <para>APDKQOWE</para>
        /// </summary>
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // 场景名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>场景名称</para>
        /// </summary>
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 场景备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>备注内容</para>
        /// </summary>
        [NameInMap("scene_remark")]
        [Validation(Required=false)]
        public string SceneRemark { get; set; }

        // 场景商品数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("scene_product_amount")]
        [Validation(Required=false)]
        public long? SceneProductAmount { get; set; }

        // 已上线场景商品数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>已上线场景商品数量</para>
        /// </summary>
        [NameInMap("online_scene_product_amount")]
        [Validation(Required=false)]
        public long? OnlineSceneProductAmount { get; set; }

    }

}
