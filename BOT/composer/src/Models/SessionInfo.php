<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SessionInfo extends Model {
    protected $_name = [
        'sessionName' => 'session_name',
        'sessionId' => 'session_id',
    ];
    public function validate() {
        Model::validateRequired('sessionName', $this->sessionName, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->sessionName) {
            $res['session_name'] = $this->sessionName;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SessionInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['session_name'])){
            $model->sessionName = $map['session_name'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        return $model;
    }
    // 会话名称
    /**
     * @example 碳矩阵智能体
     * @var string
     */
    public $sessionName;

    // 会话id
    /**
     * @example 会话id
     * @var string
     */
    public $sessionId;

}
