// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 分账账号详情，针对某一笔分账
    public class OrderSplitDetailList : TeaModel {
        // 某笔分账状态：PROCESSING-处理中,SUCCESS-成功,CLOSE-关闭,FAILED-失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("split_status")]
        [Validation(Required=true)]
        public string SplitStatus { get; set; }

        // 分账金额，单位：分
        /// <summary>
        /// <b>Example:</b>
        /// <para>990</para>
        /// </summary>
        [NameInMap("split_amount")]
        [Validation(Required=true)]
        public long? SplitAmount { get; set; }

        // 分账执行时间，格式为yyyy-MM-dd HH:mm:ss 
        // 条件返回：splitStatus=SUCCESS 返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-30 12:00:00</para>
        /// </summary>
        [NameInMap("execute_time")]
        [Validation(Required=false)]
        public string ExecuteTime { get; set; }

        // 分账转出账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088101126765726</para>
        /// </summary>
        [NameInMap("trans_out_account")]
        [Validation(Required=true)]
        public string TransOutAccount { get; set; }

        // 分账转入账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088101126765726</para>
        /// </summary>
        [NameInMap("trans_in_account")]
        [Validation(Required=true)]
        public string TransInAccount { get; set; }

        // 分账失败原因，条件返回：splitStatus=FAILED 返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>账户余额不足</para>
        /// </summary>
        [NameInMap("split_failed_reason")]
        [Validation(Required=false)]
        public string SplitFailedReason { get; set; }

    }

}
