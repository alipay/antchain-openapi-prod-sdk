// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecExchangeBymerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 当前希望按照上述比例扣减用户资产
    @NameInMap("asset_rate")
    @Validation(required = true)
    public String assetRate;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 权益商品ID，例：7f1be9108651f97513b5b59030f5b059e58a59d263ab426cbf26337f91642caa
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 用户兑换价格接口设置的价格（单位：元）
    @NameInMap("equity_price")
    @Validation(required = true)
    public String equityPrice;

    // 兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    // 比如在兑换手机直充商品时，需要对{"countryCode": "86", "phone": "13900000000"} 使用供应商的公钥进行加密。
    @NameInMap("memo")
    public String memo;

    // 权益商品兑换外部流水ID，调用方自定义流水ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 采购商如果绑定了附加的公私钥对。在兑换商品时需要对SHA256(out_tx_id+tenant_id+asset_id+equity_id+equity_price+asset_rate+user_id+memo)使用ECC K1私钥签名（算法ECDSAWithSHA256，曲线Secp256K1），并转换为Hex。
    @NameInMap("tx_sig")
    public String txSig;

    // 受益用户名
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static ExecExchangeBymerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecExchangeBymerchantRequest self = new ExecExchangeBymerchantRequest();
        return TeaModel.build(map, self);
    }

    public ExecExchangeBymerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecExchangeBymerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecExchangeBymerchantRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ExecExchangeBymerchantRequest setAssetRate(String assetRate) {
        this.assetRate = assetRate;
        return this;
    }
    public String getAssetRate() {
        return this.assetRate;
    }

    public ExecExchangeBymerchantRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecExchangeBymerchantRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public ExecExchangeBymerchantRequest setEquityPrice(String equityPrice) {
        this.equityPrice = equityPrice;
        return this;
    }
    public String getEquityPrice() {
        return this.equityPrice;
    }

    public ExecExchangeBymerchantRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ExecExchangeBymerchantRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecExchangeBymerchantRequest setTxSig(String txSig) {
        this.txSig = txSig;
        return this;
    }
    public String getTxSig() {
        return this.txSig;
    }

    public ExecExchangeBymerchantRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
