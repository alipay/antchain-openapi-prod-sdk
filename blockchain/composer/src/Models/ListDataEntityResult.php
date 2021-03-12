<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListDataEntityResult extends Model
{
    // 数据模型信息
    /**
     * @example
     *
     * @var DataModel
     */
    public $dataModel;

    // 数据资产信息
    /**
     * @example
     *
     * @var DataEntity
     */
    public $dataEntity;
    protected $_name = [
        'dataModel'  => 'data_model',
        'dataEntity' => 'data_entity',
    ];

    public function validate()
    {
        Model::validateRequired('dataModel', $this->dataModel, true);
        Model::validateRequired('dataEntity', $this->dataEntity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataModel) {
            $res['data_model'] = null !== $this->dataModel ? $this->dataModel->toMap() : null;
        }
        if (null !== $this->dataEntity) {
            $res['data_entity'] = null !== $this->dataEntity ? $this->dataEntity->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDataEntityResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_model'])) {
            $model->dataModel = DataModel::fromMap($map['data_model']);
        }
        if (isset($map['data_entity'])) {
            $model->dataEntity = DataEntity::fromMap($map['data_entity']);
        }

        return $model;
    }
}
