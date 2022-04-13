<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedImagePullSecretOverride extends Model
{
    // override data
    /**
     * @example
     *
     * @var RegistryAccout
     */
    public $data;

    // cell name
    /**
     * @example cellname
     *
     * @var string
     */
    public $name;

    // cell name override
    /**
     * @example name-cella
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
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
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
     * @return FedImagePullSecretOverride
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = RegistryAccout::fromMap($map['data']);
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
