// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class Material extends TeaModel {
    // 资料类型0-风控报告1-合同2-图片3-附件
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("m_type")
    @Validation(required = true)
    public String mType;

    // 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
    /**
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("big_code")
    @Validation(required = true)
    public String bigCode;

    // 小类编码
    // 201-身份证人脸面202身份证国徽面212-活体人脸图片
    /**
     * <strong>example:</strong>
     * <p>201</p>
     */
    @NameInMap("small_code")
    @Validation(required = true)
    public String smallCode;

    // 资料名称
    /**
     * <strong>example:</strong>
     * <p>资料名称</p>
     */
    @NameInMap("meterial_name")
    @Validation(required = true)
    public String meterialName;

    // 文件地址
    /**
     * <strong>example:</strong>
     * <p>文件地址</p>
     */
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    public static Material build(java.util.Map<String, ?> map) throws Exception {
        Material self = new Material();
        return TeaModel.build(map, self);
    }

    public Material setMType(String mType) {
        this.mType = mType;
        return this;
    }
    public String getMType() {
        return this.mType;
    }

    public Material setBigCode(String bigCode) {
        this.bigCode = bigCode;
        return this;
    }
    public String getBigCode() {
        return this.bigCode;
    }

    public Material setSmallCode(String smallCode) {
        this.smallCode = smallCode;
        return this;
    }
    public String getSmallCode() {
        return this.smallCode;
    }

    public Material setMeterialName(String meterialName) {
        this.meterialName = meterialName;
        return this;
    }
    public String getMeterialName() {
        return this.meterialName;
    }

    public Material setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
