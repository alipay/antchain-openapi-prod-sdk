// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 二轮车操作日志
    public class EBikeOperationLog : TeaModel {
        // 日志时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 租户
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXXXX</para>
        /// </summary>
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 小程序应用Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>7006071575519</para>
        /// </summary>
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 用户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>700607</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 设备id
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEVICE700607157</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 操作时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("operate_time")]
        [Validation(Required=true)]
        public string OperateTime { get; set; }

        // 操作描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>开锁成功</para>
        /// </summary>
        [NameInMap("operate_desc")]
        [Validation(Required=true)]
        public string OperateDesc { get; set; }

        // 操作是否成功
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 日志等级(info、warn、error)
        /// <summary>
        /// <b>Example:</b>
        /// <para>info</para>
        /// </summary>
        [NameInMap("level")]
        [Validation(Required=false)]
        public string Level { get; set; }

    }

}
