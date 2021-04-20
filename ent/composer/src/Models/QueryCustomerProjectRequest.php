<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomerProjectRequest extends Model
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

    // 登录支付宝账号，手机号或者邮箱地址
    /**
     * @var string
     */
    public $logonId;

    // 登录账号类型，PHONE 为手机号，EMAIL 为邮箱地址。
    /**
     * @var string
     */
    public $logonIdType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'logonId'           => 'logon_id',
        'logonIdType'       => 'logon_id_type',
    ];

    public function validate()
    {
        Model::validateRequired('logonId', $this->logonId, true);
        Model::validateRequired('logonIdType', $this->logonIdType, true);
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
        if (null !== $this->logonId) {
            $res['logon_id'] = $this->logonId;
        }
        if (null !== $this->logonIdType) {
            $res['logon_id_type'] = $this->logonIdType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCustomerProjectRequest
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
        if (isset($map['logon_id'])) {
            $model->logonId = $map['logon_id'];
        }
        if (isset($map['logon_id_type'])) {
            $model->logonIdType = $map['logon_id_type'];
        }

        return $model;
    }
}
