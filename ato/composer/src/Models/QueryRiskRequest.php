<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 枚举值：蚁盾版、智租版、旗舰版，蚁盾版代表仅调用蚁盾风控，智租版代表仅调用小程序云风控，旗舰版代表调用蚁盾+旗舰版风控接口
    /**
     * @var string
     */
    public $productName;

    // 用户姓名
    /**
     * @var string
     */
    public $userName;

    // 用户证件号码
    /**
     * @var string
     */
    public $certNo;

    // 用户手机号码
    /**
     * @var string
     */
    public $mobile;

    // 支付宝账户 UserId，智租版可选
    /**
     * @var string
     */
    public $alipayUserId;

    // 下单渠道，智租版必选。枚举值：支付宝-ALIPAY；微信-WECHAT；独立APP-APP；抖音-DOUYIN；美团-MEITUAN；其他:-OTHER
    /**
     * @var string
     */
    public $source;

    // 风险业务场景，智租版选填。默认值：PRE_RENT。
    // PRE_RENT - 3c租赁；PRE_RENT_3C - 3c租赁定制；PRE_RENT_PET - 宠物；PRE_RENT_EDU - 教培；PRE_RENT_BEAUTY - 美业；
    /**
     * @var string
     */
    public $riskBizScene;

    // 商品详情，智租版可选
    /**
     * @var ItemDetail
     */
    public $itemDetail;

    // 价格详情，智租版可选
    /**
     * @var PriceDetail
     */
    public $priceDetail;

    // 物流信息，智租版可选
    /**
     * @var DeliveryDetail
     */
    public $deliveryDetail;

    // 枚举值：3C_RENTAL、NE_RENTAL、OTHER_RENTAL、PETS、BEAUTY、EDUCATION、FITNESS、GENERAL_INDUSTRY_OTHER
    /**
     * @var string
     */
    public $industry;

    // 枚举值：ZOLOZ_V2、ZOLOZ_V3、GENERAL_INDUSTRY、APPLET_RISK、REJECT_RISK
    /**
     * @var string
     */
    public $modelVersion;

    // 商家传入的订单ID，商家侧唯一
    /**
     * @var string
     */
    public $orderId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productName'       => 'product_name',
        'userName'          => 'user_name',
        'certNo'            => 'cert_no',
        'mobile'            => 'mobile',
        'alipayUserId'      => 'alipay_user_id',
        'source'            => 'source',
        'riskBizScene'      => 'risk_biz_scene',
        'itemDetail'        => 'item_detail',
        'priceDetail'       => 'price_detail',
        'deliveryDetail'    => 'delivery_detail',
        'industry'          => 'industry',
        'modelVersion'      => 'model_version',
        'orderId'           => 'order_id',
    ];

    public function validate()
    {
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateMaxLength('userName', $this->userName, 2000);
        Model::validateMaxLength('alipayUserId', $this->alipayUserId, 20);
        Model::validateMaxLength('source', $this->source, 10);
        Model::validateMaxLength('riskBizScene', $this->riskBizScene, 100);
        Model::validateMinLength('riskBizScene', $this->riskBizScene, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->riskBizScene) {
            $res['risk_biz_scene'] = $this->riskBizScene;
        }
        if (null !== $this->itemDetail) {
            $res['item_detail'] = null !== $this->itemDetail ? $this->itemDetail->toMap() : null;
        }
        if (null !== $this->priceDetail) {
            $res['price_detail'] = null !== $this->priceDetail ? $this->priceDetail->toMap() : null;
        }
        if (null !== $this->deliveryDetail) {
            $res['delivery_detail'] = null !== $this->deliveryDetail ? $this->deliveryDetail->toMap() : null;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->modelVersion) {
            $res['model_version'] = $this->modelVersion;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['risk_biz_scene'])) {
            $model->riskBizScene = $map['risk_biz_scene'];
        }
        if (isset($map['item_detail'])) {
            $model->itemDetail = ItemDetail::fromMap($map['item_detail']);
        }
        if (isset($map['price_detail'])) {
            $model->priceDetail = PriceDetail::fromMap($map['price_detail']);
        }
        if (isset($map['delivery_detail'])) {
            $model->deliveryDetail = DeliveryDetail::fromMap($map['delivery_detail']);
        }
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['model_version'])) {
            $model->modelVersion = $map['model_version'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }

        return $model;
    }
}
