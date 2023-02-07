<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DimInstance extends Model
{
    // ID字段，实际不会使用，只是数据库中的索引
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $dimId;

    // dim_identity
    /**
     * @example WORKSPACE
     *
     * @var string
     */
    public $dimIdentity;

    // value
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $value;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'dimId'       => 'dim_id',
        'dimIdentity' => 'dim_identity',
        'value'       => 'value',
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('dimId', $this->dimId, true);
        Model::validateRequired('dimIdentity', $this->dimIdentity, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dimId) {
            $res['dim_id'] = $this->dimId;
        }
        if (null !== $this->dimIdentity) {
            $res['dim_identity'] = $this->dimIdentity;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DimInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dim_id'])) {
            $model->dimId = $map['dim_id'];
        }
        if (isset($map['dim_identity'])) {
            $model->dimIdentity = $map['dim_identity'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
