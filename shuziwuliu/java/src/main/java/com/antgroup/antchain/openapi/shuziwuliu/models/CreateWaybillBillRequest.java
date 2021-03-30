// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateWaybillBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 受票方名称
    // 
    @NameInMap("drawee")
    @Validation(required = true)
    public String drawee;

    // 受票方纳税人识别号
    // 
    @NameInMap("drawee_tax_no")
    @Validation(required = true)
    public String draweeTaxNo;

    // 发票代码
    // 
    @NameInMap("lzfpdm")
    public String lzfpdm;

    // 发票号码
    // 
    @NameInMap("lzfphm")
    public String lzfphm;

    // 开票时间戳
    // 
    @NameInMap("open_time")
    @Validation(required = true)
    public Long openTime;

    // 所属平台的分布式数字身份，缺省时为自己的分布式数字身份
    // 
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 关联的运单ID
    // 
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    public static CreateWaybillBillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWaybillBillRequest self = new CreateWaybillBillRequest();
        return TeaModel.build(map, self);
    }

    public CreateWaybillBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWaybillBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWaybillBillRequest setDrawee(String drawee) {
        this.drawee = drawee;
        return this;
    }
    public String getDrawee() {
        return this.drawee;
    }

    public CreateWaybillBillRequest setDraweeTaxNo(String draweeTaxNo) {
        this.draweeTaxNo = draweeTaxNo;
        return this;
    }
    public String getDraweeTaxNo() {
        return this.draweeTaxNo;
    }

    public CreateWaybillBillRequest setLzfpdm(String lzfpdm) {
        this.lzfpdm = lzfpdm;
        return this;
    }
    public String getLzfpdm() {
        return this.lzfpdm;
    }

    public CreateWaybillBillRequest setLzfphm(String lzfphm) {
        this.lzfphm = lzfphm;
        return this;
    }
    public String getLzfphm() {
        return this.lzfphm;
    }

    public CreateWaybillBillRequest setOpenTime(Long openTime) {
        this.openTime = openTime;
        return this;
    }
    public Long getOpenTime() {
        return this.openTime;
    }

    public CreateWaybillBillRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateWaybillBillRequest setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

}
