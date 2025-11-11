<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class SubmitAntchainAtoFundFlowRequest extends Model
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

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 商户id
    /**
     * @var string
     */
    public $merchantId;

    // 商家签署tag
    /**
     * @var string
     */
    public $merchantSignTag;

    // 资方id
    /**
     * @var string
     */
    public $fundId;

    // 资方签署tag
    /**
     * @var string
     */
    public $fundSignTag;

    // 资方是否自动签署
    /**
     * @var bool
     */
    public $fundAutoSign;

    // 模板参数列表，需要传入模板id和对应的渲染参数，如果有多个文件则传入多个值
    /**
     * @var TemplateArgs[]
     */
    public $templateList;

    // xxx合同
    /**
     * @var string
     */
    public $businessScene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'merchantSignTag'   => 'merchant_sign_tag',
        'fundId'            => 'fund_id',
        'fundSignTag'       => 'fund_sign_tag',
        'fundAutoSign'      => 'fund_auto_sign',
        'templateList'      => 'template_list',
        'businessScene'     => 'business_scene',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('merchantSignTag', $this->merchantSignTag, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('fundSignTag', $this->fundSignTag, true);
        Model::validateRequired('templateList', $this->templateList, true);
        Model::validateRequired('businessScene', $this->businessScene, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantSignTag) {
            $res['merchant_sign_tag'] = $this->merchantSignTag;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->fundSignTag) {
            $res['fund_sign_tag'] = $this->fundSignTag;
        }
        if (null !== $this->fundAutoSign) {
            $res['fund_auto_sign'] = $this->fundAutoSign;
        }
        if (null !== $this->templateList) {
            $res['template_list'] = [];
            if (null !== $this->templateList && \is_array($this->templateList)) {
                $n = 0;
                foreach ($this->templateList as $item) {
                    $res['template_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAntchainAtoFundFlowRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_sign_tag'])) {
            $model->merchantSignTag = $map['merchant_sign_tag'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['fund_sign_tag'])) {
            $model->fundSignTag = $map['fund_sign_tag'];
        }
        if (isset($map['fund_auto_sign'])) {
            $model->fundAutoSign = $map['fund_auto_sign'];
        }
        if (isset($map['template_list'])) {
            if (!empty($map['template_list'])) {
                $model->templateList = [];
                $n                   = 0;
                foreach ($map['template_list'] as $item) {
                    $model->templateList[$n++] = null !== $item ? TemplateArgs::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }

        return $model;
    }
}
