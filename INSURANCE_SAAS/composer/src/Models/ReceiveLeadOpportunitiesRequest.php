<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class ReceiveLeadOpportunitiesRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'fileId' => 'file_id',
        'requestId' => 'request_id',
        'productCode' => 'product_code',
        'bizContent' => 'biz_content',
        'bizType' => 'biz_type',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('bizType', $this->bizType, true);
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ReceiveLeadOpportunitiesRequest
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
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['biz_content'])){
            $model->bizContent = $map['biz_content'];
        }
        if(isset($map['biz_type'])){
            $model->bizType = $map['biz_type'];
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

    // 产品编码，蚂蚁分配
    /**
     * @var string
     */
    public $productCode;

    // 业务入参json格式字符串action_type:场景类型:FULL_PUSH-首次下发，携带底包文件,TRIGGER_PUSH-圈客周期变更触发，不携带文件；不传按 FULL_PUSH 处理;accept_no:首次 FULL_PUSH 受理回执返回的受理号，蚂蚁校验存在对应首次下发记录（查无记录受理失败）；FULL_PUSH 由蚂蚁生成并随受理回执返回;update_cycle{"cycleType":"WEEKLY","cycleValue":3,"time":"10:00"}	圈客周期,每周示例：{"cycleType":"WEEKLY","cycleValue":3,"time":"10:00"}，每月示例：每月10号 {"cycleType":"MONTHLY","cycleValue":10,"time":"10:00"}
    /**
     * @var string
     */
    public $bizContent;

    // 固定值：PAST_MED（既往症人群评分）业务场景
    /**
     * @var string
     */
    public $bizType;

}
