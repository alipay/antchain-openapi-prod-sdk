// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上交易
    public class ChainInsightTransaction : TeaModel {
        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 链名称
        [NameInMap("biz_id_name")]
        [Validation(Required=false)]
        public string BizIdName { get; set; }

        // 交易ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 交易类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 交易状态，VALID 表示合法，其它为错误码
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 交易发起者地址
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 交易目标地址
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 交易原始输入，hex编码
        [NameInMap("input")]
        [Validation(Required=true)]
        public string Input { get; set; }

        // 交易调用的函数名
        [NameInMap("function")]
        [Validation(Required=false)]
        public string Function { get; set; }

        // 交易输入解析后的 json string
        [NameInMap("input_decoded")]
        [Validation(Required=false)]
        public string InputDecoded { get; set; }

        // 交易的返回值
        [NameInMap("output")]
        [Validation(Required=false)]
        public string Output { get; set; }

        // 交易返回值解析后的 json string
        [NameInMap("output_decoded")]
        [Validation(Required=false)]
        public string OutputDecoded { get; set; }

        // 交易所在区块高度
        [NameInMap("block_num")]
        [Validation(Required=true)]
        public long? BlockNum { get; set; }

        // 交易所在区块中的 index
        [NameInMap("tx_index")]
        [Validation(Required=true)]
        public long? TxIndex { get; set; }

        // 原始交易的 json string
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 交易中的事件
        [NameInMap("events")]
        [Validation(Required=false)]
        public List<ChainInsightEvent> Events { get; set; }

        // 交易时间戳（单位：毫秒）
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
