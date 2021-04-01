<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ImportPlatformTestregionTestfuncRequest extends Model
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

    // 123
    /**
     * @var string
     */
    public $testParam1;

    // 123
    /**
     * @var int
     */
    public $testParam2;

    // 123
    /**
     * @var NodeInfo[]
     */
    public $testParam3;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'testParam1'        => 'test_param1',
        'testParam2'        => 'test_param2',
        'testParam3'        => 'test_param3',
    ];

    public function validate()
    {
        Model::validateRequired('testParam1', $this->testParam1, true);
        Model::validateRequired('testParam2', $this->testParam2, true);
        Model::validateRequired('testParam3', $this->testParam3, true);
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
        if (null !== $this->testParam1) {
            $res['test_param1'] = $this->testParam1;
        }
        if (null !== $this->testParam2) {
            $res['test_param2'] = $this->testParam2;
        }
        if (null !== $this->testParam3) {
            $res['test_param3'] = [];
            if (null !== $this->testParam3 && \is_array($this->testParam3)) {
                $n = 0;
                foreach ($this->testParam3 as $item) {
                    $res['test_param3'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportPlatformTestregionTestfuncRequest
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
        if (isset($map['test_param1'])) {
            $model->testParam1 = $map['test_param1'];
        }
        if (isset($map['test_param2'])) {
            $model->testParam2 = $map['test_param2'];
        }
        if (isset($map['test_param3'])) {
            if (!empty($map['test_param3'])) {
                $model->testParam3 = [];
                $n                 = 0;
                foreach ($map['test_param3'] as $item) {
                    $model->testParam3[$n++] = null !== $item ? NodeInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
