// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 数据下载信息
    public class DataDownloadInfo : TeaModel {
        // 商户社会统一信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91301010101010101A</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 流水号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123122134</para>
        /// </summary>
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        //  状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>TODO</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // TRADE_PROMISE_BILL: 交易履约账单
        /// <summary>
        /// <b>Example:</b>
        /// <para>交易履约账单</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 筛选开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-17</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 筛选结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-11-17</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 任务创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-17 18:41:59</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 下载结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>下载结果</para>
        /// </summary>
        [NameInMap("result_info")]
        [Validation(Required=false)]
        public string ResultInfo { get; set; }

        // 融资类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUPPLY_CHAIN_FINANCE</para>
        /// </summary>
        [NameInMap("fund_mode")]
        [Validation(Required=false)]
        public string FundMode { get; set; }

        // 放款渠道
        /// <summary>
        /// <b>Example:</b>
        /// <para>BANK</para>
        /// </summary>
        [NameInMap("loan_channel")]
        [Validation(Required=false)]
        public string LoanChannel { get; set; }

        // 资方社会统一信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91301010101010101A</para>
        /// </summary>
        [NameInMap("fund_id")]
        [Validation(Required=false)]
        public string FundId { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx公司名称</para>
        /// </summary>
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 资方公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx公司名称</para>
        /// </summary>
        [NameInMap("fund_name")]
        [Validation(Required=false)]
        public string FundName { get; set; }

    }

}
