// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // JT设备所关联实体设备信息
    public class RelatedEntity : TeaModel {
        // 所关联实体的类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>COSTOMER_ENETITY</para>
        /// </summary>
        [NameInMap("entity_type")]
        [Validation(Required=true)]
        public string EntityType { get; set; }

        // 所关联实体的trustiot唯一ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7006071575276187649</para>
        /// </summary>
        [NameInMap("related_entity_trustiot_id")]
        [Validation(Required=true)]
        public long? RelatedEntityTrustiotId { get; set; }

    }

}
