// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractFileInfo extends TeaModel {
    // 文件OSS Id
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b5.pdf</p>
     */
    @NameInMap("oss_file_id")
    @Validation(required = true, maxLength = 64)
    public String ossFileId;

    // 买家用户签署区信息
    @NameInMap("user_sign_fields")
    @Validation(required = true)
    public java.util.List<BclSignField> userSignFields;

    // 租赁商家签署区信息
    @NameInMap("merchant_sign_fields")
    public java.util.List<BclSignField> merchantSignFields;

    // 合同模板填充项内容扩展字段:
    // 以key:value传入，JSON对象模板签署链路，不能传"  "或空"{}"，k-v模式，k和v都必须有。
    // 当订单创建选择是模板签署时，该字段必填。
    /**
     * <strong>example:</strong>
     * <p>{&quot;甲方&quot;:&quot;测试甲方&quot;,&quot;乙方&quot;:&quot;测试乙方&quot;}</p>
     */
    @NameInMap("simple_form_fields")
    @Validation(maxLength = 2048)
    public String simpleFormFields;

    public static BclContractFileInfo build(java.util.Map<String, ?> map) throws Exception {
        BclContractFileInfo self = new BclContractFileInfo();
        return TeaModel.build(map, self);
    }

    public BclContractFileInfo setOssFileId(String ossFileId) {
        this.ossFileId = ossFileId;
        return this;
    }
    public String getOssFileId() {
        return this.ossFileId;
    }

    public BclContractFileInfo setUserSignFields(java.util.List<BclSignField> userSignFields) {
        this.userSignFields = userSignFields;
        return this;
    }
    public java.util.List<BclSignField> getUserSignFields() {
        return this.userSignFields;
    }

    public BclContractFileInfo setMerchantSignFields(java.util.List<BclSignField> merchantSignFields) {
        this.merchantSignFields = merchantSignFields;
        return this;
    }
    public java.util.List<BclSignField> getMerchantSignFields() {
        return this.merchantSignFields;
    }

    public BclContractFileInfo setSimpleFormFields(String simpleFormFields) {
        this.simpleFormFields = simpleFormFields;
        return this;
    }
    public String getSimpleFormFields() {
        return this.simpleFormFields;
    }

}
