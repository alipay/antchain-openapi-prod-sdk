<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SaveHealthContactRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelId' => 'channel_id',
        'tuid' => 'tuid',
        'contactId' => 'contact_id',
        'priority' => 'priority',
        'contactName' => 'contact_name',
        'contactPhone' => 'contact_phone',
        'locked' => 'locked',
        'extraInfo' => 'extra_info',
    ];
    public function validate() {
        Model::validateRequired('channelId', $this->channelId, true);
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('priority', $this->priority, true);
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactPhone', $this->contactPhone, true);
        Model::validateRequired('locked', $this->locked, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
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
     * @return SaveHealthContactRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['channel_id'])){
            $model->channelId = $map['channel_id'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
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
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 品牌方渠道标识
    /**
     * @var string
     */
    public $channelId;

    // 设备唯一id
    /**
     * @var string
     */
    public $tuid;

    // 联系人业务id -为空时新增/不为空时编辑
    /**
     * @var string
     */
    public $contactId;

    // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
    /**
     * @var int
     */
    public $priority;

    // 联系人名称
    /**
     * @var string
     */
    public $contactName;

    // 呼叫联系人手机号
    /**
     * @var string
     */
    public $contactPhone;

    // 是否锁定 - 锁定时不允许c端用户修改联系人信息，可通过此接口修改相关信息以及解锁
    /**
     * @var bool
     */
    public $locked;

    // 预留可扩展字段
    /**
     * @var string
     */
    public $extraInfo;

}
