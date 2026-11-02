<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class HealthContactInfo extends Model {
    protected $_name = [
        'contactId' => 'contact_id',
        'priority' => 'priority',
        'contactName' => 'contact_name',
        'contactPhone' => 'contact_phone',
        'locked' => 'locked',
        'extraInfo' => 'extra_info',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->contactId) {
            $res['contact_id'] = $this->contactId;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactPhone) {
            $res['contact_phone'] = $this->contactPhone;
        }
        if (null !== $this->locked) {
            $res['locked'] = $this->locked;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return HealthContactInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['contact_id'])){
            $model->contactId = $map['contact_id'];
        }
        if(isset($map['priority'])){
            $model->priority = $map['priority'];
        }
        if(isset($map['contact_name'])){
            $model->contactName = $map['contact_name'];
        }
        if(isset($map['contact_phone'])){
            $model->contactPhone = $map['contact_phone'];
        }
        if(isset($map['locked'])){
            $model->locked = $map['locked'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        return $model;
    }
    // 联系人业务id
    /**
     * @example 1749795036983016
     * @var string
     */
    public $contactId;

    // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
    /**
     * @example 1
     * @var int
     */
    public $priority;

    // 联系人姓名
    /**
     * @example 张三
     * @var string
     */
    public $contactName;

    // 联系人手机号
    /**
     * @example 13027589188
     * @var string
     */
    public $contactPhone;

    // 是否锁定 - 锁定时不允许c端用户修改联系人信息
    /**
     * @example true
     * @var bool
     */
    public $locked;

    // 预留可扩展字段json
    /**
     * @example 
     * @var string
     */
    public $extraInfo;

}
