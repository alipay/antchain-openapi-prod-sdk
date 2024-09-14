<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class DeleteIifaaDigitalkeyRequest extends Model
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

    // 请求头
    /**
     * @var RequestHead
     */
    public $head;

    // 业务参数
    /**
     * @var string
     */
    public $request;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'head'              => 'head',
        'request'           => 'request',
    ];

    public function validate()
    {
        Model::validateRequired('head', $this->head, true);
        Model::validateRequired('request', $this->request, true);
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
        if (null !== $this->head) {
            $res['head'] = null !== $this->head ? $this->head->toMap() : null;
        }
        if (null !== $this->request) {
            $res['request'] = $this->request;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteIifaaDigitalkeyRequest
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
        if (isset($map['head'])) {
            $model->head = RequestHead::fromMap($map['head']);
        }
        if (isset($map['request'])) {
            $model->request = $map['request'];
        }

        return $model;
    }
}
