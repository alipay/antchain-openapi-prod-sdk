<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class OperateJusticeEventRequest extends Model
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

    // 案件Id,创建案件返回的id
    /**
     * @var int
     */
    public $caseId;

    // 维权记录id,发起维权返回的Id
    /**
     * @var int
     */
    public $recordId;

    // 事件类型(目前仅支持司法调解类):
    // 司法调解-JUDICIAL_MEDIATION
    // 仲裁-ARBITRATION
    // 执行-CARRIED_OUT
    // 补证-SUPPLEMENT
    /**
     * @var string
     */
    public $eventType;

    // 针对事件响应的信息
    /**
     * @var JudicialEventOperateInfo
     */
    public $operateInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'caseId'            => 'case_id',
        'recordId'          => 'record_id',
        'eventType'         => 'event_type',
        'operateInfo'       => 'operate_info',
    ];

    public function validate()
    {
        Model::validateRequired('caseId', $this->caseId, true);
        Model::validateRequired('recordId', $this->recordId, true);
        Model::validateRequired('eventType', $this->eventType, true);
        Model::validateRequired('operateInfo', $this->operateInfo, true);
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
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }
        if (null !== $this->eventType) {
            $res['event_type'] = $this->eventType;
        }
        if (null !== $this->operateInfo) {
            $res['operate_info'] = null !== $this->operateInfo ? $this->operateInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateJusticeEventRequest
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
        if (isset($map['case_id'])) {
            $model->caseId = $map['case_id'];
        }
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }
        if (isset($map['event_type'])) {
            $model->eventType = $map['event_type'];
        }
        if (isset($map['operate_info'])) {
            $model->operateInfo = JudicialEventOperateInfo::fromMap($map['operate_info']);
        }

        return $model;
    }
}
