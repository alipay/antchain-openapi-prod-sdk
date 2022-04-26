// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class DetailFlowPhaseResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 阶段存证交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 模板字段类型，Hash/Structure，(Hash->哈希,Structure->结构化)
        [NameInMap("data_type")]
        [Validation(Required=false)]
        public string DataType { get; set; }

        // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则返回存证时Hash，如果定义是Structure(结构化)，则返回所有字段json对象的字符串Base64后的值
        [NameInMap("notary_content")]
        [Validation(Required=false)]
        public string NotaryContent { get; set; }

        // 结构化数据里面英文key对应的中文名称关系，json格式，key为字段英文名，value为字段中文名称
        // 
        [NameInMap("data_type_key")]
        [Validation(Required=false)]
        public string DataTypeKey { get; set; }

        // 阶段存证内容csv下载地址，暂时预留，存证内容过大时采用文件形式输出，有效期1个小时
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 交易所在的区块Hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // 交易所在的区块高
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public string BlockHeight { get; set; }

        // 阶段注册成功时间戳
        [NameInMap("register_time")]
        [Validation(Required=false)]
        public long? RegisterTime { get; set; }

    }

}
