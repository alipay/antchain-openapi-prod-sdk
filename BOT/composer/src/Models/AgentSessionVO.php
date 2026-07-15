<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AgentSessionVO extends Model {
    protected $_name = [
        'sessionId' => 'session_id',
        'userId' => 'user_id',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
    ];
    public function validate() {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AgentSessionVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        return $model;
    }
    // 会话ID
    /**
     * @example 7468486322254688256
     * @var string
     */
    public $sessionId;

    // 用户ID
    /**
     * @example 7468486322254688256
     * @var string
     */
    public $userId;

    // 会话创建时间
    /**
     * @example 2026-06-24 21:32:59
     * @var string
     */
    public $gmtCreate;

    // 会话修改时间
    /**
     * @example 2026-06-24 21:32:59
     * @var string
     */
    public $gmtModified;

}
