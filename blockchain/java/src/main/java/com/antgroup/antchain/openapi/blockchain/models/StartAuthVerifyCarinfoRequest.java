// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVerifyCarinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 加密前身份证号最后一位为字母 X 时，请使用大写 X，SHA256 加密字符串(小写)，身份证需 18
    // 岁以上。
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 保留字段，待扩展使用的JSON字符串内容
    @NameInMap("extension")
    public String extension;

    // 车牌号加密前车牌字母均为大写，SHA256 的加密后字符串(小写字母)
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 目标用户姓名的SHA256计算结果(小写字母)
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 姓名和身份证号拼接之后，SHA256加密的结果(小写字母)，身份证最后一位为字母 X 时， 请使用大写 X，加密后 SHA256 的 字符串(小写)， 身份证需 18 岁以上。
    @NameInMap("two_meta")
    @Validation(required = true)
    public String twoMeta;

    public static StartAuthVerifyCarinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVerifyCarinfoRequest self = new StartAuthVerifyCarinfoRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthVerifyCarinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthVerifyCarinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthVerifyCarinfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthVerifyCarinfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthVerifyCarinfoRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public StartAuthVerifyCarinfoRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public StartAuthVerifyCarinfoRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public StartAuthVerifyCarinfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartAuthVerifyCarinfoRequest setTwoMeta(String twoMeta) {
        this.twoMeta = twoMeta;
        return this;
    }
    public String getTwoMeta() {
        return this.twoMeta;
    }

}
