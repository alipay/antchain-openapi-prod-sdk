<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class QueryAssetResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'assetId' => 'asset_id',
        'status' => 'status',
        'assetType' => 'asset_type',
        'assetUrl' => 'asset_url',
        'errorMessage' => 'error_message',
        'errorCode' => 'error_code',
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
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }
        if (null !== $this->assetUrl) {
            $res['asset_url'] = $this->assetUrl;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAssetResponse
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
        if(isset($map['asset_id'])){
            $model->assetId = $map['asset_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['asset_type'])){
            $model->assetType = $map['asset_type'];
        }
        if(isset($map['asset_url'])){
            $model->assetUrl = $map['asset_url'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
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

    // 资产ID
    /**
     * @var string
     */
    public $assetId;

    // 资产状态
    /**
     * @var string
     */
    public $status;

    // 资产类型
    /**
     * @var string
     */
    public $assetType;

    // 资产类型
    /**
     * @var string
     */
    public $assetUrl;

    // 错误信息
    /**
     * @var string
     */
    public $errorMessage;

    // 错误码
    /**
     * @var string
     */
    public $errorCode;

}
