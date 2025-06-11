<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeiyouAuditRequest extends Model
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

    // 主题ID
    /**
     * @var int[]
     */
    public $topicIds;

    // 美柚itag关联状态
    /**
     * @var string
     */
    public $topicState;

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
        'topicIds'          => 'topic_ids',
        'topicState'        => 'topic_state',
        'auditIds'          => 'audit_ids',
        'auditState'        => 'audit_state',
    ];

    public function validate()
    {
        Model::validateRequired('topicIds', $this->topicIds, true);
        Model::validateRequired('topicState', $this->topicState, true);
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
        if (null !== $this->topicIds) {
            $res['topic_ids'] = $this->topicIds;
        }
        if (null !== $this->topicState) {
            $res['topic_state'] = $this->topicState;
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
     * @return UpdateMeiyouAuditRequest
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
        if (isset($map['topic_ids'])) {
            if (!empty($map['topic_ids'])) {
                $model->topicIds = $map['topic_ids'];
            }
        }
        if (isset($map['topic_state'])) {
            $model->topicState = $map['topic_state'];
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
