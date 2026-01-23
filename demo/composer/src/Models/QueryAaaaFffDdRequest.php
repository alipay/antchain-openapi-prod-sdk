<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryAaaaFffDdRequest extends Model
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

    // xxx
    /**
     * @var string
     */
    public $xxx;

    // yyy
    /**
     * @var string
     */
    public $yyy;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'xxx'               => 'xxx',
        'yyy'               => 'yyy',
    ];

    public function validate()
    {
        Model::validateRequired('xxx', $this->xxx, true);
        Model::validateRequired('yyy', $this->yyy, true);
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
        if (null !== $this->xxx) {
            $res['xxx'] = $this->xxx;
        }
        if (null !== $this->yyy) {
            $res['yyy'] = $this->yyy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAaaaFffDdRequest
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
        if (isset($map['xxx'])) {
            $model->xxx = $map['xxx'];
        }
        if (isset($map['yyy'])) {
            $model->yyy = $map['yyy'];
        }

        return $model;
    }
}
