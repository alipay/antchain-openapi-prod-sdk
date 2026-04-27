<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class Host extends Model
{
    // test_2e1ae924805f
    /**
     * @example test_2e1ae924805f
     *
     * @var string
     */
    public $systemName;

    // 地址
    /**
     * @example test_941f18a4013b
     *
     * @var string
     */
    public $address;
    protected $_name = [
        'systemName' => 'system_name',
        'address'    => 'address',
    ];

    public function validate()
    {
        Model::validateRequired('systemName', $this->systemName, true);
        Model::validateRequired('address', $this->address, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->systemName) {
            $res['system_name'] = $this->systemName;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Host
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['system_name'])) {
            $model->systemName = $map['system_name'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }

        return $model;
    }
}
