<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedSecretOverride extends Model
{
    // 要覆盖的保密字典数据
    /**
     * @example
     *
     * @var SecretData[]
     */
    public $data;

    // 部署单元的名称
    /**
     * @example gz00a
     *
     * @var string
     */
    public $name;

    // 覆盖的名称，必须为：保密字典名称-cell-部署单元名称
    /**
     * @example sc-cell-gz00a
     *
     * @var string
     */
    public $nameOverride;
    protected $_name = [
        'data'         => 'data',
        'name'         => 'name',
        'nameOverride' => 'name_override',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('nameOverride', $this->nameOverride, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->nameOverride) {
            $res['name_override'] = $this->nameOverride;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedSecretOverride
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? SecretData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['name_override'])) {
            $model->nameOverride = $map['name_override'];
        }

        return $model;
    }
}
