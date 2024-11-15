<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class CallbackJiuzhouPlanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求标识
    /**
     * @var string
     */
    public $execId;

    // 回调数据
    /**
     * @var string
     */
    public $callBackData;
    protected $_name = [
        'authToken'    => 'auth_token',
        'execId'       => 'exec_id',
        'callBackData' => 'call_back_data',
    ];

    public function validate()
    {
        Model::validateRequired('execId', $this->execId, true);
        Model::validateRequired('callBackData', $this->callBackData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->execId) {
            $res['exec_id'] = $this->execId;
        }
        if (null !== $this->callBackData) {
            $res['call_back_data'] = $this->callBackData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackJiuzhouPlanRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['exec_id'])) {
            $model->execId = $map['exec_id'];
        }
        if (isset($map['call_back_data'])) {
            $model->callBackData = $map['call_back_data'];
        }

        return $model;
    }
}
