<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class JudgeAliyunMultiauthorityRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 阿里云批量鉴权
    /**
     * @var AliyunAuthenticateBatchEvent
     */
    public $batchEvent;

    // 上下文信息
    /**
     * @var string
     */
    public $context;
    protected $_name = [
        'authToken'  => 'auth_token',
        'batchEvent' => 'batch_event',
        'context'    => 'context',
    ];

    public function validate()
    {
        Model::validateRequired('batchEvent', $this->batchEvent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->batchEvent) {
            $res['batch_event'] = null !== $this->batchEvent ? $this->batchEvent->toMap() : null;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeAliyunMultiauthorityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['batch_event'])) {
            $model->batchEvent = AliyunAuthenticateBatchEvent::fromMap($map['batch_event']);
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }

        return $model;
    }
}
