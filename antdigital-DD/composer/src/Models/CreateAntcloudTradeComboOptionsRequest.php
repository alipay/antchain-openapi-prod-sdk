<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\SelectedConfigItem;
use AntChain\DD\Models\ComboOrderOptions;

class CreateAntcloudTradeComboOptionsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'comboVid' => 'combo_vid',
        'ou' => 'ou',
        'tenantId' => 'tenant_id',
        'selectedConfigs' => 'selected_configs',
        'requestId' => 'request_id',
        'saleMarket' => 'sale_market',
        'comboOrderOptions' => 'combo_order_options',
    ];
    public function validate() {
        Model::validateRequired('comboVid', $this->comboVid, true);
        Model::validateRequired('ou', $this->ou, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('selectedConfigs', $this->selectedConfigs, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('saleMarket', $this->saleMarket, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->comboVid) {
            $res['combo_vid'] = $this->comboVid;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->selectedConfigs) {
            $res['selected_configs'] = [];
            if(null !== $this->selectedConfigs && is_array($this->selectedConfigs)){
                $n = 0;
                foreach($this->selectedConfigs as $item){
                    $res['selected_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->saleMarket) {
            $res['sale_market'] = $this->saleMarket;
        }
        if (null !== $this->comboOrderOptions) {
            $res['combo_order_options'] = null !== $this->comboOrderOptions ? $this->comboOrderOptions->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateAntcloudTradeComboOptionsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['combo_vid'])){
            $model->comboVid = $map['combo_vid'];
        }
        if(isset($map['ou'])){
            $model->ou = $map['ou'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['selected_configs'])){
            if(!empty($map['selected_configs'])){
                $model->selectedConfigs = [];
                $n = 0;
                foreach($map['selected_configs'] as $item) {
                    $model->selectedConfigs[$n++] = null !== $item ? SelectedConfigItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['sale_market'])){
            $model->saleMarket = $map['sale_market'];
        }
        if(isset($map['combo_order_options'])){
            $model->comboOrderOptions = ComboOrderOptions::fromMap($map['combo_order_options']);
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 套餐版本唯一版本号
    /**
     * @var string
     */
    public $comboVid;

    // 销售主体（如 ZL6、ZL7）
    /**
     * @var string
     */
    public $ou;

    // 购买租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 用户选择的规格配置列表
    /**
     * @var SelectedConfigItem[]
     */
    public $selectedConfigs;

    // 请求ID，用于幂等
    /**
     * @var string
     */
    public $requestId;

    // 售卖市场，由中台分配
    /**
     * @var string
     */
    public $saleMarket;

    // 组合单下单配置项
    /**
     * @var ComboOrderOptions
     */
    public $comboOrderOptions;

}
