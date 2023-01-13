// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 业务数据检索的结果数据
    public class DataSearchResultResponseLog : TeaModel {
        // 数据关联的合约Meta信息
        [NameInMap("meta_id")]
        [Validation(Required=true)]
        public string MetaId { get; set; }

        // 交易调用的函数名称
        [NameInMap("function")]
        [Validation(Required=false)]
        public string Function { get; set; }

        // 交易产生的事件名称
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // 交易所在的区块高度
        [NameInMap("block_num")]
        [Validation(Required=true)]
        public long? BlockNum { get; set; }

        // 交易ID
        [NameInMap("tx_id")]
        [Validation(Required=true)]
        public string TxId { get; set; }

        // Json 序列化的交易请求参数
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 交易中合约输出的日志内容
        [NameInMap("log")]
        [Validation(Required=false)]
        public string Log { get; set; }

        // 索引数据枚举类型， interface, event, deposit ；分别对应合约调用、合约事件、原生存证
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 交易上链时间戳，单位毫秒
        [NameInMap("tx_timestamp")]
        [Validation(Required=true)]
        public long? TxTimestamp { get; set; }

    }

}
