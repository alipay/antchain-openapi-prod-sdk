// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SeriesDiagramErrorReason extends TeaModel {
    // 系列图单个图片所属页码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("image_pdf_page_index")
    @Validation(required = true)
    public Long imagePdfPageIndex;

    // 错误原因英文
    /**
     * <strong>example:</strong>
     * <p>错误原因英文</p>
     */
    @NameInMap("error")
    @Validation(required = true)
    public String error;

    // 错误原因中文
    /**
     * <strong>example:</strong>
     * <p>错误原因中文</p>
     */
    @NameInMap("error_cn")
    @Validation(required = true)
    public String errorCn;

    public static SeriesDiagramErrorReason build(java.util.Map<String, ?> map) throws Exception {
        SeriesDiagramErrorReason self = new SeriesDiagramErrorReason();
        return TeaModel.build(map, self);
    }

    public SeriesDiagramErrorReason setImagePdfPageIndex(Long imagePdfPageIndex) {
        this.imagePdfPageIndex = imagePdfPageIndex;
        return this;
    }
    public Long getImagePdfPageIndex() {
        return this.imagePdfPageIndex;
    }

    public SeriesDiagramErrorReason setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public SeriesDiagramErrorReason setErrorCn(String errorCn) {
        this.errorCn = errorCn;
        return this;
    }
    public String getErrorCn() {
        return this.errorCn;
    }

}
