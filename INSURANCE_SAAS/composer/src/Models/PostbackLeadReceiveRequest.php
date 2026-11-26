<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class PostbackLeadReceiveRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'fileId' => 'file_id',
        'requestId' => 'request_id',
        'notifyType' => 'notify_type',
        'actionType' => 'action_type',
        'bizContent' => 'biz_content',
        'acceptNo' => 'accept_no',
        'productCode' => 'product_code',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('notifyType', $this->notifyType, true);
        Model::validateRequired('actionType', $this->actionType, true);
        Model::validateRequired('acceptNo', $this->acceptNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->notifyType) {
            $res['notify_type'] = $this->notifyType;
        }
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->acceptNo) {
            $res['accept_no'] = $this->acceptNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PostbackLeadReceiveRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['fileObjectName'])){
            $model->fileObjectName = $map['fileObjectName'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['notify_type'])){
            $model->notifyType = $map['notify_type'];
        }
        if(isset($map['action_type'])){
            $model->actionType = $map['action_type'];
        }
        if(isset($map['biz_content'])){
            $model->bizContent = $map['biz_content'];
        }
        if(isset($map['accept_no'])){
            $model->acceptNo = $map['accept_no'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // string
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 请求id，每一次请求保持唯一，若重复，则报错；
    /**
     * @var string
     */
    public $requestId;

    // 通知类型：固定 LEAD_PUSH_NOTIFY（既往症线索推送通知）
    /**
     * @var string
     */
    public $notifyType;

    // 动作类型：首次-FULL_PUSH，周期-TRIGGER_PUSH
    /**
     * @var string
     */
    public $actionType;

    // 业务参数json，updateCycle等字段
    /**
     * @var string
     */
    public $bizContent;

    // 客户「既往症线索周期变更」受理号透传，供给方回传结果文件时随请求带回
    /**
     * @var string
     */
    public $acceptNo;

    // 本次固定传LMKT_LEADS_TRANSFER
    /**
     * @var string
     */
    public $productCode;

}
