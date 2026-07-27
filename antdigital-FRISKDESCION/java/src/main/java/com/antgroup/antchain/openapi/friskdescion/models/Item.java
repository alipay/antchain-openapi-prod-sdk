// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.friskdescion.models;

import com.aliyun.tea.*;

public class Item extends TeaModel {
    // 样本唯一id
    /**
     * <strong>example:</strong>
     * <p>7ef15c83-57b4-4932-9180-35b11b102075</p>
     */
    @NameInMap("sample_id")
    @Validation(required = true)
    public String sampleId;

    // 小写加密身份证（身份证如果有X，要大写再生成MD5）
    /**
     * <strong>example:</strong>
     * <p>51db170b113f8c57533ae28605f2b76b</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 手机号加密
    /**
     * <strong>example:</strong>
     * <p>077e5fc68135bd8e8223a094029d4cee</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 回溯日期（yyyyMMdd格式）
    /**
     * <strong>example:</strong>
     * <p>20260620</p>
     */
    @NameInMap("sample_back_date")
    public String sampleBackDate;

    public static Item build(java.util.Map<String, ?> map) throws Exception {
        Item self = new Item();
        return TeaModel.build(map, self);
    }

    public Item setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

    public Item setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public Item setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Item setSampleBackDate(String sampleBackDate) {
        this.sampleBackDate = sampleBackDate;
        return this;
    }
    public String getSampleBackDate() {
        return this.sampleBackDate;
    }

}
