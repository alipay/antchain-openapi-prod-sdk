// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVerifyCarinspectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 车牌号，内容大写，不带空格。
    @NameInMap("plate_no")
    @Validation(required = true)
    public String plateNo;

    // 非必填参数，号牌种类说明，比如"01"代表大型汽车，具体类型入参说明参考文档枚举。
    @NameInMap("plate_type")
    public String plateType;

    public static StartAuthVerifyCarinspectRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVerifyCarinspectRequest self = new StartAuthVerifyCarinspectRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthVerifyCarinspectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthVerifyCarinspectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthVerifyCarinspectRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthVerifyCarinspectRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthVerifyCarinspectRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public StartAuthVerifyCarinspectRequest setPlateType(String plateType) {
        this.plateType = plateType;
        return this;
    }
    public String getPlateType() {
        return this.plateType;
    }

}
