<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateUnifiedalarmHistoryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // json格式上下文信息
    /**
     * @var string
     */
    public $context;
    protected $_name = [
        'authToken' => 'auth_token',
        'context'   => 'context',
    ];

    public function validate()
    {
        Model::validateRequired('context', $this->context, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateUnifiedalarmHistoryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }

        return $model;
    }
}
