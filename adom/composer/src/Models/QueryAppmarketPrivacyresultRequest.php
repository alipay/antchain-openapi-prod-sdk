<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ADOM\Models;

use AlibabaCloud\Tea\Model;

class QueryAppmarketPrivacyresultRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 商品实例id
    /**
     * @var string
     */
    public $instanceId;

    // 执行记录id
    /**
     * @var string
     */
    public $recordId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'instanceId' => 'instance_id',
        'recordId'   => 'record_id',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('recordId', $this->recordId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppmarketPrivacyresultRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }

        return $model;
    }
}
