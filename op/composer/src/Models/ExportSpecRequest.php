<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ExportSpecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // api列表
    /**
     * @var ApiPair[]
     */
    public $apis;
    protected $_name = [
        'authToken' => 'auth_token',
        'prodCode'  => 'prod_code',
        'apis'      => 'apis',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->apis) {
            $res['apis'] = [];
            if (null !== $this->apis && \is_array($this->apis)) {
                $n = 0;
                foreach ($this->apis as $item) {
                    $res['apis'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportSpecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['apis'])) {
            if (!empty($map['apis'])) {
                $model->apis = [];
                $n           = 0;
                foreach ($map['apis'] as $item) {
                    $model->apis[$n++] = null !== $item ? ApiPair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
