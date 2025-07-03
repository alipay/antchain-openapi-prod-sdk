// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class UserProfile extends TeaModel {
    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 用户身份证号
    /**
     * <strong>example:</strong>
     * <p>110101199003072516</p>
     */
    @NameInMap("id_number")
    public String idNumber;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("mobile")
    public String mobile;

    // 年龄
    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("age")
    public Long age;

    // 信用评分
    /**
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("credit_score")
    public Long creditScore;

    public static UserProfile build(java.util.Map<String, ?> map) throws Exception {
        UserProfile self = new UserProfile();
        return TeaModel.build(map, self);
    }

    public UserProfile setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UserProfile setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public UserProfile setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UserProfile setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

    public UserProfile setCreditScore(Long creditScore) {
        this.creditScore = creditScore;
        return this;
    }
    public Long getCreditScore() {
        return this.creditScore;
    }

}
