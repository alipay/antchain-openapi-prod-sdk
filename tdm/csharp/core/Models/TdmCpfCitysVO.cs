// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 公积金中心城市编码列表
    public class TdmCpfCitysVO : TeaModel {
        // 城市编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 城市名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 公积金中心城市列表
        [NameInMap("cpfs")]
        [Validation(Required=true)]
        public List<TdmCpfEncodeNameVO> Cpfs { get; set; }

    }

}
