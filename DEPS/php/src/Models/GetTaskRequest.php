<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetTaskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'reqBizId' => 'req_biz_id',
        'taskId' => 'task_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->reqBizId) {
            $res['req_biz_id'] = $this->reqBizId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetTaskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['req_biz_id'])){
            $model->reqBizId = $map['req_biz_id'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 请求的业务号，当`task_id`参数指定时该参数会被忽略
    /**
     * @var string
     */
    public $reqBizId;

    // 异步请求的id， 当`req_biz_id`参数指定时可以不指定该参数，如果指定了该参数则忽略`req_biz_id`参数
    /**
     * @var string
     */
    public $taskId;

}
