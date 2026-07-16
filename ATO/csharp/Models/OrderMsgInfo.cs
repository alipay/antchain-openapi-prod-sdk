// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单消息结构体
    public class OrderMsgInfo : TeaModel {
        // 订单id
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>13213123</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 消息ID
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>79256C48A6004E1EA4E18AF06745DB0A</para>
        /// </summary>
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 消息类型
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>ORDER_STATUS_CHANGE</para>
        /// </summary>
        [NameInMap("msg_publish_type")]
        [Validation(Required=true)]
        public string MsgPublishType { get; set; }

        // 消息创建时间
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("msg_create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string MsgCreateTime { get; set; }

        // 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("msg_status")]
        [Validation(Required=true)]
        public string MsgStatus { get; set; }

        // 消息重投次数
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("msg_retry_time")]
        [Validation(Required=true)]
        public long? MsgRetryTime { get; set; }

        // 消息体内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("msg_content")]
        [Validation(Required=true)]
        public string MsgContent { get; set; }

        // 消息回调地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://hstest02.xd0.co/antchain/ato/notify">https://hstest02.xd0.co/antchain/ato/notify</a></para>
        /// </summary>
        [NameInMap("msg_callback_url")]
        [Validation(Required=true)]
        public string MsgCallbackUrl { get; set; }

        // 新回调地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://test">http://test</a></para>
        /// </summary>
        [NameInMap("new_msg_callback_url")]
        [Validation(Required=true)]
        public string NewMsgCallbackUrl { get; set; }

    }

}
