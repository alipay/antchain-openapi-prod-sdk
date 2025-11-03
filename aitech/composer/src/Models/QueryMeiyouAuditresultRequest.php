<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryMeiyouAuditresultRequest extends Model
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

    // 审核ID
    /**
     * @var int[]
     */
    public $auditIds;

    // 美柚任务审核结果推送状态
    /**
     * @var string
     */
    public $meiyouAuditState;

    // 审核记录状态
    /**
     * @var string[]
     */
    public $auditState;

    // 主题记录状态
    /**
     * @var string
     */
    public $topicState;

    // 开始时间点
    /**
     * @var string
     */
    public $createStart;

    // 结束时间点
    /**
     * @var string
     */
    public $createEnd;

    // 数据来源
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'auditIds'          => 'audit_ids',
        'meiyouAuditState'  => 'meiyou_audit_state',
        'auditState'        => 'audit_state',
        'topicState'        => 'topic_state',
        'createStart'       => 'create_start',
        'createEnd'         => 'create_end',
        'source'            => 'source',
    ];

    public function validate()
    {
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
        if (null !== $this->meiyouAuditState) {
            $res['meiyou_audit_state'] = $this->meiyouAuditState;
        }
        if (null !== $this->auditState) {
            $res['audit_state'] = $this->auditState;
        }
        if (null !== $this->topicState) {
            $res['topic_state'] = $this->topicState;
        }
        if (null !== $this->createStart) {
            $res['create_start'] = $this->createStart;
        }
        if (null !== $this->createEnd) {
            $res['create_end'] = $this->createEnd;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeiyouAuditresultRequest
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
        if (isset($map['meiyou_audit_state'])) {
            $model->meiyouAuditState = $map['meiyou_audit_state'];
        }
        if (isset($map['audit_state'])) {
            if (!empty($map['audit_state'])) {
                $model->auditState = $map['audit_state'];
            }
        }
        if (isset($map['topic_state'])) {
            $model->topicState = $map['topic_state'];
        }
        if (isset($map['create_start'])) {
            $model->createStart = $map['create_start'];
        }
        if (isset($map['create_end'])) {
            $model->createEnd = $map['create_end'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
