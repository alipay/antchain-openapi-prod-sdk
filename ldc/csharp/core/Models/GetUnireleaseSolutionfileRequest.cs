// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetUnireleaseSolutionfileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // Sftp目录：/sftp/linkw/unionpay/date/id/prod/timestamp-solution.json
        // 
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

    }

}
