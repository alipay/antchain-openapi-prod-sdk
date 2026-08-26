<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class Member extends Model {
    protected $_name = [
        'userId' => 'user_id',
        'userName' => 'user_name',
        'loginName' => 'login_name',
        'projectId' => 'project_id',
        'gmtCreate' => 'gmt_create',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Member
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        return $model;
    }
    // 用户ID
    /**
     * @example 0000461041
     * @var string
     */
    public $userId;

    // 用户名称
    /**
     * @example 张三
     * @var string
     */
    public $userName;

    // 登录名
    /**
     * @example hpat684@alitest.xyz
     * @var string
     */
    public $loginName;

    // 项目ID
    /**
     * @example 00004606871785921985864
     * @var string
     */
    public $projectId;

    // 创建时间
    /**
     * @example 2026-05-22 10:18:40
     * @var string
     */
    public $gmtCreate;

}
