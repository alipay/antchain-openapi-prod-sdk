<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryMeiyouAuditRequest extends Model
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

    // 审核记录ID
    /**
     * @var int[]
     */
    public $auditIds;

    // 美柚itag关联状态
    /**
     * @var string
     */
    public $auditState;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'auditIds'          => 'audit_ids',
        'auditState'        => 'audit_state',
    ];

    public function validate()
    {
        Model::validateRequired('auditIds', $this->auditIds, true);
        Model::validateRequired('auditState', $this->auditState, true);
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
        if (null !== $this->auditIds) {
            $res['audit_ids'] = $this->auditIds;
        }
        if (null !== $this->auditState) {
            $res['audit_state'] = $this->auditState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeiyouAuditRequest
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
        if (isset($map['audit_ids'])) {
            if (!empty($map['audit_ids'])) {
                $model->auditIds = $map['audit_ids'];
            }
        }
        if (isset($map['audit_state'])) {
            $model->auditState = $map['audit_state'];
        }

        return $model;
    }
}
