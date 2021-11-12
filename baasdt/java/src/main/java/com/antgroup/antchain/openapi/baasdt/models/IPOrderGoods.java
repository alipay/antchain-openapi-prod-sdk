// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPOrderGoods extends TeaModel {
    // 订单ID
    @NameInMap("ip_order_id")
    public String ipOrderId;

    // 数据渠道类型：0 手动录入，1 淘宝开放平台
    @NameInMap("data_type")
    @Validation(required = true)
    public Long dataType;

    // ID类型
    @NameInMap("id_type")
    @Validation(required = true)
    public Long idType;

    // 商品ID
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商家昵称
    @NameInMap("nick")
    public String nick;

    public static IPOrderGoods build(java.util.Map<String, ?> map) throws Exception {
        IPOrderGoods self = new IPOrderGoods();
        return TeaModel.build(map, self);
    }

    public IPOrderGoods setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public IPOrderGoods setDataType(Long dataType) {
        this.dataType = dataType;
        return this;
    }
    public Long getDataType() {
        return this.dataType;
    }

    public IPOrderGoods setIdType(Long idType) {
        this.idType = idType;
        return this;
    }
    public Long getIdType() {
        return this.idType;
    }

    public IPOrderGoods setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public IPOrderGoods setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public IPOrderGoods setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

}
