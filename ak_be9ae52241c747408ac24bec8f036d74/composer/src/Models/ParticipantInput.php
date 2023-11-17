<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class ParticipantInput extends Model
{
    // 授权至项目内的数据集ID
    /**
     * @example "AUTH_DESC_test00"
     *
     * @var string
     */
    public $authDatasetId;

    // 上述数据集所需参与计算的列
    /**
     * @example ["x1", "x2"]
     *
     * @var string[]
     */
    public $fields;

    // 用户筛选该数据集的过滤条件
    /**
     * @example "id < 10"
     *
     * @var string
     */
    public $filter;
    protected $_name = [
        'authDatasetId' => 'auth_dataset_id',
        'fields'        => 'fields',
        'filter'        => 'filter',
    ];

    public function validate()
    {
        Model::validateRequired('authDatasetId', $this->authDatasetId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authDatasetId) {
            $res['auth_dataset_id'] = $this->authDatasetId;
        }
        if (null !== $this->fields) {
            $res['fields'] = $this->fields;
        }
        if (null !== $this->filter) {
            $res['filter'] = $this->filter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParticipantInput
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_dataset_id'])) {
            $model->authDatasetId = $map['auth_dataset_id'];
        }
        if (isset($map['fields'])) {
            if (!empty($map['fields'])) {
                $model->fields = $map['fields'];
            }
        }
        if (isset($map['filter'])) {
            $model->filter = $map['filter'];
        }

        return $model;
    }
}
