<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

class CallbackTaskSmsresultRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'aCaseId' => 'a_case_id',
        'batchNo' => 'batch_no',
        'collectedName' => 'collected_name',
        'contactName' => 'contact_name',
        'contactPhone' => 'contact_phone',
        'contactStatus' => 'contact_status',
        'content' => 'content',
        'overdueDate' => 'overdue_date',
        'remark' => 'remark',
        'sendResult' => 'send_result',
        'sendWay' => 'send_way',
        'sessionId' => 'session_id',
        'time' => 'time',
        'type' => 'type',
        'createBy' => 'create_by',
        'templateNo' => 'template_no',
    ];
    public function validate() {
        Model::validateRequired('aCaseId', $this->aCaseId, true);
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateRequired('collectedName', $this->collectedName, true);
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactPhone', $this->contactPhone, true);
        Model::validateRequired('contactStatus', $this->contactStatus, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('overdueDate', $this->overdueDate, true);
        Model::validateRequired('sendResult', $this->sendResult, true);
        Model::validateRequired('sendWay', $this->sendWay, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('createBy', $this->createBy, true);
        Model::validateRequired('templateNo', $this->templateNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->aCaseId) {
            $res['a_case_id'] = $this->aCaseId;
        }
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->collectedName) {
            $res['collected_name'] = $this->collectedName;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactPhone) {
            $res['contact_phone'] = $this->contactPhone;
        }
        if (null !== $this->contactStatus) {
            $res['contact_status'] = $this->contactStatus;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->overdueDate) {
            $res['overdue_date'] = $this->overdueDate;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->sendResult) {
            $res['send_result'] = $this->sendResult;
        }
        if (null !== $this->sendWay) {
            $res['send_way'] = $this->sendWay;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->createBy) {
            $res['create_by'] = $this->createBy;
        }
        if (null !== $this->templateNo) {
            $res['template_no'] = $this->templateNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackTaskSmsresultRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['a_case_id'])){
            $model->aCaseId = $map['a_case_id'];
        }
        if(isset($map['batch_no'])){
            $model->batchNo = $map['batch_no'];
        }
        if(isset($map['collected_name'])){
            $model->collectedName = $map['collected_name'];
        }
        if(isset($map['contact_name'])){
            $model->contactName = $map['contact_name'];
        }
        if(isset($map['contact_phone'])){
            $model->contactPhone = $map['contact_phone'];
        }
        if(isset($map['contact_status'])){
            $model->contactStatus = $map['contact_status'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['overdue_date'])){
            $model->overdueDate = $map['overdue_date'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['send_result'])){
            $model->sendResult = $map['send_result'];
        }
        if(isset($map['send_way'])){
            $model->sendWay = $map['send_way'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['time'])){
            $model->time = $map['time'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['create_by'])){
            $model->createBy = $map['create_by'];
        }
        if(isset($map['template_no'])){
            $model->templateNo = $map['template_no'];
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

    // 客户号
    /**
     * @var string
     */
    public $aCaseId;

    // 批次号
    /**
     * @var string
     */
    public $batchNo;

    // 案件主联系人姓名 AES加密
    /**
     * @var string
     */
    public $collectedName;

    // 联系人姓名 AES加密
    /**
     * @var string
     */
    public $contactName;

    // 联系人号码 AES加密
    /**
     * @var string
     */
    public $contactPhone;

    // 联系人状态（有意愿还款之类）
    /**
     * @var string
     */
    public $contactStatus;

    // 短信内容
    /**
     * @var string
     */
    public $content;

    // 还款日
    /**
     * @var string
     */
    public $overdueDate;

    // 备注
    /**
     * @var string
     */
    public $remark;

    // 发送结果 21:客户回复接收成功 10:失败 11:成功
    /**
     * @var string
     */
    public $sendResult;

    // 发送方式：如果是系统发送，那么为必填(1-短信，2-语音，3-智能语音)
    /**
     * @var int
     */
    public $sendWay;

    // 唯一标识(可用来判重)
    /**
     * @var string
     */
    public $sessionId;

    // 发送时间(毫秒)
    /**
     * @var int
     */
    public $time;

    // 1 发送 2 接收 -客户回复
    /**
     * @var string
     */
    public $type;

    // 约定固定值-一般是对应平台的缩写
    /**
     * @var string
     */
    public $createBy;

    // 短信模板
    /**
     * @var string
     */
    public $templateNo;

}
