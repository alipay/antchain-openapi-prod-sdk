<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAccountMsgstatusRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 扩展信息
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAccountMsgstatusRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
