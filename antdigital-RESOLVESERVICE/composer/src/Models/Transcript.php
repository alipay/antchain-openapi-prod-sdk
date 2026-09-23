<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

class Transcript extends Model {
    protected $_name = [
        'role' => 'role',
        'content' => 'content',
        'startTime' => 'start_time',
        'endTime' => 'end_time',
    ];
    public function validate() {
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Transcript
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['role'])){
            $model->role = $map['role'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        return $model;
    }
    // 说话角色
    /**
     * @example ""
     * @var string
     */
    public $role;

    // 说话内容
    /**
     * @example ""
     * @var string
     */
    public $content;

    // 开始时间，ISO 8601 格式
    /**
     * @example ""
     * @var string
     */
    public $startTime;

    // 结束时间，ISO 8601 格式
    /**
     * @example ""
     * @var string
     */
    public $endTime;

}
