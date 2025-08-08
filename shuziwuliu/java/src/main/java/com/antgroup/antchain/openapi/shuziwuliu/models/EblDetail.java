// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class EblDetail extends TeaModel {
    // 电子提单copy文件hash
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("ebl_copy_pdf_file_hash")
    @Validation(required = true)
    public String eblCopyPdfFileHash;

    // 电子提单copy文件id
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("ebl_copy_pdf_file_id")
    @Validation(required = true)
    public String eblCopyPdfFileId;

    // 电子提单编号
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("ebl_no")
    @Validation(required = true)
    public String eblNo;

    public static EblDetail build(java.util.Map<String, ?> map) throws Exception {
        EblDetail self = new EblDetail();
        return TeaModel.build(map, self);
    }

    public EblDetail setEblCopyPdfFileHash(String eblCopyPdfFileHash) {
        this.eblCopyPdfFileHash = eblCopyPdfFileHash;
        return this;
    }
    public String getEblCopyPdfFileHash() {
        return this.eblCopyPdfFileHash;
    }

    public EblDetail setEblCopyPdfFileId(String eblCopyPdfFileId) {
        this.eblCopyPdfFileId = eblCopyPdfFileId;
        return this;
    }
    public String getEblCopyPdfFileId() {
        return this.eblCopyPdfFileId;
    }

    public EblDetail setEblNo(String eblNo) {
        this.eblNo = eblNo;
        return this;
    }
    public String getEblNo() {
        return this.eblNo;
    }

}
