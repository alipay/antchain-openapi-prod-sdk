// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 阶段存证内容类表，根据模板定义传入
    public class PhaseNotary : TeaModel {
        // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
        [NameInMap("phase_no")]
        [Validation(Required=true)]
        public long? PhaseNo { get; set; }

        // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则填入Hash即可，如果定义是Structure(结构化)，则填入模板所有字段json对象的字符串Base64后的值
        [NameInMap("notary_content")]
        [Validation(Required=true)]
        public string NotaryContent { get; set; }

        // 业务方原始数据ID，业务方确保唯一，方便与业务方进行数据核对使用
        // 
        [NameInMap("origin_data_id")]
        [Validation(Required=true)]
        public string OriginDataId { get; set; }

    }

}
