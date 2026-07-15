// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权服务参与方结构体
    public class Participant : TeaModel {
        // 业务系统唯一标示
        /// <summary>
        /// <b>Example:</b>
        /// <para>76a0e716164848168dc726460042ee25</para>
        /// </summary>
        [NameInMap("biz_uid")]
        [Validation(Required=false, MaxLength=64)]
        public string BizUid { get; set; }

        // 区块链ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>cfd98b44fb3246dbbae07dae4bae59fe</para>
        /// </summary>
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1595574776000</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>30405123</para>
        /// </summary>
        [NameInMap("credit_number")]
        [Validation(Required=false)]
        public string CreditNumber { get; set; }

        // 扩展信息，标准JSON格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;organization&quot;:&quot;test&quot;,&quot;company&quot;:&quot;test&quot;}</para>
        /// </summary>
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 参与方名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>Bob</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=64)]
        public string Name { get; set; }

        // 回调通知服务地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://127.0.0.1">http://127.0.0.1</a></para>
        /// </summary>
        [NameInMap("notification_service")]
        [Validation(Required=false)]
        public string NotificationService { get; set; }

        // 参与方ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("participant_id")]
        [Validation(Required=true, MaxLength=100)]
        public string ParticipantId { get; set; }

        // DID  doc中的公开信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>information</para>
        /// </summary>
        [NameInMap("public_info")]
        [Validation(Required=false)]
        public string PublicInfo { get; set; }

        // 参与方角色列表
        [NameInMap("role")]
        [Validation(Required=true)]
        public List<string> Role { get; set; }

        // 空间ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>space1</para>
        /// </summary>
        [NameInMap("space_id")]
        [Validation(Required=false)]
        public string SpaceId { get; set; }

        // 参与方状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ACTIVE,DELETED...</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1595574776000</para>
        /// </summary>
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

        // 账户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>account1</para>
        /// </summary>
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

    }

}
