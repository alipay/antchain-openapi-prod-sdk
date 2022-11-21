// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class PagequeryLicenceMeterdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品Code，如果不传参数，默认是“SOFA”
    @NameInMap("product_code")
    public String productCode;

    // 传入商品Code，必填：mesh、mq、dtx 等
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // SOFA的实例ID。
    // 如果不传则查询总量（合并所有实例的数据）
    @NameInMap("instance_id")
    public String instanceId;

    // 计量开始时间，只支持整点时间
    @NameInMap("meter_begin")
    @Validation(required = true)
    public String meterBegin;

    // 计量结束时间，只支持整点时间（不包含）
    @NameInMap("meter_end")
    @Validation(required = true)
    public String meterEnd;

    // 当前页码
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PagequeryLicenceMeterdataRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryLicenceMeterdataRequest self = new PagequeryLicenceMeterdataRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryLicenceMeterdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryLicenceMeterdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryLicenceMeterdataRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PagequeryLicenceMeterdataRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public PagequeryLicenceMeterdataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PagequeryLicenceMeterdataRequest setMeterBegin(String meterBegin) {
        this.meterBegin = meterBegin;
        return this;
    }
    public String getMeterBegin() {
        return this.meterBegin;
    }

    public PagequeryLicenceMeterdataRequest setMeterEnd(String meterEnd) {
        this.meterEnd = meterEnd;
        return this;
    }
    public String getMeterEnd() {
        return this.meterEnd;
    }

    public PagequeryLicenceMeterdataRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryLicenceMeterdataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
