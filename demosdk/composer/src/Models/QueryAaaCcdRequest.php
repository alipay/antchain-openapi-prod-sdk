<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class QueryAaaCcdRequest extends Model
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
    public $test;

    // 结构体字段
    /**
     * @var TestParamA[]
     */
    public $listParamsDemosdk;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'test'              => 'test',
        'listParamsDemosdk' => 'list_params_demosdk',
    ];

    public function validate()
    {
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
        if (null !== $this->test) {
            $res['test'] = $this->test;
        }
        if (null !== $this->listParamsDemosdk) {
            $res['list_params_demosdk'] = [];
            if (null !== $this->listParamsDemosdk && \is_array($this->listParamsDemosdk)) {
                $n = 0;
                foreach ($this->listParamsDemosdk as $item) {
                    $res['list_params_demosdk'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAaaCcdRequest
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
        if (isset($map['test'])) {
            $model->test = $map['test'];
        }
        if (isset($map['list_params_demosdk'])) {
            if (!empty($map['list_params_demosdk'])) {
                $model->listParamsDemosdk = [];
                $n                        = 0;
                foreach ($map['list_params_demosdk'] as $item) {
                    $model->listParamsDemosdk[$n++] = null !== $item ? TestParamA::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
