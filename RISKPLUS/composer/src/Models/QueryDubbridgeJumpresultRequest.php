<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeJumpresultRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo' => 'order_no',
        'jumpNo' => 'jump_no',
        'channelId' => 'channel_id',
        'extInfo' => 'ext_info',
    ];
    public function validate() {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('jumpNo', $this->jumpNo, true);
        Model::validateRequired('channelId', $this->channelId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->jumpNo) {
            $res['jump_no'] = $this->jumpNo;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDubbridgeJumpresultRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['jump_no'])){
            $model->jumpNo = $map['jump_no'];
        }
        if(isset($map['channel_id'])){
            $model->channelId = $map['channel_id'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
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

    // 请求唯一id
    /**
     * @var string
     */
    public $orderNo;

    // 跳端申请唯一流水号，一个流水号对应一个URL
    /**
     * @var string
     */
    public $jumpNo;

    // 合作方渠道标示,用于区分产品
    /**
     * @var string
     */
    public $channelId;

    // 拓展信息,json格式字符串
    /**
     * @var string
     */
    public $extInfo;

}
