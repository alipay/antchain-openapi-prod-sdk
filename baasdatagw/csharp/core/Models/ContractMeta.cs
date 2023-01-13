// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 合约Meta
    public class ContractMeta : TeaModel {
        // MetaID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 合约Meta创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 合约Meta更新时间
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

        // 合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合约名称对应的Hex编码合约地址
        [NameInMap("contract_addr")]
        [Validation(Required=true)]
        public string ContractAddr { get; set; }

        // 合约版本号，用于助记
        [NameInMap("contract_version")]
        [Validation(Required=true)]
        public string ContractVersion { get; set; }

        // 合约Meta的类型，枚举类型；
        [NameInMap("meta_type")]
        [Validation(Required=true)]
        public string MetaType { get; set; }

        // 合约Meta生效块高，留空表示从上一个已定义的区间结束开始生效； 否则表示具体的起始生效块高
        [NameInMap("start_block")]
        [Validation(Required=false)]
        public long? StartBlock { get; set; }

        // 合约Meta生效的截止块高，留空表示自动探测到下一个已定于的区间为止， 0 表示持续生效
        [NameInMap("end_block")]
        [Validation(Required=false)]
        public long? EndBlock { get; set; }

        // 合约是否对外该链其它租户开放； 0 表示否， 1表示开放
        [NameInMap("public_flag")]
        [Validation(Required=false)]
        public long? PublicFlag { get; set; }

        // 合约Meta对应类型的数据
        [NameInMap("meta_content")]
        [Validation(Required=true)]
        public string MetaContent { get; set; }

    }

}
