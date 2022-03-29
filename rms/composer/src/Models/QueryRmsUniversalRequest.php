<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsUniversalRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // post_body
    /**
     * @var string
     */
    public $postBody;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken' => 'auth_token',
        'postBody'  => 'post_body',
        'tenantId'  => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('postBody', $this->postBody, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->postBody) {
            $res['post_body'] = $this->postBody;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRmsUniversalRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['post_body'])) {
            $model->postBody = $map['post_body'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
