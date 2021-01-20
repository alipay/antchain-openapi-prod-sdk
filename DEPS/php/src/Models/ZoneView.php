<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ZoneView extends Model {
    protected $_name = [
        'displayName' => 'display_name',
        'id' => 'id',
        'identity' => 'identity',
        'state' => 'state',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ZoneView
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        return $model;
    }
    // 显示名称
    /**
     * @example 杭州A
     * @var string
     */
    public $displayName;

    // table id
    /**
     * @example 01c25937-5703-40dc-8
     * @var string
     */
    public $id;

    // 标识
    /**
     * @example cn-hangzhou-a
     * @var string
     */
    public $identity;

    // 状态
    /**
     * @example state
     * @var string
     */
    public $state;

}
