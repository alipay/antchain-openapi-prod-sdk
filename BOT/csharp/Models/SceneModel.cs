// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 场景码信息
    public class SceneModel : TeaModel {
        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

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

        // 场景名
        /// <summary>
        /// <b>Example:</b>
        /// <para>testScene</para>
        /// </summary>
        [NameInMap("scene_name")]
        [Validation(Required=true)]
        public string SceneName { get; set; }

        // 是否托管
        /// <summary>
        /// <b>Example:</b>
        /// <para>ESCROWED</para>
        /// </summary>
        [NameInMap("escrowed")]
        [Validation(Required=false)]
        public string Escrowed { get; set; }

        // 私钥密码
        /// <summary>
        /// <b>Example:</b>
        /// <para>MEUCI..</para>
        /// </summary>
        [NameInMap("private_key_password")]
        [Validation(Required=false)]
        public string PrivateKeyPassword { get; set; }

        // 租户
        /// <summary>
        /// <b>Example:</b>
        /// <para>testTenant</para>
        /// </summary>
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 场景类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>共享单车</para>
        /// </summary>
        [NameInMap("scene_type")]
        [Validation(Required=false)]
        public string SceneType { get; set; }

        // 是否跳过中台数据校验处理
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("skip_pegasus")]
        [Validation(Required=false)]
        public bool? SkipPegasus { get; set; }

        // 定制数据处理类 , 使用用逗号分隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX_GPS_PROCESSOR</para>
        /// </summary>
        [NameInMap("customer_processor")]
        [Validation(Required=false)]
        public string CustomerProcessor { get; set; }

    }

}
