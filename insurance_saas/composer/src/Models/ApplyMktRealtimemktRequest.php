<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ApplyMktRealtimemktRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求id
    /**
     * @var string
     */
    public $requestId;

    // 项目ID，待蚂蚁分配
    /**
     * @var string
     */
    public $projectId;

    // 加密类型，MD5，32位[小]
    /**
     * @var string
     */
    public $encryptionType;

    // 实时营销人群列表
    /**
     * @var RealtimeMktAudience[]
     */
    public $realtimeMktAudienceList;
    protected $_name = [
        'authToken'               => 'auth_token',
        'requestId'               => 'request_id',
        'projectId'               => 'project_id',
        'encryptionType'          => 'encryption_type',
        'realtimeMktAudienceList' => 'realtime_mkt_audience_list',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('encryptionType', $this->encryptionType, true);
        Model::validateRequired('realtimeMktAudienceList', $this->realtimeMktAudienceList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->encryptionType) {
            $res['encryption_type'] = $this->encryptionType;
        }
        if (null !== $this->realtimeMktAudienceList) {
            $res['realtime_mkt_audience_list'] = [];
            if (null !== $this->realtimeMktAudienceList && \is_array($this->realtimeMktAudienceList)) {
                $n = 0;
                foreach ($this->realtimeMktAudienceList as $item) {
                    $res['realtime_mkt_audience_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyMktRealtimemktRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['encryption_type'])) {
            $model->encryptionType = $map['encryption_type'];
        }
        if (isset($map['realtime_mkt_audience_list'])) {
            if (!empty($map['realtime_mkt_audience_list'])) {
                $model->realtimeMktAudienceList = [];
                $n                              = 0;
                foreach ($map['realtime_mkt_audience_list'] as $item) {
                    $model->realtimeMktAudienceList[$n++] = null !== $item ? RealtimeMktAudience::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
