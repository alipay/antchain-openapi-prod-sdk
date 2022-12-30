<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class ImportScOperationcenterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 提交表单入参
    /**
     * @var SubmitRequest
     */
    public $submitRequest;

    // 站位
    /**
     * @var string
     */
    public $flagId;
    protected $_name = [
        'authToken'     => 'auth_token',
        'submitRequest' => 'submit_request',
        'flagId'        => 'flag_id',
    ];

    public function validate()
    {
        Model::validateRequired('submitRequest', $this->submitRequest, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->submitRequest) {
            $res['submit_request'] = null !== $this->submitRequest ? $this->submitRequest->toMap() : null;
        }
        if (null !== $this->flagId) {
            $res['flag_id'] = $this->flagId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportScOperationcenterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['submit_request'])) {
            $model->submitRequest = SubmitRequest::fromMap($map['submit_request']);
        }
        if (isset($map['flag_id'])) {
            $model->flagId = $map['flag_id'];
        }

        return $model;
    }
}
