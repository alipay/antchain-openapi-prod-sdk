// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 阶段详情信息
    public class PhaseDetail : TeaModel {
        // 阶段id
        [NameInMap("phase_id")]
        [Validation(Required=true)]
        public string PhaseId { get; set; }

        // 阶段编号
        [NameInMap("phase_no")]
        [Validation(Required=true)]
        public long? PhaseNo { get; set; }

        // 阶段存证时间
        [NameInMap("register_time")]
        [Validation(Required=true)]
        public long? RegisterTime { get; set; }

        // 阶段存证凭据
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 模板字段类型，Hash/Structure，(Hash->哈希,Structure->结构化)
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 阶段存证内容
        // 如果模板数据类型定义是Hash(哈希)则返回存证时Hash
        // 如果定义是Structure(结构化)，则返回所有字段json对象的字符串Base64后的值
        [NameInMap("notary_content")]
        [Validation(Required=true)]
        public string NotaryContent { get; set; }

        // 模板字段类型为Structure时才有值，结构化数据里面英文key对应的中文名称关系，json格式，key为字段英文名，value为字段中文名称
        [NameInMap("data_type_key")]
        [Validation(Required=true)]
        public string DataTypeKey { get; set; }

    }

}
