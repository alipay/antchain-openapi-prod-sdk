<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryHealthContactResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'channeId' => 'channe_id',
        'tuid' => 'tuid',
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
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->channeId) {
            $res['channe_id'] = $this->channeId;
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
     * @return QueryHealthContactResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['channe_id'])){
            $model->channeId = $map['channe_id'];
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
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 品牌方渠道标识
    /**
     * @var string
     */
    public $channeId;

    // 设备唯一id
    /**
     * @var string
     */
    public $tuid;

    // 联系人业务id
    /**
     * @var string
     */
    public $contactId;

    // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
    /**
     * @var int
     */
    public $priority;

    // 联系人姓名
    /**
     * @var string
     */
    public $contactName;

    // 联系人手机号
    /**
     * @var string
     */
    public $contactPhone;

    // 是否锁定 - 锁定时不允许c端用户修改联系人信息
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
