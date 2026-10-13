<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryMcpAssetResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'assetType' => 'asset_type',
        'assetName' => 'asset_name',
        'trackIndexCode' => 'track_index_code',
        'trackIndexAbbr' => 'track_index_abbr',
        'sortOrder' => 'sort_order',
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
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }
        if (null !== $this->assetName) {
            $res['asset_name'] = $this->assetName;
        }
        if (null !== $this->trackIndexCode) {
            $res['track_index_code'] = $this->trackIndexCode;
        }
        if (null !== $this->trackIndexAbbr) {
            $res['track_index_abbr'] = $this->trackIndexAbbr;
        }
        if (null !== $this->sortOrder) {
            $res['sort_order'] = $this->sortOrder;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMcpAssetResponse
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
        if(isset($map['asset_type'])){
            $model->assetType = $map['asset_type'];
        }
        if(isset($map['asset_name'])){
            $model->assetName = $map['asset_name'];
        }
        if(isset($map['track_index_code'])){
            $model->trackIndexCode = $map['track_index_code'];
        }
        if(isset($map['track_index_abbr'])){
            $model->trackIndexAbbr = $map['track_index_abbr'];
        }
        if(isset($map['sort_order'])){
            $model->sortOrder = $map['sort_order'];
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

    // 资产类别
    /**
     * @var string
     */
    public $assetType;

    // 资产名称
    /**
     * @var string
     */
    public $assetName;

    // 跟踪指数代码
    /**
     * @var string
     */
    public $trackIndexCode;

    // 跟踪指数简称
    /**
     * @var string
     */
    public $trackIndexAbbr;

    // 排序
    /**
     * @var int
     */
    public $sortOrder;

}
