// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryInfo extends TeaModel {
    // 公证书编号
    /**
     * <strong>example:</strong>
     * <p>公证书编号</p>
     */
    @NameInMap("notarial_deed_no")
    @Validation(required = true)
    public String notarialDeedNo;

    // 电子公证书文件路径
    /**
     * <strong>example:</strong>
     * <p>电子公证书文件路径</p>
     */
    @NameInMap("notary_paper_path")
    @Validation(required = true)
    public String notaryPaperPath;

    // 公证书出证日期（yyyy-MM-dd）
    /**
     * <strong>example:</strong>
     * <p>2022-10-17</p>
     */
    @NameInMap("notary_time")
    @Validation(required = true)
    public String notaryTime;

    public static NotaryInfo build(java.util.Map<String, ?> map) throws Exception {
        NotaryInfo self = new NotaryInfo();
        return TeaModel.build(map, self);
    }

    public NotaryInfo setNotarialDeedNo(String notarialDeedNo) {
        this.notarialDeedNo = notarialDeedNo;
        return this;
    }
    public String getNotarialDeedNo() {
        return this.notarialDeedNo;
    }

    public NotaryInfo setNotaryPaperPath(String notaryPaperPath) {
        this.notaryPaperPath = notaryPaperPath;
        return this;
    }
    public String getNotaryPaperPath() {
        return this.notaryPaperPath;
    }

    public NotaryInfo setNotaryTime(String notaryTime) {
        this.notaryTime = notaryTime;
        return this;
    }
    public String getNotaryTime() {
        return this.notaryTime;
    }

}
