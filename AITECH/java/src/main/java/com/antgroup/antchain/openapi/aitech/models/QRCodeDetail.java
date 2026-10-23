// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QRCodeDetail extends TeaModel {
    // 位置，Top、Left、Width、Height
    @NameInMap("location")
    @Validation(required = true)
    public java.util.List<Long> location;

    // 二维码类型
    /**
     * <strong>example:</strong>
     * <p>二维码类型</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 二维码内容
    /**
     * <strong>example:</strong>
     * <p>二维码内容</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 置信度
    /**
     * <strong>example:</strong>
     * <p>置信度</p>
     */
    @NameInMap("probability")
    @Validation(required = true)
    public String probability;

    public static QRCodeDetail build(java.util.Map<String, ?> map) throws Exception {
        QRCodeDetail self = new QRCodeDetail();
        return TeaModel.build(map, self);
    }

    public QRCodeDetail setLocation(java.util.List<Long> location) {
        this.location = location;
        return this;
    }
    public java.util.List<Long> getLocation() {
        return this.location;
    }

    public QRCodeDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QRCodeDetail setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QRCodeDetail setProbability(String probability) {
        this.probability = probability;
        return this;
    }
    public String getProbability() {
        return this.probability;
    }

}
