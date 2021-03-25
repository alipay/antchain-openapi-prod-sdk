<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Repository extends Model {
    protected $_name = [
        'name' => 'name',
        'type' => 'type',
        'url' => 'url',
        'ownerLoginName' => 'owner_login_name',
        'ownerDisplayName' => 'owner_display_name',
        'createdTime' => 'created_time',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->ownerDisplayName) {
            $res['owner_display_name'] = $this->ownerDisplayName;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Repository
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['owner_display_name'])){
            $model->ownerDisplayName = $map['owner_display_name'];
        }
        if(isset($map['created_time'])){
            $model->createdTime = $map['created_time'];
        }
        return $model;
    }
    // 代码库名字
    /**
     * @example mss-demo
     * @var string
     */
    public $name;

    // 代码库类型，svn或者git
    /**
     * @example svn, git
     * @var string
     */
    public $type;

    // 代码库地址
    /**
     * @example https://git.tech.antfin.com/xxx/xxx
     * @var string
     */
    public $url;

    // 代码库负责人登录名称
    /**
     * @example alipayAdmin@alipay.net
     * @var string
     */
    public $ownerLoginName;

    // 代码库负责人显示名称
    /**
     * @example 乐乐
     * @var string
     */
    public $ownerDisplayName;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $createdTime;

}
