<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class ChatMessages extends Model {
    protected $_name = [
        'role' => 'role',
        'content' => 'content',
    ];
    public function validate() {
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('content', $this->content, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChatMessages
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['role'])){
            $model->role = $map['role'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        return $model;
    }
    // 角色
    /**
     * @example user
     * @var string
     */
    public $role;

    // 文本内容
    /**
     * @example 文本内容
     * @var string
     */
    public $content;

}
