<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ConfirmExpenditureProjectRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户
    /**
     * @var string
     */
    public $source;

    // 项目id
    /**
     * @var int
     */
    public $projectId;

    // 客户确认时间
    /**
     * @var string
     */
    public $confirmTime;
    protected $_name = [
        'authToken'   => 'auth_token',
        'source'      => 'source',
        'projectId'   => 'project_id',
        'confirmTime' => 'confirm_time',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('confirmTime', $this->confirmTime, true);
        Model::validatePattern('confirmTime', $this->confirmTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->confirmTime) {
            $res['confirm_time'] = $this->confirmTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmExpenditureProjectRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['confirm_time'])) {
            $model->confirmTime = $map['confirm_time'];
        }

        return $model;
    }
}
