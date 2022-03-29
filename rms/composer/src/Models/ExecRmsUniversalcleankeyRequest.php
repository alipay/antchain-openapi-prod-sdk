<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ExecRmsUniversalcleankeyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // req_params
    /**
     * @var KeySet[]
     */
    public $reqParams;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken' => 'auth_token',
        'reqParams' => 'req_params',
        'tenantId'  => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('reqParams', $this->reqParams, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->reqParams) {
            $res['req_params'] = [];
            if (null !== $this->reqParams && \is_array($this->reqParams)) {
                $n = 0;
                foreach ($this->reqParams as $item) {
                    $res['req_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecRmsUniversalcleankeyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['req_params'])) {
            if (!empty($map['req_params'])) {
                $model->reqParams = [];
                $n                = 0;
                foreach ($map['req_params'] as $item) {
                    $model->reqParams[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
