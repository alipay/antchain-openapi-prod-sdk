// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic发布批次信息
    public class IotbasicReleaseOrderInfo : TeaModel {
        // 应用名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>应用名称</para>
        /// </summary>
        [NameInMap("apk_name")]
        [Validation(Required=true)]
        public string ApkName { get; set; }

        // 应用版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>apkVersion</para>
        /// </summary>
        [NameInMap("apk_version")]
        [Validation(Required=true)]
        public string ApkVersion { get; set; }

        // 工单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>orderId</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 工单名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>orderName</para>
        /// </summary>
        [NameInMap("order_name")]
        [Validation(Required=true)]
        public string OrderName { get; set; }

        // 发布批次状态
        // 升级中：IN_PROGRESS
        // 取消中：CANCELING
        // 部分成功：PARTIAL_SUCCESS
        // 部分失败：PARTIAL_FAILED
        // 部分取消：PARTIAL_CANCELED
        // 全部成功：ALL_SUCCESS
        // 全部失败：ALL_FAILED
        // 全部取消：ALL_CANCELED
        /// <summary>
        /// <b>Example:</b>
        /// <para>IN_PROGRESS</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发布时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-06-06 11:11:11</para>
        /// </summary>
        [NameInMap("release_time")]
        [Validation(Required=true)]
        public string ReleaseTime { get; set; }

        // 设备升级总数
        [NameInMap("release_total")]
        [Validation(Required=true)]
        public long? ReleaseTotal { get; set; }

        // 设备升级完成数
        [NameInMap("release_finished")]
        [Validation(Required=true)]
        public long? ReleaseFinished { get; set; }

        // 工单状态变更时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-06-06 11:11:11</para>
        /// </summary>
        [NameInMap("status_change_time")]
        [Validation(Required=true)]
        public string StatusChangeTime { get; set; }

    }

}
