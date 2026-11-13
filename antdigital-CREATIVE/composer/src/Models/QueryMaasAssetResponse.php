<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\Error;

class QueryMaasAssetResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'assetId' => 'asset_id',
        'status' => 'status',
        'assetType' => 'asset_type',
        'url' => 'url',
        'name' => 'name',
        'createdAt' => 'created_at',
        'updatedAt' => 'updated_at',
        'error' => 'error',
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
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->createdAt) {
            $res['created_at'] = $this->createdAt;
        }
        if (null !== $this->updatedAt) {
            $res['updated_at'] = $this->updatedAt;
        }
        if (null !== $this->error) {
            $res['error'] = null !== $this->error ? $this->error->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMaasAssetResponse
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
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['created_at'])){
            $model->createdAt = $map['created_at'];
        }
        if(isset($map['updated_at'])){
            $model->updatedAt = $map['updated_at'];
        }
        if(isset($map['error'])){
            $model->error = Error::fromMap($map['error']);
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

    // 资产 ID
    /**
     * @var string
     */
    public $assetId;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 资产类型
    /**
     * @var string
     */
    public $assetType;

    // 资产访问 URL，仅在已取得可访问地址时返回
    /**
     * @var string
     */
    public $url;

    // 素材名称，可选
    /**
     * @var string
     */
    public $name;

    // 创建时间，Unix 秒级时间戳，可选
    /**
     * @var string
     */
    public $createdAt;

    // 更新时间，Unix 秒级时间戳，可选
    /**
     * @var string
     */
    public $updatedAt;

    // 处理失败时返回，包含 code / message
    /**
     * @var Error
     */
    public $error;

}
