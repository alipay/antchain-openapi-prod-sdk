<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingagentCreativeScriptexpandRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'taskId' => 'task_id',
    ];
    public function validate() {
        Model::validateRequired('taskId', $this->taskId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentCreativeScriptexpandRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发起脚本扩写接口返回的任务标识
    /**
     * @var string
     */
    public $taskId;

}
