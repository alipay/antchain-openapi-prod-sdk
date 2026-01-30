<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 批量下单场景编码 BatchOrderSceneEnum.online_acboss.getCode()
    /**
     * @var string
     */
    public $batchOrderScene;

    // 批量下单批次号
    /**
     * @var string
     */
    public $batchOrderBsnNo;

    // 销售市场 com.antgroup.actradeprod.common.service.model.order.enums.SaleMarketEnum
    /**
     * @var string
     */
    public $saleMarket;

    // 租户Id
    /**
     * @var string
     */
    public $tenantId;

    // 租户名称
    /**
     * @var string
     */
    public $tenantName;

    // 操作人ID，不填则默认和租户ID一致
    /**
     * @var string
     */
    public $operatorId;

    // 支付选项
    /**
     * @var PayOptions
     */
    public $payOptions;

    // 商品实例列表
    /**
     * @var CommodityInstance[]
     */
    public $commodityInstanceList;

    // 扩展属性，JSON字符串
    /**
     * @var string
     */
    public $extendedProperties;
    protected $_name = [
        'authToken'             => 'auth_token',
        'batchOrderScene'       => 'batch_order_scene',
        'batchOrderBsnNo'       => 'batch_order_bsn_no',
        'saleMarket'            => 'sale_market',
        'tenantId'              => 'tenant_id',
        'tenantName'            => 'tenant_name',
        'operatorId'            => 'operator_id',
        'payOptions'            => 'pay_options',
        'commodityInstanceList' => 'commodity_instance_list',
        'extendedProperties'    => 'extended_properties',
    ];

    public function validate()
    {
        Model::validateRequired('batchOrderScene', $this->batchOrderScene, true);
        Model::validateRequired('batchOrderBsnNo', $this->batchOrderBsnNo, true);
        Model::validateRequired('saleMarket', $this->saleMarket, true);
        Model::validateRequired('commodityInstanceList', $this->commodityInstanceList, true);
        Model::validateRequired('extendedProperties', $this->extendedProperties, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->batchOrderScene) {
            $res['batch_order_scene'] = $this->batchOrderScene;
        }
        if (null !== $this->batchOrderBsnNo) {
            $res['batch_order_bsn_no'] = $this->batchOrderBsnNo;
        }
        if (null !== $this->saleMarket) {
            $res['sale_market'] = $this->saleMarket;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->payOptions) {
            $res['pay_options'] = null !== $this->payOptions ? $this->payOptions->toMap() : null;
        }
        if (null !== $this->commodityInstanceList) {
            $res['commodity_instance_list'] = [];
            if (null !== $this->commodityInstanceList && \is_array($this->commodityInstanceList)) {
                $n = 0;
                foreach ($this->commodityInstanceList as $item) {
                    $res['commodity_instance_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extendedProperties) {
            $res['extended_properties'] = $this->extendedProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['batch_order_scene'])) {
            $model->batchOrderScene = $map['batch_order_scene'];
        }
        if (isset($map['batch_order_bsn_no'])) {
            $model->batchOrderBsnNo = $map['batch_order_bsn_no'];
        }
        if (isset($map['sale_market'])) {
            $model->saleMarket = $map['sale_market'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['pay_options'])) {
            $model->payOptions = PayOptions::fromMap($map['pay_options']);
        }
        if (isset($map['commodity_instance_list'])) {
            if (!empty($map['commodity_instance_list'])) {
                $model->commodityInstanceList = [];
                $n                            = 0;
                foreach ($map['commodity_instance_list'] as $item) {
                    $model->commodityInstanceList[$n++] = null !== $item ? CommodityInstance::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extended_properties'])) {
            $model->extendedProperties = $map['extended_properties'];
        }

        return $model;
    }
}
