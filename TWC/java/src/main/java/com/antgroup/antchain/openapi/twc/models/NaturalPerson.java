// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class NaturalPerson extends TeaModel {
    // 自然人姓名
    /**
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 自然人手机号码
    /**
     * <strong>example:</strong>
     * <p>13821323232</p>
     */
    @NameInMap("mobile_number")
    @Validation(required = true)
    public String mobileNumber;

    // 自然人身份号码
    /**
     * <strong>example:</strong>
     * <p>412702199812252774</p>
     */
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 自然人民族
    /**
     * <strong>example:</strong>
     * <p>汉</p>
     */
    @NameInMap("nation")
    public String nation;

    // 自然人身份地址
    /**
     * <strong>example:</strong>
     * <p>北京市朝阳区XX地址</p>
     */
    @NameInMap("address")
    public String address;

    // 自然人电子邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:323232321@alibba-inc.com">323232321@alibba-inc.com</a></p>
     */
    @NameInMap("email")
    public String email;

    // 自然人身份证正反面照片
    // 文件信息 列表（先调用接口获取上传url和fileKey）
    @NameInMap("id_number_file")
    public java.util.List<FileInfo> idNumberFile;

    public static NaturalPerson build(java.util.Map<String, ?> map) throws Exception {
        NaturalPerson self = new NaturalPerson();
        return TeaModel.build(map, self);
    }

    public NaturalPerson setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NaturalPerson setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public NaturalPerson setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public NaturalPerson setNation(String nation) {
        this.nation = nation;
        return this;
    }
    public String getNation() {
        return this.nation;
    }

    public NaturalPerson setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public NaturalPerson setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public NaturalPerson setIdNumberFile(java.util.List<FileInfo> idNumberFile) {
        this.idNumberFile = idNumberFile;
        return this;
    }
    public java.util.List<FileInfo> getIdNumberFile() {
        return this.idNumberFile;
    }

}
