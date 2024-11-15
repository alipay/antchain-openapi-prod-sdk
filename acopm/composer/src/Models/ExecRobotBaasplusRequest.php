<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class ExecRobotBaasplusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 目标请求id
    /**
     * @var string
     */
    public $targetReqId;

    // 目标请求参数
    /**
     * @var string
     */
    public $targetParam;

    // 是否重试
    /**
     * @var bool
     */
    public $retryFlag;
    protected $_name = [
        'authToken'   => 'auth_token',
        'targetReqId' => 'target_req_id',
        'targetParam' => 'target_param',
        'retryFlag'   => 'retry_flag',
    ];

    public function validate()
    {
        Model::validateRequired('retryFlag', $this->retryFlag, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->targetReqId) {
            $res['target_req_id'] = $this->targetReqId;
        }
        if (null !== $this->targetParam) {
            $res['target_param'] = $this->targetParam;
        }
        if (null !== $this->retryFlag) {
            $res['retry_flag'] = $this->retryFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecRobotBaasplusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['target_req_id'])) {
            $model->targetReqId = $map['target_req_id'];
        }
        if (isset($map['target_param'])) {
            $model->targetParam = $map['target_param'];
        }
        if (isset($map['retry_flag'])) {
            $model->retryFlag = $map['retry_flag'];
        }

        return $model;
    }
}
