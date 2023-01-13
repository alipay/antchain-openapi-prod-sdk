<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class StartDatasearchIndexRequest extends Model
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

    // 用户唯一标识符（租户ID）
    /**
     * @var string
     */
    public $tenantId;

    // 链唯一标识符
    /**
     * @var string
     */
    public $bizId;

    // 合约ABI meta ID
    /**
     * @var string
     */
    public $metaId;

    // 合约 hex 编码的地址
    /**
     * @var string
     */
    public $contract;

    // 索引的起始位置，同合约ABI的起始位置； 0 表示从头
    /**
     * @var int
     */
    public $startHeight;

    // 索引的终止位置，同合约ABI的终止位置；0 表示到最新
    /**
     * @var int
     */
    public $endHeight;

    // 索引类型，   interface  为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
    /**
     * @var string
     */
    public $indexType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'bizId'             => 'biz_id',
        'metaId'            => 'meta_id',
        'contract'          => 'contract',
        'startHeight'       => 'start_height',
        'endHeight'         => 'end_height',
        'indexType'         => 'index_type',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('metaId', $this->metaId, true);
        Model::validateRequired('contract', $this->contract, true);
        Model::validateRequired('startHeight', $this->startHeight, true);
        Model::validateRequired('endHeight', $this->endHeight, true);
        Model::validateRequired('indexType', $this->indexType, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->metaId) {
            $res['meta_id'] = $this->metaId;
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->startHeight) {
            $res['start_height'] = $this->startHeight;
        }
        if (null !== $this->endHeight) {
            $res['end_height'] = $this->endHeight;
        }
        if (null !== $this->indexType) {
            $res['index_type'] = $this->indexType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDatasearchIndexRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['meta_id'])) {
            $model->metaId = $map['meta_id'];
        }
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['start_height'])) {
            $model->startHeight = $map['start_height'];
        }
        if (isset($map['end_height'])) {
            $model->endHeight = $map['end_height'];
        }
        if (isset($map['index_type'])) {
            $model->indexType = $map['index_type'];
        }

        return $model;
    }
}
