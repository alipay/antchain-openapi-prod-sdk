<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceInventoryRequest extends Model
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

    // 库存申报交易号，调用方生成的唯一编码
    /**
     * @var string
     */
    public $tradeNo;

    // 库存申报编号
    /**
     * @var string
     */
    public $inventoryNo;

    // 库存查询时间，yyyy-mm-dd，精确到（天）
    /**
     * @var string
     */
    public $inventoryQueryDate;

    // 仓库代码
    //
    //
    /**
     * @var string
     */
    public $repositoryCode;

    // 库存货物列表
    /**
     * @var InventoryCargo[]
     */
    public $inventoryCargos;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'tradeNo'            => 'trade_no',
        'inventoryNo'        => 'inventory_no',
        'inventoryQueryDate' => 'inventory_query_date',
        'repositoryCode'     => 'repository_code',
        'inventoryCargos'    => 'inventory_cargos',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('inventoryNo', $this->inventoryNo, true);
        Model::validateRequired('inventoryQueryDate', $this->inventoryQueryDate, true);
        Model::validateRequired('repositoryCode', $this->repositoryCode, true);
        Model::validateRequired('inventoryCargos', $this->inventoryCargos, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('inventoryNo', $this->inventoryNo, 50);
        Model::validateMaxLength('repositoryCode', $this->repositoryCode, 50);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->inventoryNo) {
            $res['inventory_no'] = $this->inventoryNo;
        }
        if (null !== $this->inventoryQueryDate) {
            $res['inventory_query_date'] = $this->inventoryQueryDate;
        }
        if (null !== $this->repositoryCode) {
            $res['repository_code'] = $this->repositoryCode;
        }
        if (null !== $this->inventoryCargos) {
            $res['inventory_cargos'] = [];
            if (null !== $this->inventoryCargos && \is_array($this->inventoryCargos)) {
                $n = 0;
                foreach ($this->inventoryCargos as $item) {
                    $res['inventory_cargos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceInventoryRequest
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['inventory_no'])) {
            $model->inventoryNo = $map['inventory_no'];
        }
        if (isset($map['inventory_query_date'])) {
            $model->inventoryQueryDate = $map['inventory_query_date'];
        }
        if (isset($map['repository_code'])) {
            $model->repositoryCode = $map['repository_code'];
        }
        if (isset($map['inventory_cargos'])) {
            if (!empty($map['inventory_cargos'])) {
                $model->inventoryCargos = [];
                $n                      = 0;
                foreach ($map['inventory_cargos'] as $item) {
                    $model->inventoryCargos[$n++] = null !== $item ? InventoryCargo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
